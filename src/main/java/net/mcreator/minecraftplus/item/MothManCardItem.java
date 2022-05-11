
package net.mcreator.minecraftplus.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.minecraftplus.procedures.MothManCardPlayerFinishesUsingItemProcedure;
import net.mcreator.minecraftplus.init.MinecraftPlusModTabs;

public class MothManCardItem extends Item {
	public MothManCardItem() {
		super(new Item.Properties().tab(MinecraftPlusModTabs.TAB_ILLUMINATED).stacksTo(17).fireResistant().rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0.3f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MothManCardPlayerFinishesUsingItemProcedure.execute(world, x, y, z);
		return retval;
	}
}
