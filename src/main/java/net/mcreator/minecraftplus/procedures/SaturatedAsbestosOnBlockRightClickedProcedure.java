package net.mcreator.minecraftplus.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SaturatedAsbestosOnBlockRightClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minecraft_plus:lamentable"))) == (entity.level.dimension())) {
			if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
				ResourceKey<Level> destinationType = Level.OVERWORLD;
				if (_player.level.dimension() == destinationType)
					return;
				ServerLevel nextLevel = _player.server.getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(), nextLevel.getSharedSpawnPos().getY() + 1,
							nextLevel.getSharedSpawnPos().getZ(), _player.getYRot(), _player.getXRot());
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(
						((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerEnteringLamentableX),
						((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerEnteringLamentableY),
						((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerEnteringLamentableZ));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(
							((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerEnteringLamentableX),
							((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerEnteringLamentableY),
							((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerEnteringLamentableZ),
							_ent.getYRot(), _ent.getXRot());
			}
		} else {
			if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
					? _plr.getAdvancements()
							.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft_plus:obtain_soda")))
							.isDone()
					: false) {
				if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(
										_plr.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft_plus:become_leanified")))
								.isDone()
						: false) {
					if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
							? _plr.getAdvancements()
									.getOrStartProgress(_plr.server.getAdvancements()
											.getAdvancement(new ResourceLocation("minecraft_plus:obtain_exactly_37_jungle_logs")))
									.isDone()
							: false) {
						if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
								? _plr.getAdvancements()
										.getOrStartProgress(_plr.server.getAdvancements()
												.getAdvancement(new ResourceLocation("minecraft_plus:get_a_woodenpickaxe_to_1_durability")))
										.isDone()
								: false) {
							{
								double _setval = entity.getX();
								entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.playerEnteringLamentableX = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = entity.getY();
								entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.playerEnteringLamentableY = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = entity.getZ();
								entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.playerEnteringLamentableZ = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
								ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY,
										new ResourceLocation("minecraft_plus:lamentable"));
								if (_player.level.dimension() == destinationType)
									return;
								ServerLevel nextLevel = _player.server.getLevel(destinationType);
								if (nextLevel != null) {
									_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
									_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(), nextLevel.getSharedSpawnPos().getY() + 1,
											nextLevel.getSharedSpawnPos().getZ(), _player.getYRot(), _player.getXRot());
									_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
									for (MobEffectInstance _effectinstance : _player.getActiveEffects())
										_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
									_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null)
									_ent.getServer().getCommands().performCommand(
											_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
											"setblock ~ ~1 ~ air replace minecraft_plus:saturated_asbestos");
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null)
									_ent.getServer().getCommands().performCommand(
											_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
											"setblock ~ ~-1 ~ stone replace minecraft:air");
							}
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("Wooden pickaxe. Give it durability pain. Much durability pain."),
										(true));
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("37 tropical logs. No more. No less."), (true));
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Drink purple. Become entranced."), (true));
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Blue container. Obtain."), (true));
			}
		}
	}
}
