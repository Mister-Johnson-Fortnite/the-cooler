
package net.mcreator.minecraftplus.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DetroitFluidBlock extends LiquidBlock {
	public DetroitFluidBlock() {
		super(() -> (FlowingFluid) MinecraftPlusModFluids.DETROIT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}