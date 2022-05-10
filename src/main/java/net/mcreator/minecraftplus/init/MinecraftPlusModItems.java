
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecraftplus.item.SquirrelGunItem;
import net.mcreator.minecraftplus.item.SlimeGunItem;
import net.mcreator.minecraftplus.item.SaltineItem;
import net.mcreator.minecraftplus.item.RenameYourselfItem;
import net.mcreator.minecraftplus.item.PurpleStuffItem;
import net.mcreator.minecraftplus.item.NetheriteWaraxeItem;
import net.mcreator.minecraftplus.item.NetheriteCleaverItem;
import net.mcreator.minecraftplus.item.MothwingCloakItem;
import net.mcreator.minecraftplus.item.MarmrghItem;
import net.mcreator.minecraftplus.item.MODItem;
import net.mcreator.minecraftplus.item.HeavyNetheriteItem;
import net.mcreator.minecraftplus.item.HandheldDrillUnitItem;
import net.mcreator.minecraftplus.item.FunnyboxItem;
import net.mcreator.minecraftplus.item.EmeraldShardItem;
import net.mcreator.minecraftplus.item.EmeraldGildedNetheriteSwordItem;
import net.mcreator.minecraftplus.item.EmeraldGildedNetheriteShovelItem;
import net.mcreator.minecraftplus.item.EmeraldGildedNetheritePickaxeItem;
import net.mcreator.minecraftplus.item.EmeraldGildedNetheriteItem;
import net.mcreator.minecraftplus.item.EmeraldGildedNetheriteHoeItem;
import net.mcreator.minecraftplus.item.EmeraldGildedNetheriteAxeItem;
import net.mcreator.minecraftplus.item.DiamondGildedNetheriteSwordItem;
import net.mcreator.minecraftplus.item.DiamondGildedNetheriteShovelItem;
import net.mcreator.minecraftplus.item.DiamondGildedNetheritePickaxeItem;
import net.mcreator.minecraftplus.item.DiamondGildedNetheriteItem;
import net.mcreator.minecraftplus.item.DiamondGildedNetheriteHoeItem;
import net.mcreator.minecraftplus.item.DiamondGildedNetheriteAxeItem;
import net.mcreator.minecraftplus.item.DargleItem;
import net.mcreator.minecraftplus.item.BlueSlimeItem;
import net.mcreator.minecraftplus.item.AncientWarpKeyItem;
import net.mcreator.minecraftplus.MinecraftPlusMod;

public class MinecraftPlusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftPlusMod.MODID);
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_HELMET = REGISTRY.register("diamond_gilded_netherite_helmet",
			() -> new DiamondGildedNetheriteItem.Helmet());
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_CHESTPLATE = REGISTRY.register("diamond_gilded_netherite_chestplate",
			() -> new DiamondGildedNetheriteItem.Chestplate());
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_LEGGINGS = REGISTRY.register("diamond_gilded_netherite_leggings",
			() -> new DiamondGildedNetheriteItem.Leggings());
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_BOOTS = REGISTRY.register("diamond_gilded_netherite_boots",
			() -> new DiamondGildedNetheriteItem.Boots());
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_SWORD = REGISTRY.register("diamond_gilded_netherite_sword",
			() -> new DiamondGildedNetheriteSwordItem());
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_PICKAXE = REGISTRY.register("diamond_gilded_netherite_pickaxe",
			() -> new DiamondGildedNetheritePickaxeItem());
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_AXE = REGISTRY.register("diamond_gilded_netherite_axe",
			() -> new DiamondGildedNetheriteAxeItem());
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_SHOVEL = REGISTRY.register("diamond_gilded_netherite_shovel",
			() -> new DiamondGildedNetheriteShovelItem());
	public static final RegistryObject<Item> DIAMOND_GILDED_NETHERITE_HOE = REGISTRY.register("diamond_gilded_netherite_hoe",
			() -> new DiamondGildedNetheriteHoeItem());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_HELMET = REGISTRY.register("emerald_gilded_netherite_helmet",
			() -> new EmeraldGildedNetheriteItem.Helmet());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_CHESTPLATE = REGISTRY.register("emerald_gilded_netherite_chestplate",
			() -> new EmeraldGildedNetheriteItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_LEGGINGS = REGISTRY.register("emerald_gilded_netherite_leggings",
			() -> new EmeraldGildedNetheriteItem.Leggings());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_BOOTS = REGISTRY.register("emerald_gilded_netherite_boots",
			() -> new EmeraldGildedNetheriteItem.Boots());
	public static final RegistryObject<Item> EMERALD_SHARD = REGISTRY.register("emerald_shard", () -> new EmeraldShardItem());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_SWORD = REGISTRY.register("emerald_gilded_netherite_sword",
			() -> new EmeraldGildedNetheriteSwordItem());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_PICKAXE = REGISTRY.register("emerald_gilded_netherite_pickaxe",
			() -> new EmeraldGildedNetheritePickaxeItem());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_AXE = REGISTRY.register("emerald_gilded_netherite_axe",
			() -> new EmeraldGildedNetheriteAxeItem());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_SHOVEL = REGISTRY.register("emerald_gilded_netherite_shovel",
			() -> new EmeraldGildedNetheriteShovelItem());
	public static final RegistryObject<Item> EMERALD_GILDED_NETHERITE_HOE = REGISTRY.register("emerald_gilded_netherite_hoe",
			() -> new EmeraldGildedNetheriteHoeItem());
	public static final RegistryObject<Item> HANDHELD_DRILL_UNIT = REGISTRY.register("handheld_drill_unit", () -> new HandheldDrillUnitItem());
	public static final RegistryObject<Item> HEAVY_NETHERITE_HELMET = REGISTRY.register("heavy_netherite_helmet",
			() -> new HeavyNetheriteItem.Helmet());
	public static final RegistryObject<Item> HEAVY_NETHERITE_CHESTPLATE = REGISTRY.register("heavy_netherite_chestplate",
			() -> new HeavyNetheriteItem.Chestplate());
	public static final RegistryObject<Item> HEAVY_NETHERITE_LEGGINGS = REGISTRY.register("heavy_netherite_leggings",
			() -> new HeavyNetheriteItem.Leggings());
	public static final RegistryObject<Item> HEAVY_NETHERITE_BOOTS = REGISTRY.register("heavy_netherite_boots", () -> new HeavyNetheriteItem.Boots());
	public static final RegistryObject<Item> NETHERITE_CLEAVER = REGISTRY.register("netherite_cleaver", () -> new NetheriteCleaverItem());
	public static final RegistryObject<Item> NETHERITE_WARAXE = REGISTRY.register("netherite_waraxe", () -> new NetheriteWaraxeItem());
	public static final RegistryObject<Item> MECHA_GOOBERT = REGISTRY.register("mecha_goobert_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftPlusModEntities.MECHA_GOOBERT, -10066330, -13369549,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> STIMULATION_WIZARD = REGISTRY.register("stimulation_wizard_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftPlusModEntities.STIMULATION_WIZARD, -16777216, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> STICKY_RESIDUE = block(MinecraftPlusModBlocks.STICKY_RESIDUE, null);
	public static final RegistryObject<Item> SLIME_GUN = REGISTRY.register("slime_gun", () -> new SlimeGunItem());
	public static final RegistryObject<Item> SQUIRREL_GUN = REGISTRY.register("squirrel_gun", () -> new SquirrelGunItem());
	public static final RegistryObject<Item> MARMRGH = REGISTRY.register("marmrgh", () -> new MarmrghItem());
	public static final RegistryObject<Item> DARGLE = REGISTRY.register("dargle", () -> new DargleItem());
	public static final RegistryObject<Item> ANCIENT_TILE = block(MinecraftPlusModBlocks.ANCIENT_TILE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_PANEL = block(MinecraftPlusModBlocks.ANCIENT_PANEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_RUNE_PANEL = block(MinecraftPlusModBlocks.ANCIENT_RUNE_PANEL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_WARP_KEY = REGISTRY.register("ancient_warp_key", () -> new AncientWarpKeyItem());
	public static final RegistryObject<Item> ANCIENT_BRICKS = block(MinecraftPlusModBlocks.ANCIENT_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_LIGHT = block(MinecraftPlusModBlocks.ANCIENT_LIGHT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_TECH_BLOCK = block(MinecraftPlusModBlocks.ANCIENT_TECH_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_SCREEN = block(MinecraftPlusModBlocks.ANCIENT_SCREEN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FUNNYBOX = REGISTRY.register("funnybox", () -> new FunnyboxItem());
	public static final RegistryObject<Item> MOTHWING_CLOAK = REGISTRY.register("mothwing_cloak", () -> new MothwingCloakItem());
	public static final RegistryObject<Item> BLUE_SLIME = REGISTRY.register("blue_slime", () -> new BlueSlimeItem());
	public static final RegistryObject<Item> MOD = REGISTRY.register("mod", () -> new MODItem());
	public static final RegistryObject<Item> LIQUIDATIONIFICATION = block(MinecraftPlusModBlocks.LIQUIDATIONIFICATION,
			MinecraftPlusModTabs.TAB_ILLUMINATED);
	public static final RegistryObject<Item> RENAME_YOURSELF = REGISTRY.register("rename_yourself", () -> new RenameYourselfItem());
	public static final RegistryObject<Item> SALTINE = REGISTRY.register("saltine", () -> new SaltineItem());
	public static final RegistryObject<Item> PURPLE_STUFF_BUCKET = REGISTRY.register("purple_stuff_bucket", () -> new PurpleStuffItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
