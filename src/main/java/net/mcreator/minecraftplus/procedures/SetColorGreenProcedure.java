package net.mcreator.minecraftplus.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetColorGreenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 14;
			entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.markerColor = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
