package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

public class BreatheOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 100;
			entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.NeedToBreath = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
