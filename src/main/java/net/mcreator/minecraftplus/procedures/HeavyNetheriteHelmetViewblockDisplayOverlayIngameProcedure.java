package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

public class HeavyNetheriteHelmetViewblockDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MinecraftPlusModVariables.PlayerVariables())).heavyhelmet == true) {
			return true;
		}
		return false;
	}
}
