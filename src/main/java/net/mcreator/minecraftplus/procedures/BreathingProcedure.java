package net.mcreator.minecraftplus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BreathingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minecraft_plus:lamentable"))) == (entity.level.dimension())) {
			{
				double _setval = (entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).NeedToBreath - 1;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NeedToBreath = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MinecraftPlusModVariables.PlayerVariables())).NeedToBreath <= 0) {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("notbreath").bypassArmor(), 4);
			}
		} else {
			{
				double _setval = 100;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NeedToBreath = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
