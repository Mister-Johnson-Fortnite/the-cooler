package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

public class BreathingMeterDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minecraft_plus:lamentable"))) == (entity.level.dimension())) {
			return true;
		}
		return false;
	}
}
