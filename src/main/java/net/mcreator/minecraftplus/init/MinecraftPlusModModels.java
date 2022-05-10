
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.minecraftplus.client.model.Modelthe_garf;
import net.mcreator.minecraftplus.client.model.Modelstimwizard;
import net.mcreator.minecraftplus.client.model.Modelsquirrelball;
import net.mcreator.minecraftplus.client.model.Modelsquirrel;
import net.mcreator.minecraftplus.client.model.Modelgoobertmech;
import net.mcreator.minecraftplus.client.model.Modelemptymech;
import net.mcreator.minecraftplus.client.model.Modelcloaker1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MinecraftPlusModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsquirrel.LAYER_LOCATION, Modelsquirrel::createBodyLayer);
		event.registerLayerDefinition(Modelcloaker1.LAYER_LOCATION, Modelcloaker1::createBodyLayer);
		event.registerLayerDefinition(Modelstimwizard.LAYER_LOCATION, Modelstimwizard::createBodyLayer);
		event.registerLayerDefinition(Modelsquirrelball.LAYER_LOCATION, Modelsquirrelball::createBodyLayer);
		event.registerLayerDefinition(Modelemptymech.LAYER_LOCATION, Modelemptymech::createBodyLayer);
		event.registerLayerDefinition(Modelgoobertmech.LAYER_LOCATION, Modelgoobertmech::createBodyLayer);
		event.registerLayerDefinition(Modelthe_garf.LAYER_LOCATION, Modelthe_garf::createBodyLayer);
	}
}
