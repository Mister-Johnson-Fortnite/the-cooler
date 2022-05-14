package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.Entity;

public class SearingSandsEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
