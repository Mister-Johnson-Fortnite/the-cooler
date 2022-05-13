
package net.mcreator.minecraftplus.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.minecraftplus.procedures.ActualMarkerRightclickedOnBlockProcedure;
import net.mcreator.minecraftplus.init.MinecraftPlusModTabs;

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
