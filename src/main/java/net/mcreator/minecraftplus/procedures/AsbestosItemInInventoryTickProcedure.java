package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class AsbestosItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (1 == Math.round(Math.random() * 200)) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("cancer").bypassArmor(), 1);
		}
	}
}
