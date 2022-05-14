
package net.mcreator.minecraftplus.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ActualMarkerItem extends Item {

	public ActualMarkerItem() {
		super(new Item.Properties().tab(MinecraftPlusModTabs.TAB_ILLUMINATED).durability(1561).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		ActualMarkerRightclickedOnBlockProcedure.execute(context.getLevel(), context.getPlayer(), context.getItemInHand());
		return retval;
	}

}