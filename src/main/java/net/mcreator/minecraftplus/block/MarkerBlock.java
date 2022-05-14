
package net.mcreator.minecraftplus.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MarkerBlock extends FlowerBlock {
	public MarkerBlock() {
		super(MobEffects.DIG_SLOWDOWN, 100, BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.BAMBOO).instabreak());
	}

	@Override
	public int getEffectDuration() {
		return 100;
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
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MinecraftPlusModItems.DELETED_MOD_ELEMENT.get()));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {

		return

		groundState.is(MinecraftPlusModBlocks.CONDEMNED.get()) || groundState.is(MinecraftPlusModBlocks.LIQUIDATIONIFICATION.get())
				|| groundState.is(MinecraftPlusModItems.DELETED_MOD_ELEMENT.get())

		;
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);

		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(MinecraftPlusModBlocks.MARKER.get(), renderType -> renderType == RenderType.cutout());
	}

}
