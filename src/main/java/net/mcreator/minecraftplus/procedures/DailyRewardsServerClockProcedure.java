package net.mcreator.minecraftplus.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;

import java.util.Calendar;

public class DailyRewardsServerClockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean gothrough = false;
		if (gothrough == false) {
			if (0 == Calendar.getInstance().get(Calendar.HOUR_OF_DAY) && 0 == Calendar.getInstance().get(Calendar.MINUTE)
					&& 0 == Calendar.getInstance().get(Calendar.SECOND)) {
				MinecraftPlusModVariables.MapVariables.get(world).gothrough = true;
				MinecraftPlusModVariables.MapVariables.get(world).syncData(world);
				{
					boolean _setval = true;
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DailyIsReady = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						MinecraftPlusModVariables.MapVariables.get(world).gothrough = false;
						MinecraftPlusModVariables.MapVariables.get(world).syncData(world);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 20);
			}
		}
	}
}
