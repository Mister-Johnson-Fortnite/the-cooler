package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

public class RenameYourselfPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.yoinkitydoinkity = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
