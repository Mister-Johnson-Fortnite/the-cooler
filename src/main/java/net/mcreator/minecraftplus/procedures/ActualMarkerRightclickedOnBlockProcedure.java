package net.mcreator.minecraftplus.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ActualMarkerRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minecraft_plus:dimtest")))) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("continue and your flesh will be lost."), (true));
		} else {
			if (Direction.UP == (entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getDirection())) {
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideX = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY() + 1;
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
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
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideX = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY() - 1;
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
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
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideX = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
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
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideX = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
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
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX() - 1;
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideX = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
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
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX() + 1;
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideX = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getZ();
					entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.markerBlockSideZ = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (world
					.isEmptyBlock(new BlockPos(
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ))
					|| (world.getBlockState(new BlockPos(
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ)))
							.is(BlockTags.create(new ResourceLocation("minecraft:replaceable_plants")))
					|| (world.getBlockState(new BlockPos(
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ)))
							.is(BlockTags.create(new ResourceLocation("minecraft:replaceable")))
					|| (world.getBlockState(new BlockPos(
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
							(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ)))
							.getBlock() instanceof LiquidBlock) {
				if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 0) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.BLACK_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 1) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.WHITE_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 2) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.ORANGE_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 3) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.MAGENTA_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 4) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.LIGHT_BLUE_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 5) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.YELLOW_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 6) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.LIME_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 7) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.PINK_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 8) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.GRAY_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 9) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.LIGHT_GRAY_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 10) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.CYAN_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 11) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.PURPLE_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 12) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.BLUE_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 13) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.BROWN_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 14) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.GREEN_BLOCK.get().defaultBlockState(), 3);
				} else if ((entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerColor == 15) {
					world.setBlock(
							new BlockPos(
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideX,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideY,
									(entity.getCapability(MinecraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MinecraftPlusModVariables.PlayerVariables())).markerBlockSideZ),
							MinecraftPlusModBlocks.RED_BLOCK.get().defaultBlockState(), 3);
				}
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 4);
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("It seems I thought ahead..."), (true));
			}
		}
	}
}
