
package net.mcreator.minecraftplus.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SaltineItem extends Item {

	public SaltineItem() {
		super(new Item.Properties().tab(MinecraftPlusModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0.3F;
	}

}
