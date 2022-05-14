
package net.mcreator.minecraftplus.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minecraftplus.procedures.LeanifiedOnEffectActiveTickProcedure;

public class LeanifiedMobEffect extends MobEffect {
	public LeanifiedMobEffect() {
		super(MobEffectCategory.HARMFUL, -3407668);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minecraft_plus.leanified";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		LeanifiedOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
