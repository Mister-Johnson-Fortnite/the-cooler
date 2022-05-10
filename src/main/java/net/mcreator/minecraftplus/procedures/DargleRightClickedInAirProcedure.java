package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

public class DargleRightClickedInAirProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MinecraftPlusModVariables.PlayerVariables())).IsInTestDim == true) {
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
								.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerenteringx),
						((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerenteringy),
						((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerenteringz));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(
							((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerenteringx),
							((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerenteringy),
							((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).playerenteringz),
							_ent.getYRot(), _ent.getXRot());
			}
			{
				boolean _setval = false;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.IsInTestDim = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
