
package net.mcreator.minecraftplus.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftplus.init.MinecraftPlusModTabs;

public class AsbestosItem extends Item {
	public AsbestosItem() {
		super(new Item.Properties().tab(MinecraftPlusModTabs.TAB_ILLUMINATED).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
