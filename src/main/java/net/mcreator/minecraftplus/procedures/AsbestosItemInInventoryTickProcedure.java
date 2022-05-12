package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;

import java.util.Random;

public class AsbestosItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (1 == Mth.nextInt(new Random(), 1, 100)) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("cancer").bypassArmor(), 1);
		}
	}
}
