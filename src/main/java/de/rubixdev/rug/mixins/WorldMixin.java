package de.rubixdev.rug.mixins;

import carpet.fakes.WorldInterface;
import de.rubixdev.rug.RugSettings;
import de.rubixdev.rug.util.FluidHelper;

import net.minecraft.block.entity.BlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.Entity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

@Mixin(value = World.class, priority = 1010)
public abstract class WorldMixin {
    @Shadow
    public abstract BlockState getBlockState(BlockPos pos);

    @Shadow
    public abstract boolean setBlockState(BlockPos pos, BlockState state, int flags, int maxUpdateDepth);

    private boolean shouldOverwrite;
    private boolean lowerWasFirst;

    @Inject(method = "breakBlock", at = @At("HEAD"))
    private void testForBlock(
        BlockPos pos,
        boolean drop,
        Entity breakingEntity,
        int maxUpdateDepth,
        CallbackInfoReturnable<Boolean> cir
    ) {
        BlockState blockState = this.getBlockState(pos);

        boolean isUpperHalf = isTallPlant(blockState) && blockState.get(TallPlantBlock.HALF) == DoubleBlockHalf.UPPER;
        boolean lowerWasFirst = this.lowerWasFirst;
        this.lowerWasFirst = false;

        shouldOverwrite = isUpperHalf && lowerWasFirst && RugSettings.tallPlantNoUpdate;
    }

    @ModifyConstant(method = "breakBlock", constant = @Constant(intValue = 3))
    private int overwriteFlags(int original) {
        return shouldOverwrite ? 18 : original;
    }

    @Inject(method = "removeBlock", at = @At("HEAD"))
    private void saveIsCalled(BlockPos pos, boolean move, CallbackInfoReturnable<Boolean> cir) {
        BlockState blockState = this.getBlockState(pos);
        if (isTallPlant(blockState) && blockState.get(TallPlantBlock.HALF) == DoubleBlockHalf.LOWER) {
            lowerWasFirst = true;
        }
    }

    private boolean isTallPlant(BlockState blockState) {
        return blockState.isIn(BlockTags.TALL_FLOWERS)
            || blockState.isOf(Blocks.TALL_GRASS)
            || blockState.isOf(Blocks.LARGE_FERN);
    }

    @Inject(
        method = "setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;II)Z",
        at = @At("HEAD"),
        cancellable = true
    )
    private void convertBasalt(
        BlockPos pos,
        BlockState state,
        int flags,
        int maxUpdateDepth,
        CallbackInfoReturnable<Boolean> cir
    ) {
        if (state.isOf(Blocks.BASALT)) {
            BlockState prevState = ( (BlockView) this ).getBlockState(pos);
            if (FluidHelper.shouldConvertToLava((BlockView) this, pos)) {
                if (prevState.isOf(Blocks.LAVA) && prevState.getFluidState().isStill()) {
                    cir.setReturnValue(false);
                    return;
                }

                FluidHelper.playFizzleSound((WorldAccess) this, pos);
                ( (WorldAccess) this ).playSound(
                    null,
                    pos,
                    SoundEvents.ITEM_BUCKET_EMPTY_LAVA,
                    SoundCategory.BLOCKS,
                    1.0F,
                    1.0F
                );
                cir.setReturnValue(this.setBlockState(pos, Blocks.LAVA.getDefaultState(), flags, maxUpdateDepth));
            }
        }
    }

    @SuppressWarnings({"MixinAnnotationTarget", "UnresolvedMixinReference"})
    @Inject(method = "setBlockStateWithBlockEntity", at = @At("HEAD"), cancellable = true, remap = false)
    private void convertBasalt(
        BlockPos pos,
        BlockState state,
        BlockEntity newBlockEntity,
        int flags,
        CallbackInfoReturnable<Boolean> cir
    ) {
        if (state.isOf(Blocks.BASALT)) {
            if (FluidHelper.shouldConvertToLava((BlockView) this, pos)) {
                FluidHelper.playFizzleSound((WorldAccess) this, pos);
                ( (WorldAccess) this ).playSound(
                    null,
                    pos,
                    SoundEvents.ITEM_BUCKET_EMPTY_LAVA,
                    SoundCategory.BLOCKS,
                    1.0F,
                    1.0F
                );
                cir.setReturnValue(
                        ((WorldInterface) (this)).setBlockStateWithBlockEntity(pos, Blocks.LAVA.getDefaultState(), newBlockEntity, flags)
                );
            }
        }
    }
}
