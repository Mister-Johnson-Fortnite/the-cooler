
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.minecraftplus.client.renderer.StimulationWizardRenderer;
import net.mcreator.minecraftplus.client.renderer.SquirrelRenderer;
import net.mcreator.minecraftplus.client.renderer.SquirrelGunRenderer;
import net.mcreator.minecraftplus.client.renderer.MechaGoobertRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftPlusModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecraftPlusModEntities.MECHA_GOOBERT.get(), MechaGoobertRenderer::new);
		event.registerEntityRenderer(MinecraftPlusModEntities.STIMULATION_WIZARD.get(), StimulationWizardRenderer::new);
		event.registerEntityRenderer(MinecraftPlusModEntities.SLIME_GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftPlusModEntities.SQUIRREL.get(), SquirrelRenderer::new);
		event.registerEntityRenderer(MinecraftPlusModEntities.SQUIRREL_GUN.get(), SquirrelGunRenderer::new);
		event.registerEntityRenderer(MinecraftPlusModEntities.CRUSTY_GUN.get(), ThrownItemRenderer::new);
	}
}
