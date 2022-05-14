
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.minecraftplus.network.MarkerColorMenuMessage;
import net.mcreator.minecraftplus.network.DashMessage;
import net.mcreator.minecraftplus.network.BreatheMessage;
import net.mcreator.minecraftplus.MinecraftPlusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MinecraftPlusModKeyMappings {
	public static final KeyMapping DASH = new KeyMapping("key.minecraft_plus.dash", GLFW.GLFW_KEY_V, "key.categories.movement");
	public static final KeyMapping BREATHE = new KeyMapping("key.minecraft_plus.breathe", GLFW.GLFW_KEY_Z, "key.categories.breathing");
	public static final KeyMapping MARKER_COLOR_MENU = new KeyMapping("key.minecraft_plus.marker_color_menu", GLFW.GLFW_KEY_C, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(DASH);
		ClientRegistry.registerKeyBinding(BREATHE);
		ClientRegistry.registerKeyBinding(MARKER_COLOR_MENU);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == DASH.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MinecraftPlusMod.PACKET_HANDLER.sendToServer(new DashMessage(0, 0));
						DashMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == BREATHE.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BreatheMessage(0, 0));
						BreatheMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == MARKER_COLOR_MENU.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorMenuMessage(0, 0));
						MarkerColorMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
