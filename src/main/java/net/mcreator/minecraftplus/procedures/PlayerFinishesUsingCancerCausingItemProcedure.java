package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.minecraftplus.init.MinecraftPlusModMobEffects;

public class PlayerFinishesUsingCancerCausingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MinecraftPlusModMobEffects.CANCER.get(), 24000, 0, (false), (false)));
	}
}
