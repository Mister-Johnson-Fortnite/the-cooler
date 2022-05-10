package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;
import net.mcreator.minecraftplus.init.MinecraftPlusModItems;

public class DashOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MinecraftPlusModVariables.PlayerVariables())).CanDash == true) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(MinecraftPlusModItems.MOTHWING_CLOAK.get()))
					: false) {
				entity.setDeltaMovement(new Vec3(Math.sin(Math.toRadians(entity.getYRot() + 180)), Math.sin(Math.toRadians(0 - entity.getXRot())),
						Math.cos(Math.toRadians(entity.getYRot()))));
			}
		}
		if ((entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/smelt_iron"))).isDone()
				: false) == true) {
			if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MinecraftPlusModVariables.PlayerVariables())).CanDash == true) {
				entity.setDeltaMovement(new Vec3(Math.sin(Math.toRadians(entity.getYRot() + 180)), Math.sin(Math.toRadians(0 - entity.getXRot())),
						Math.cos(Math.toRadians(entity.getYRot()))));
			}
		}
	}
}
