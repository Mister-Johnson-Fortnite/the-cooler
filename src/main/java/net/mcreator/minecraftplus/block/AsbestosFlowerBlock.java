
package net.mcreator.minecraftplus.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.minecraftplus.procedures.AsbestosBlockEntityCollidesInTheBlockProcedure;
import net.mcreator.minecraftplus.init.MinecraftPlusModMobEffects;
import net.mcreator.minecraftplus.init.MinecraftPlusModBlocks;

public class AsbestosFlowerBlock extends FlowerBlock {
	public AsbestosFlowerBlock() {
		super(MinecraftPlusModMobEffects.CANCER.get(), 1000,
				BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS).instabreak());
	}

	@Override
	public int getEffectDuration() {
		return 1000;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		AsbestosBlockEntityCollidesInTheBlockProcedure.execute(entity);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(MinecraftPlusModBlocks.ASBESTOS_FLOWER.get(), renderType -> renderType == RenderType.cutout());
	}
}
