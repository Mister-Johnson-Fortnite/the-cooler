
package net.mcreator.minecraftplus.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftplus.world.inventory.BecomeGarfedAndStuffMenu;
import net.mcreator.minecraftplus.procedures.PlayerFinishesUsingCancerCausingItemProcedure;
import net.mcreator.minecraftplus.MinecraftPlusMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BecomeGarfedAndStuffButtonMessage {
	private final int buttonID, x, y, z;

	public BecomeGarfedAndStuffButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BecomeGarfedAndStuffButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BecomeGarfedAndStuffButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BecomeGarfedAndStuffButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = BecomeGarfedAndStuffMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 2) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
		if (buttonID == 3) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
		if (buttonID == 4) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
		if (buttonID == 5) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
		if (buttonID == 6) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
		if (buttonID == 7) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
		if (buttonID == 8) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
		if (buttonID == 9) {

			PlayerFinishesUsingCancerCausingItemProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MinecraftPlusMod.addNetworkMessage(BecomeGarfedAndStuffButtonMessage.class, BecomeGarfedAndStuffButtonMessage::buffer,
				BecomeGarfedAndStuffButtonMessage::new, BecomeGarfedAndStuffButtonMessage::handler);
	}
}
