
package net.mcreator.minecraftplus.potion;

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
