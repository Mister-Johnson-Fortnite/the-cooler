
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.minecraftplus.client.gui.MODGuiScreen;
import net.mcreator.minecraftplus.client.gui.DumbGuiScreen;
import net.mcreator.minecraftplus.client.gui.BecomeGarfedAndStuffScreen;
import net.mcreator.minecraftplus.client.gui.ActiveAbilitiesMODScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftPlusModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MinecraftPlusModMenus.MOD_GUI, MODGuiScreen::new);
			MenuScreens.register(MinecraftPlusModMenus.ACTIVE_ABILITIES_MOD, ActiveAbilitiesMODScreen::new);
			MenuScreens.register(MinecraftPlusModMenus.BECOME_GARFED_AND_STUFF, BecomeGarfedAndStuffScreen::new);
			MenuScreens.register(MinecraftPlusModMenus.DUMB_GUI, DumbGuiScreen::new);
		});
	}
}
