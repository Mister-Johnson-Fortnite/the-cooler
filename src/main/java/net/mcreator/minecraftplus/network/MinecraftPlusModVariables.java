package net.mcreator.minecraftplus.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.minecraftplus.MinecraftPlusMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftPlusModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		MinecraftPlusMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new,
				SavedDataSyncMessage::handler);
		MinecraftPlusMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.playerenteringx = original.playerenteringx;
			clone.playerenteringz = original.playerenteringz;
			clone.playerenteringy = original.playerenteringy;
			clone.IsInTestDim = original.IsInTestDim;
			clone.IsPlayerOnAdventure = original.IsPlayerOnAdventure;
			clone.GemCount = original.GemCount;
			clone.DailyIsReady = original.DailyIsReady;
			clone.IsPlayerOnGround = original.IsPlayerOnGround;
			clone.CanDash = original.CanDash;
			clone.yoinkitydoinkity = original.yoinkitydoinkity;
			clone.playerEnteringLamentableX = original.playerEnteringLamentableX;
			clone.playerEnteringLamentableY = original.playerEnteringLamentableY;
			clone.playerEnteringLamentableZ = original.playerEnteringLamentableZ;
			clone.markerColor = original.markerColor;
			clone.isImmuneToAsbestos = original.isImmuneToAsbestos;
			clone.markerBlockSideZ = original.markerBlockSideZ;
			clone.markerBlockSideX = original.markerBlockSideX;
			clone.markerBlockSideY = original.markerBlockSideY;
			clone.ModMaxPassives = original.ModMaxPassives;
			clone.ModPassivesUsed = original.ModPassivesUsed;
			if (!event.isWasDeath()) {
				clone.heavyhelmet = original.heavyhelmet;
				clone.NeedToBreath = original.NeedToBreath;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					MinecraftPlusMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					MinecraftPlusMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					MinecraftPlusMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "minecraft_plus_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				MinecraftPlusMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "minecraft_plus_mapvars";
		public boolean gothrough = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			gothrough = nbt.getBoolean("gothrough");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("gothrough", gothrough);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				MinecraftPlusMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e),
						MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("minecraft_plus", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean heavyhelmet = false;
		public double playerenteringx = 0;
		public double playerenteringz = 0;
		public double playerenteringy = 0;
		public boolean IsInTestDim = false;
		public boolean IsPlayerOnAdventure = false;
		public double GemCount = 0;
		public boolean DailyIsReady = false;
		public boolean IsPlayerOnGround = false;
		public boolean CanDash = false;
		public boolean yoinkitydoinkity = true;
		public double playerEnteringLamentableX = 0;
		public double playerEnteringLamentableY = 0;
		public double playerEnteringLamentableZ = 0;
		public double markerColor = 0;
		public boolean isImmuneToAsbestos = false;
		public double markerBlockSideZ = 0;
		public double markerBlockSideX = 0;
		public double markerBlockSideY = 0;
		public double NeedToBreath = 100.0;
		public double ModMaxPassives = 0;
		public double ModPassivesUsed = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				MinecraftPlusMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("heavyhelmet", heavyhelmet);
			nbt.putDouble("playerenteringx", playerenteringx);
			nbt.putDouble("playerenteringz", playerenteringz);
			nbt.putDouble("playerenteringy", playerenteringy);
			nbt.putBoolean("IsInTestDim", IsInTestDim);
			nbt.putBoolean("IsPlayerOnAdventure", IsPlayerOnAdventure);
			nbt.putDouble("GemCount", GemCount);
			nbt.putBoolean("DailyIsReady", DailyIsReady);
			nbt.putBoolean("IsPlayerOnGround", IsPlayerOnGround);
			nbt.putBoolean("CanDash", CanDash);
			nbt.putBoolean("yoinkitydoinkity", yoinkitydoinkity);
			nbt.putDouble("playerEnteringLamentableX", playerEnteringLamentableX);
			nbt.putDouble("playerEnteringLamentableY", playerEnteringLamentableY);
			nbt.putDouble("playerEnteringLamentableZ", playerEnteringLamentableZ);
			nbt.putDouble("markerColor", markerColor);
			nbt.putBoolean("isImmuneToAsbestos", isImmuneToAsbestos);
			nbt.putDouble("markerBlockSideZ", markerBlockSideZ);
			nbt.putDouble("markerBlockSideX", markerBlockSideX);
			nbt.putDouble("markerBlockSideY", markerBlockSideY);
			nbt.putDouble("NeedToBreath", NeedToBreath);
			nbt.putDouble("ModMaxPassives", ModMaxPassives);
			nbt.putDouble("ModPassivesUsed", ModPassivesUsed);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			heavyhelmet = nbt.getBoolean("heavyhelmet");
			playerenteringx = nbt.getDouble("playerenteringx");
			playerenteringz = nbt.getDouble("playerenteringz");
			playerenteringy = nbt.getDouble("playerenteringy");
			IsInTestDim = nbt.getBoolean("IsInTestDim");
			IsPlayerOnAdventure = nbt.getBoolean("IsPlayerOnAdventure");
			GemCount = nbt.getDouble("GemCount");
			DailyIsReady = nbt.getBoolean("DailyIsReady");
			IsPlayerOnGround = nbt.getBoolean("IsPlayerOnGround");
			CanDash = nbt.getBoolean("CanDash");
			yoinkitydoinkity = nbt.getBoolean("yoinkitydoinkity");
			playerEnteringLamentableX = nbt.getDouble("playerEnteringLamentableX");
			playerEnteringLamentableY = nbt.getDouble("playerEnteringLamentableY");
			playerEnteringLamentableZ = nbt.getDouble("playerEnteringLamentableZ");
			markerColor = nbt.getDouble("markerColor");
			isImmuneToAsbestos = nbt.getBoolean("isImmuneToAsbestos");
			markerBlockSideZ = nbt.getDouble("markerBlockSideZ");
			markerBlockSideX = nbt.getDouble("markerBlockSideX");
			markerBlockSideY = nbt.getDouble("markerBlockSideY");
			NeedToBreath = nbt.getDouble("NeedToBreath");
			ModMaxPassives = nbt.getDouble("ModMaxPassives");
			ModPassivesUsed = nbt.getDouble("ModPassivesUsed");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.heavyhelmet = message.data.heavyhelmet;
					variables.playerenteringx = message.data.playerenteringx;
					variables.playerenteringz = message.data.playerenteringz;
					variables.playerenteringy = message.data.playerenteringy;
					variables.IsInTestDim = message.data.IsInTestDim;
					variables.IsPlayerOnAdventure = message.data.IsPlayerOnAdventure;
					variables.GemCount = message.data.GemCount;
					variables.DailyIsReady = message.data.DailyIsReady;
					variables.IsPlayerOnGround = message.data.IsPlayerOnGround;
					variables.CanDash = message.data.CanDash;
					variables.yoinkitydoinkity = message.data.yoinkitydoinkity;
					variables.playerEnteringLamentableX = message.data.playerEnteringLamentableX;
					variables.playerEnteringLamentableY = message.data.playerEnteringLamentableY;
					variables.playerEnteringLamentableZ = message.data.playerEnteringLamentableZ;
					variables.markerColor = message.data.markerColor;
					variables.isImmuneToAsbestos = message.data.isImmuneToAsbestos;
					variables.markerBlockSideZ = message.data.markerBlockSideZ;
					variables.markerBlockSideX = message.data.markerBlockSideX;
					variables.markerBlockSideY = message.data.markerBlockSideY;
					variables.NeedToBreath = message.data.NeedToBreath;
					variables.ModMaxPassives = message.data.ModMaxPassives;
					variables.ModPassivesUsed = message.data.ModPassivesUsed;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
