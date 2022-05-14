
package net.mcreator.minecraftplus.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.minecraftplus.procedures.BreathingMeterDisplayOverlayIngameProcedure;
import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class BreathingMeterOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}
			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			if (BreathingMeterDisplayOverlayIngameProcedure.execute(entity)) {
				Minecraft.getInstance().font
						.draw(event.getMatrixStack(),
								"" + ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MinecraftPlusModVariables.PlayerVariables())).NeedToBreath) + "/100",
								posX + -213, posY + 110, -3407668);
			}
		}
	}
}
