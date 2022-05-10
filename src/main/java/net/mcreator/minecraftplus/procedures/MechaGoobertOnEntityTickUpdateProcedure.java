package net.mcreator.minecraftplus.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.minecraftplus.init.MinecraftPlusModEntities;
import net.mcreator.minecraftplus.entity.StimulationWizardEntity;

public class MechaGoobertOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean stimulation = false;
		if (200 >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (Math.random() < 0.005) {
				if (entity.isOnGround()) {
					entity.setDeltaMovement(new Vec3(0, 3, 0));
				}
			}
		}
		if (150 >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (Math.random() < 0.001) {
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent("Arrggh! The pain is too much to bear alone!"), ChatType.SYSTEM,
								Util.NIL_UUID);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new StimulationWizardEntity(MinecraftPlusModEntities.STIMULATION_WIZARD.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 3, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (25 >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 3, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1, (int) 0.5, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 2, (false), (false)));
		}
	}
}
