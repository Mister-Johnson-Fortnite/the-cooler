
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.minecraftplus.fluid.PurpleStuffFluid;
import net.mcreator.minecraftplus.fluid.DetroitFluidFluid;
import net.mcreator.minecraftplus.MinecraftPlusMod;

public class MinecraftPlusModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, MinecraftPlusMod.MODID);
	public static final RegistryObject<Fluid> PURPLE_STUFF = REGISTRY.register("purple_stuff", () -> new PurpleStuffFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_PURPLE_STUFF = REGISTRY.register("flowing_purple_stuff", () -> new PurpleStuffFluid.Flowing());
	public static final RegistryObject<Fluid> DETROIT_FLUID = REGISTRY.register("detroit_fluid", () -> new DetroitFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_DETROIT_FLUID = REGISTRY.register("flowing_detroit_fluid",
			() -> new DetroitFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PURPLE_STUFF.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PURPLE_STUFF.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(DETROIT_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DETROIT_FLUID.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
