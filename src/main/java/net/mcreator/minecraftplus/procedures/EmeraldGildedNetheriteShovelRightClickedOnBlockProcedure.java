package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class EmeraldGildedNetheriteShovelRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT) {
			{
				BlockPos _bp = new BlockPos(x + 1, y, z);
				BlockState _bs = Blocks.DIRT_PATH.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT) {
			{
				BlockPos _bp = new BlockPos(x - 1, y, z);
				BlockState _bs = Blocks.DIRT_PATH.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT) {
			{
				BlockPos _bp = new BlockPos(x, y, z + 1);
				BlockState _bs = Blocks.DIRT_PATH.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT) {
			{
				BlockPos _bp = new BlockPos(x, y, z - 1);
				BlockState _bs = Blocks.DIRT_PATH.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.DIRT) {
			{
				BlockPos _bp = new BlockPos(x + 1, y, z + 1);
				BlockState _bs = Blocks.DIRT_PATH.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.DIRT) {
			{
				BlockPos _bp = new BlockPos(x - 1, y, z + 1);
				BlockState _bs = Blocks.DIRT_PATH.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.DIRT) {
			{
				BlockPos _bp = new BlockPos(x + 1, y, z - 1);
				BlockState _bs = Blocks.DIRT_PATH.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.DIRT) {
			{
				BlockPos _bp = new BlockPos(x - 1, y, z - 1);
				BlockState _bs = Blocks.DIRT_PATH.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
