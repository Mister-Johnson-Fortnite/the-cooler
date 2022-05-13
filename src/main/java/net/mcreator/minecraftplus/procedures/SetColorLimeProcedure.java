package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

public class SetColorLimeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 6;
			entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.markerColor = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
