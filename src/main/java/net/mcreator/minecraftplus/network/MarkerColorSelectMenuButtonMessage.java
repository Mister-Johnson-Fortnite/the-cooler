
package net.mcreator.minecraftplus.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftplus.world.inventory.MarkerColorSelectMenuMenu;
import net.mcreator.minecraftplus.procedures.SetColorYellowProcedure;
import net.mcreator.minecraftplus.procedures.SetColorWhiteProcedure;
import net.mcreator.minecraftplus.procedures.SetColorRedProcedure;
import net.mcreator.minecraftplus.procedures.SetColorPurpleProcedure;
import net.mcreator.minecraftplus.procedures.SetColorPinkProcedure;
import net.mcreator.minecraftplus.procedures.SetColorOrangeProcedure;
import net.mcreator.minecraftplus.procedures.SetColorMagentaProcedure;
import net.mcreator.minecraftplus.procedures.SetColorLimeProcedure;
import net.mcreator.minecraftplus.procedures.SetColorLightGrayProcedure;
import net.mcreator.minecraftplus.procedures.SetColorLightBlueProcedure;
import net.mcreator.minecraftplus.procedures.SetColorGreenProcedure;
import net.mcreator.minecraftplus.procedures.SetColorGrayProcedure;
import net.mcreator.minecraftplus.procedures.SetColorCyanProcedure;
import net.mcreator.minecraftplus.procedures.SetColorBrownProcedure;
import net.mcreator.minecraftplus.procedures.SetColorBlueProcedure;
import net.mcreator.minecraftplus.procedures.SetColorBlackProcedure;
import net.mcreator.minecraftplus.procedures.PlayerFinishesUsingCancerCausingItemProcedure;
import net.mcreator.minecraftplus.MinecraftPlusMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MarkerColorSelectMenuButtonMessage {
	private final int buttonID, x, y, z;

	public MarkerColorSelectMenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MarkerColorSelectMenuButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MarkerColorSelectMenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MarkerColorSelectMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = MarkerColorSelectMenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SetColorBlackProcedure.execute(entity);
		}
		if (buttonID == 1) {

			SetColorWhiteProcedure.execute(entity);
		}
		if (buttonID == 2) {

			SetColorOrangeProcedure.execute(entity);
		}
		if (buttonID == 3) {

			SetColorMagentaProcedure.execute(entity);
		}
		if (buttonID == 4) {

			SetColorLightBlueProcedure.execute(entity);
		}
		if (buttonID == 5) {

			SetColorYellowProcedure.execute(entity);
		}
		if (buttonID == 6) {

			SetColorLimeProcedure.execute(entity);
		}
		if (buttonID == 7) {

			SetColorPinkProcedure.execute(entity);
		}
		if (buttonID == 8) {

			SetColorGrayProcedure.execute(entity);
		}
		if (buttonID == 9) {

			SetColorLightGrayProcedure.execute(entity);
		}
		if (buttonID == 10) {

			SetColorCyanProcedure.execute(entity);
		}
		if (buttonID == 11) {

			SetColorPurpleProcedure.execute(entity);
		}
		if (buttonID == 12) {

			SetColorBlueProcedure.execute(entity);
		}
		if (buttonID == 13) {

			SetColorBrownProcedure.execute(entity);
		}
		if (buttonID == 14) {

			SetColorGreenProcedure.execute(entity);
		}
		if (buttonID == 15) {

			SetColorRedProcedure.execute(entity);
		}
		if (buttonID == 16) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MinecraftPlusMod.addNetworkMessage(MarkerColorSelectMenuButtonMessage.class, MarkerColorSelectMenuButtonMessage::buffer,
				MarkerColorSelectMenuButtonMessage::new, MarkerColorSelectMenuButtonMessage::handler);
	}
}
