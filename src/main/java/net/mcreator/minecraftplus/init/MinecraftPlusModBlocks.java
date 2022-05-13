
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftplus.block.YellowBlockBlock;
import net.mcreator.minecraftplus.block.WhiteBlockBlock;
import net.mcreator.minecraftplus.block.StickyResidueBlock;
import net.mcreator.minecraftplus.block.SaturatedAsbestosBlock;
import net.mcreator.minecraftplus.block.RedBlockBlock;
import net.mcreator.minecraftplus.block.PurpleStuffBlock;
import net.mcreator.minecraftplus.block.PurpleBlockBlock;
import net.mcreator.minecraftplus.block.PinkBlockBlock;
import net.mcreator.minecraftplus.block.OrangeBlockBlock;
import net.mcreator.minecraftplus.block.MarkerBlock;
import net.mcreator.minecraftplus.block.MagentaBlockBlock;
import net.mcreator.minecraftplus.block.LiquidationificationBlock;
import net.mcreator.minecraftplus.block.LimeBlockBlock;
import net.mcreator.minecraftplus.block.LightGrayBlockBlock;
import net.mcreator.minecraftplus.block.LightBlueBlockBlock;
import net.mcreator.minecraftplus.block.GreenBlockBlock;
import net.mcreator.minecraftplus.block.GrayBlockBlock;
import net.mcreator.minecraftplus.block.CyanBlockBlock;
import net.mcreator.minecraftplus.block.CondemnedBlock;
import net.mcreator.minecraftplus.block.BrownBlockBlock;
import net.mcreator.minecraftplus.block.BlueBlockBlock;
import net.mcreator.minecraftplus.block.BlackBlockBlock;
import net.mcreator.minecraftplus.block.BerryBlock;
import net.mcreator.minecraftplus.block.AsbestosFlowerBlock;
import net.mcreator.minecraftplus.block.AsbestosBlockBlock;
import net.mcreator.minecraftplus.block.AncientTileBlock;
import net.mcreator.minecraftplus.block.AncientTechBlockBlock;
import net.mcreator.minecraftplus.block.AncientScreenBlock;
import net.mcreator.minecraftplus.block.AncientRunePanelBlock;
import net.mcreator.minecraftplus.block.AncientPanelBlock;
import net.mcreator.minecraftplus.block.AncientLightBlock;
import net.mcreator.minecraftplus.block.AncientBricksBlock;
import net.mcreator.minecraftplus.MinecraftPlusMod;

public class MinecraftPlusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftPlusMod.MODID);
	public static final RegistryObject<Block> STICKY_RESIDUE = REGISTRY.register("sticky_residue", () -> new StickyResidueBlock());
	public static final RegistryObject<Block> ANCIENT_TILE = REGISTRY.register("ancient_tile", () -> new AncientTileBlock());
	public static final RegistryObject<Block> ANCIENT_PANEL = REGISTRY.register("ancient_panel", () -> new AncientPanelBlock());
	public static final RegistryObject<Block> ANCIENT_RUNE_PANEL = REGISTRY.register("ancient_rune_panel", () -> new AncientRunePanelBlock());
	public static final RegistryObject<Block> ANCIENT_BRICKS = REGISTRY.register("ancient_bricks", () -> new AncientBricksBlock());
	public static final RegistryObject<Block> ANCIENT_LIGHT = REGISTRY.register("ancient_light", () -> new AncientLightBlock());
	public static final RegistryObject<Block> ANCIENT_TECH_BLOCK = REGISTRY.register("ancient_tech_block", () -> new AncientTechBlockBlock());
	public static final RegistryObject<Block> ANCIENT_SCREEN = REGISTRY.register("ancient_screen", () -> new AncientScreenBlock());
	public static final RegistryObject<Block> LIQUIDATIONIFICATION = REGISTRY.register("liquidationification", () -> new LiquidationificationBlock());
	public static final RegistryObject<Block> PURPLE_STUFF = REGISTRY.register("purple_stuff", () -> new PurpleStuffBlock());
	public static final RegistryObject<Block> CONDEMNED = REGISTRY.register("condemned", () -> new CondemnedBlock());
	public static final RegistryObject<Block> ASBESTOS_BLOCK = REGISTRY.register("asbestos_block", () -> new AsbestosBlockBlock());
	public static final RegistryObject<Block> ASBESTOS_FLOWER = REGISTRY.register("asbestos_flower", () -> new AsbestosFlowerBlock());
	public static final RegistryObject<Block> SATURATED_ASBESTOS = REGISTRY.register("saturated_asbestos", () -> new SaturatedAsbestosBlock());
	public static final RegistryObject<Block> BERRY = REGISTRY.register("berry", () -> new BerryBlock());
	public static final RegistryObject<Block> MARKER = REGISTRY.register("marker", () -> new MarkerBlock());
	public static final RegistryObject<Block> RED_BLOCK = REGISTRY.register("red_block", () -> new RedBlockBlock());
	public static final RegistryObject<Block> BLACK_BLOCK = REGISTRY.register("black_block", () -> new BlackBlockBlock());
	public static final RegistryObject<Block> WHITE_BLOCK = REGISTRY.register("white_block", () -> new WhiteBlockBlock());
	public static final RegistryObject<Block> ORANGE_BLOCK = REGISTRY.register("orange_block", () -> new OrangeBlockBlock());
	public static final RegistryObject<Block> YELLOW_BLOCK = REGISTRY.register("yellow_block", () -> new YellowBlockBlock());
	public static final RegistryObject<Block> LIME_BLOCK = REGISTRY.register("lime_block", () -> new LimeBlockBlock());
	public static final RegistryObject<Block> BLUE_BLOCK = REGISTRY.register("blue_block", () -> new BlueBlockBlock());
	public static final RegistryObject<Block> PURPLE_BLOCK = REGISTRY.register("purple_block", () -> new PurpleBlockBlock());
	public static final RegistryObject<Block> MAGENTA_BLOCK = REGISTRY.register("magenta_block", () -> new MagentaBlockBlock());
	public static final RegistryObject<Block> PINK_BLOCK = REGISTRY.register("pink_block", () -> new PinkBlockBlock());
	public static final RegistryObject<Block> BROWN_BLOCK = REGISTRY.register("brown_block", () -> new BrownBlockBlock());
	public static final RegistryObject<Block> GRAY_BLOCK = REGISTRY.register("gray_block", () -> new GrayBlockBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_BLOCK = REGISTRY.register("light_gray_block", () -> new LightGrayBlockBlock());
	public static final RegistryObject<Block> GREEN_BLOCK = REGISTRY.register("green_block", () -> new GreenBlockBlock());
	public static final RegistryObject<Block> CYAN_BLOCK = REGISTRY.register("cyan_block", () -> new CyanBlockBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_BLOCK = REGISTRY.register("light_blue_block", () -> new LightBlueBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			StickyResidueBlock.registerRenderLayer();
			AsbestosFlowerBlock.registerRenderLayer();
			BerryBlock.registerRenderLayer();
			MarkerBlock.registerRenderLayer();
		}
	}
}
