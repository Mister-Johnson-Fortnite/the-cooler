package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftplus.init.MinecraftPlusModBlocks;

public class SlimeGunProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState clickedBlock = Blocks.AIR.defaultBlockState();
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x + 1, y, z), MinecraftPlusModBlocks.STICKY_RESIDUE.get().defaultBlockState(), 3);
		} else {
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x - 1, y, z), MinecraftPlusModBlocks.STICKY_RESIDUE.get().defaultBlockState(), 3);
			} else {
				if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x, y, z + 1), MinecraftPlusModBlocks.STICKY_RESIDUE.get().defaultBlockState(), 3);
				} else {
					if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y, z - 1), MinecraftPlusModBlocks.STICKY_RESIDUE.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
