
package net.mcreator.minecraftplus.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minecraftplus.procedures.CancerEffectStartedappliedProcedure;
import net.mcreator.minecraftplus.procedures.CancerEffectExpiresProcedure;

public class CancerMobEffect extends MobEffect {
	public CancerMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711936);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minecraft_plus.cancer";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		CancerEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CancerEffectExpiresProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
