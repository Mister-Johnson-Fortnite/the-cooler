package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftplus.network.MinecraftPlusModVariables;
import net.mcreator.minecraftplus.init.MinecraftPlusModItems;
import net.mcreator.minecraftplus.init.MinecraftPlusModBlocks;

import java.util.Random;

public class ActualMarkerRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Direction.UP == (entity.level.clip(new ClipContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getDirection())) {
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getX();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getY() + 1;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getZ();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Direction.DOWN == (entity.level.clip(new ClipContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getDirection())) {
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getX();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getY() - 1;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getZ();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Direction.NORTH == (entity.level.clip(new ClipContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getDirection())) {
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getX();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getY();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getZ() - 1;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Direction.SOUTH == (entity.level.clip(new ClipContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getDirection())) {
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getX();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getY();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getZ() + 1;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Direction.WEST == (entity.level.clip(new ClipContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getDirection())) {
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getX() - 1;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getY();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getZ();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Direction.EAST == (entity.level.clip(new ClipContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getDirection())) {
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getX() + 1;
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getY();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getZ();
				entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.markerBlockSideZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (world.isEmptyBlock(new BlockPos(
				(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
				(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
				(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ))) {
			world.setBlock(
					new BlockPos(
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
					MinecraftPlusModBlocks.RED_BLOCK.get().defaultBlockState(), 3);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("It seems I thought ahead..."), (true));
		}
		if (MinecraftPlusModItems.ACTUAL_MARKER.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem()) {
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (MinecraftPlusModItems.ACTUAL_MARKER.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
				.getItem()) {
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("You win... this time."), (true));
		}
	}
}
