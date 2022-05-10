package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

public class GetdailyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MinecraftPlusModVariables.PlayerVariables())).DailyIsReady == true) {
			{
				boolean _setval = false;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DailyIsReady = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 50 + (entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).GemCount;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GemCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (Math.random() < 0.5) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Here's your daily 50 gems!"), (false));
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Take some gems! Thanks for playing!"), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(
								"Sorry, either you've already claimed your daily bonus, or something has gone horribly, catastrophically wrong."),
						(false));
		}
	}
}
