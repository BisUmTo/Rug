# List of Rules in the EXPERIMENTAL Category

For a list of all implemented Rules go [here](../README.md)
## Index
Count: 33
- [anvilledBlueIce](#anvilledblueice)
- [anvilledIce](#anvilledice)
- [anvilledPackedIce](#anvilledpackedice)
- [basaltToBlackstoneConversion](#basalttoblackstoneconversion)
- [campSleeping](#campsleeping)
- [concreteMixing](#concretemixing)
- [dragonEggConvertsCobbleToEndstone](#dragoneggconvertscobbletoendstone)
- [dragonXpDrop](#dragonxpdrop)
- [easyHarvesting](#easyharvesting)
- [edibleGoldIngots](#ediblegoldingots)
- [edibleMagmaCream](#ediblemagmacream)
- [edibleNetheriteScraps](#ediblenetheritescraps)
- [edibleSlimeBalls](#edibleslimeballs)
- [eggWaterDrag](#eggwaterdrag)
- [enderPearlWaterDrag](#enderpearlwaterdrag)
- [foodInstantHeal](#foodinstantheal)
- [honeyCombStickiness](#honeycombstickiness)
- [infinityNeedsArrow](#infinityneedsarrow)
- [kelpBlockHardness](#kelpblockhardness)
- [longerRepeaters](#longerrepeaters)
- [maxBannerLayers](#maxbannerlayers)
- [moreFortressSpawningBlocks](#morefortressspawningblocks)
- [netherrackGeneration](#netherrackgeneration)
- [peacefulHunger](#peacefulhunger)
- [reachDistance](#reachdistance)
- [silkTouchBuddingAmethysts](#silktouchbuddingamethysts)
- [silkTouchFarmland](#silktouchfarmland)
- [silkTouchPathBlocks](#silktouchpathblocks)
- [silkTouchSpawners](#silktouchspawners)
- [slimeChunkPercentage](#slimechunkpercentage)
- [snowballWaterDrag](#snowballwaterdrag)
- [tallPlantNoUpdate](#tallplantnoupdate)
- [zeroTickPlants](#zerotickplants)

## Rules in EXPERIMENTAL Category

### anvilledBlueIce
Custom amount of packed ice crushed by falling anvils make one blue ice.
- Type: `int`
- Default value: `0`
- Suggested options: `0`, `4`, `9`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`
- Additional notes:
  - You must choose a value from 0 to 32
  - From [QuickCarpet](https://github.com/DeadlyMC/QuickCarpet114)

### anvilledIce
Custom amount of frosted ice crushed by falling anvils make one ice. Allows for new type of ice farm.
- Type: `int`
- Default value: `0`
- Suggested options: `0`, `4`, `9`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`
- Additional notes:
  - You must choose a value from 0 to 32
  - From [QuickCarpet](https://github.com/DeadlyMC/QuickCarpet114)

### anvilledPackedIce
Custom amount of ice crushed by falling anvils make one packed ice.
- Type: `int`
- Default value: `0`
- Suggested options: `0`, `4`, `9`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`
- Additional notes:
  - You must choose a value from 0 to 32
  - From [QuickCarpet](https://github.com/DeadlyMC/QuickCarpet114)

### basaltToBlackstoneConversion
Basalt converts to Blackstone if next to both Lava and Water
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RENEWABLE`, `RUG`, `SURVIVAL`

### campSleeping
Allows players to sleep in a Bed without setting their spawn point by entering while sneaking. Requires the main hand to be empty
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`

### concreteMixing
Sand falling on Gravel (or the other way around) with a Concrete Block below will blend to Concrete Powder colored like the Concrete Block below

In combination with cobbleCrushing and gravelCrushing allows for an automatic Concrete generator
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`

### dragonEggConvertsCobbleToEndstone
Dragon Eggs will convert Cobble under them to Endstone either on set event
- Type: `String`
- Default value: `off`
- Required options: `off`, `on_teleport`, `on_landing`, `both`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RENEWABLE`, `RUG`

### dragonXpDrop
Amount of XP dropped by later Dragons. The first Dragon always drops 12000
- Type: `int`
- Default value: `500`
- Suggested options: `500`, `1200`, `12000`
- Categories: `EXPERIMENTAL`, `RUG`, `SURVIVAL`
- Additional notes:
  - You must choose a value from 0 to 12000
  - [Idea from Neubulae](https://github.com/gnembon/carpet-extra/issues/171)

### easyHarvesting
Right clicking on fully grown crops harvests and immediately replants it

Works on: Wheat, Potatoes, Carrots, Beetroots, Nether Warts and Cocoa Beans
- Type: `String`
- Default value: `off`
- Required options: `off`, `normal`, `require_hoe`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`

### edibleGoldIngots
Butter is finally edible. Keep in mind 250g of pure butter are not that healthy

Works server side only, but eating animation is only rendered if the mod is on the client too
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `CLIENT`, `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`
- Additional notes:
  - [AppleSkin](https://www.curseforge.com/minecraft/mc-mods/appleskin) always shows this item as edible with Rug installed on client, as described in [#19](https://github.com/RubixDev/Rug/issues/19)

### edibleMagmaCream
Magma Cream is edible and gives 10 seconds of Fire Resistance

Works server side only, but eating animation is only rendered if the mod is on the client too
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `CLIENT`, `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`
- Additional notes:
  - [AppleSkin](https://www.curseforge.com/minecraft/mc-mods/appleskin) always shows this item as edible with Rug installed on client, as described in [#19](https://github.com/RubixDev/Rug/issues/19)

### edibleNetheriteScraps
Makes Netherite Scraps edible, because, let's be honest, they kinda look like chocolate

Works server side only, but eating animation is only rendered if the mod is on the client too
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `CLIENT`, `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`
- Additional notes:
  - [AppleSkin](https://www.curseforge.com/minecraft/mc-mods/appleskin) always shows this item as edible with Rug installed on client, as described in [#19](https://github.com/RubixDev/Rug/issues/19)

### edibleSlimeBalls
Slime Balls are edible and give Jump Boost and Slowness

Works server side only, but eating animation is only rendered if the mod is on the client too
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `CLIENT`, `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`
- Additional notes:
  - [AppleSkin](https://www.curseforge.com/minecraft/mc-mods/appleskin) always shows this item as edible with Rug installed on client, as described in [#19](https://github.com/RubixDev/Rug/issues/19)

### eggWaterDrag
How fast thrown Eggs can travel under water. 0.99 is the default for above water and for Tridents

Thrown Egg will stutter on client when mod is only on server
- Type: `double`
- Default value: `0.8`
- Suggested options: `0.8`, `0.9`, `0.99`
- Categories: `CLIENT`, `EXPERIMENTAL`, `RUG`
- Additional notes:
  - You must choose a value from 0.5 to 0.99

### enderPearlWaterDrag
How fast thrown Ender Pearls can travel under water. 0.99 is the default for above water and for Tridents

Thrown Pearl will stutter on client when mod is only on server
- Type: `double`
- Default value: `0.8`
- Suggested options: `0.8`, `0.9`, `0.99`
- Categories: `CLIENT`, `EXPERIMENTAL`, `RUG`
- Additional notes:
  - You must choose a value from 0.5 to 0.99

### foodInstantHeal
Food heals hearts not hunger like in the first MC versions and naturalRegeneration is off

Recommended using with peacefulHunger
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`
- Additional notes:
  - Suggestion by [real_zockerhopper](https://www.curseforge.com/members/real_zockerhopper)

### honeyCombStickiness
Honey Comb only sticks to selected Blocks

Will render Ghost Blocks on the Client when mod is only Server Side
- Type: `String`
- Default value: `both`
- Required options: `both`, `honey`, `slime`, `none`
- Categories: `CLIENT`, `EXPERIMENTAL`, `FEATURE`, `RUG`
- Additional notes:
  - [Idea from DragonEggBedrockBreaking#0034](https://discord.com/channels/211786369951989762/573613501164159016/816793720011358208) on the [SciCraft Discord](https://discord.gg/scicraft)

### infinityNeedsArrow
A Bow enchanted with Infinity needs the player to have an arrow in their inventory
- Type: `boolean`
- Default value: `true`
- Required options: `true`, `false`
- Categories: `BUGFIX`, `EXPERIMENTAL`, `RUG`, `SURVIVAL`

### kelpBlockHardness
How long Kelp Blocks take to mine in survival

Any value other than 0 will behave like 0.5 for clients without this mod
- Type: `double`
- Default value: `0.5`
- Suggested options: `0.0`, `0.25`, `0.5`
- Categories: `CLIENT`, `EXPERIMENTAL`, `RUG`, `SURVIVAL`
- Additional notes:
  - You must choose a value from 0 to 0.5

### longerRepeaters
Repeaters on top of Redstone Blocks multiply their delay by set amount
- Type: `int`
- Default value: `1`
- Required options: `1`, `2`, `3`, `4`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`

### maxBannerLayers
Maximum number of layers, that can be applied to a banner

This only works for clients with this mod installed and the Banner tooltips never show more than 6 layers
- Type: `int`
- Default value: `6`
- Suggested options: `3`, `6`, `10`, `12`
- Categories: `CLIENT`, `CRAFTING`, `EXPERIMENTAL`, `RUG`, `SURVIVAL`
- Additional notes:
  - You must choose a value from 3 to 16
  - [Idea from SouthernPixel](https://github.com/gnembon/carpet-extra/issues/111)

### moreFortressSpawningBlocks
What blocks Fortress mobs can spawn on inside the bigger Bounding Box

off: nether bricks only / more: (red) nether bricks, netherrack, soul sand/soil, packed/blue ice, gravel, magma blocks / all: all
- Type: `String`
- Default value: `off`
- Required options: `off`, `more`, `all`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`
- Additional notes:
  - [Idea from DragonEggBedrockBreaking](https://github.com/gnembon/carpet-extra/issues/182)

### netherrackGeneration
Netherrack is generated instead of Cobblestone if a Magma Block is below
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RENEWABLE`, `RUG`, `SURVIVAL`

### peacefulHunger
Players do not lose any hunger like in peaceful mode
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`
- Additional notes:
  - Suggestion by [real_zockerhopper](https://www.curseforge.com/members/real_zockerhopper)

### reachDistance
Reach in which you can place and break blocks. Value will be 0.5 higher in creative

Mod needed on server and client for this feature to work
- Type: `double`
- Default value: `4.5`
- Suggested options: `0.0`, `4.5`, `5.0`, `10.0`
- Categories: `CLIENT`, `CREATIVE`, `EXPERIMENTAL`, `RUG`
- Additional notes:
  - You must choose a value from 0 to 100
  - Is disabled when [reach-entity-attributes](https://github.com/JamiesWhiteShirt/reach-entity-attributes) is installed

### silkTouchBuddingAmethysts
Mining Budding Amethysts with a Silk Touch tool will drop itself
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`

### silkTouchFarmland
Mining Farmland with a Silk Touch tool will drop itself
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`

### silkTouchPathBlocks
Mining Path Blocks with a Silk Touch tool will drop itself
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`

### silkTouchSpawners
Mining Spawners with a Silk Touch tool will drop itself
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `FEATURE`, `RUG`, `SURVIVAL`

### slimeChunkPercentage
The percentage of chunks that are Slime chinks
- Type: `int`
- Default value: `10`
- Suggested options: `0`, `10`, `50`, `100`
- Categories: `EXPERIMENTAL`, `RUG`
- Additional notes:
  - You must choose a value from 0 to 100 that is a multiple of 10
  - [Idea from Philipp766](https://github.com/gnembon/carpet-extra/issues/161)

### snowballWaterDrag
How fast thrown Snowballs can travel under water. 0.99 is the default for above water and for Tridents

Thrown Snowball will stutter on client when mod is only on server
- Type: `double`
- Default value: `0.8`
- Suggested options: `0.8`, `0.9`, `0.99`
- Categories: `CLIENT`, `EXPERIMENTAL`, `RUG`
- Additional notes:
  - You must choose a value from 0.5 to 0.99

### tallPlantNoUpdate
Tall Plants do not update blocks around the top part if the bottom half got broken

Old Bug: MC-31038
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `RUG`
- Additional notes:
  - [Idea from DragonEggBedrockBreaking](https://github.com/gnembon/carpet-extra/issues/185)

### zeroTickPlants
Brings back the ability to force grow certain plants using 0-ticks
- Type: `boolean`
- Default value: `false`
- Required options: `true`, `false`
- Categories: `EXPERIMENTAL`, `RUG`
