package de.rubixdev.rug.mixins;

import org.spongepowered.asm.mixin.Mixin;

import de.rubixdev.rug.RugSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PointedDripstoneBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Mixin(PointedDripstoneBlock.class)
public class PointedDripstoneBlockMixin extends Block {
    public PointedDripstoneBlockMixin(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (RugSettings.stalagmiteSteppingDamage > 0) {
            entity.damage(DamageSource.GENERIC, RugSettings.stalagmiteSteppingDamage);
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
