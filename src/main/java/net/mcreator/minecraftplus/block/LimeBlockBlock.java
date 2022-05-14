
package net.mcreator.minecraftplus.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LimeBlockBlock extends Block {

	public LimeBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.SCAFFOLDING).instabreak().noDrops());

	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
		return context.getItemInHand().getItem() != this.asItem();
	}

}
