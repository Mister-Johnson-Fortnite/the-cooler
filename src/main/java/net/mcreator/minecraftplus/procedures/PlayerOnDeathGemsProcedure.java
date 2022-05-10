package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

public class PlayerOnDeathGemsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MinecraftPlusModVariables.PlayerVariables())).GemCount <= 10000) {
			{
				double _setval = (entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).GemCount - 5000;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GemCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("You lost 5000 gems for dying!"), (false));
		} else {
			{
				double _setval = (entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).GemCount * 0.5;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GemCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("You lost half of your gems for dying!"), (false));
		}
	}
}
