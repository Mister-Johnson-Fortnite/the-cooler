
package net.mcreator.minecraftplus.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PurpleStuffBlock extends LiquidBlock {
	public PurpleStuffBlock() {
		super(() -> (FlowingFluid) MinecraftPlusModFluids.PURPLE_STUFF.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}