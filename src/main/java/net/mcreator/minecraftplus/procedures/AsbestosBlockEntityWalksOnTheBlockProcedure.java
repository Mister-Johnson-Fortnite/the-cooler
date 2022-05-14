package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

public class AsbestosBlockEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MinecraftPlusModVariables.PlayerVariables())).isImmuneToAsbestos) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("cancer").bypassArmor(), 1);
		}
	}
}
