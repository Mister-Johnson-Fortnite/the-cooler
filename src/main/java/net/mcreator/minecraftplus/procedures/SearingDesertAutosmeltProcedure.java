package net.mcreator.minecraftplus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SearingDesertAutosmeltProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (new ResourceLocation("minecraft_plus:searing_sands_biome")
				.equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName()) == true) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.RAW_IRON_BLOCK) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.5);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.RAW_GOLD_BLOCK) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.GOLD_BLOCK.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.5);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COBBLESTONE) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.STONE.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.5);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SAND) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.GLASS.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.5);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COBBLED_DEEPSLATE) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.DEEPSLATE.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.5);
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.STONE_BRICKS) {
				if (Math.random() < 0.5) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x, y, z), Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.5);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_BRICKS) {
				if (Math.random() < 0.5) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x, y, z), Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.5);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_TILES) {
				if (Math.random() < 0.5) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x, y, z), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.5);
				}
			}
		}
	}
}
