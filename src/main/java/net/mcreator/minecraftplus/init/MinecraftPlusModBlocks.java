
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

import net.mcreator.minecraftplus.block.StickyResidueBlock;
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

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			StickyResidueBlock.registerRenderLayer();
		}
	}
}
