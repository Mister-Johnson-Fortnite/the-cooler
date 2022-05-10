package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class MechaGoobertEntityFallsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + -0.5), 0));
		} else {
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + -10), 0));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 999, (false), (false)));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.NONE);
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + -10), 0));
		}
	}
}
