
package net.mcreator.minecraftplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.minecraftplus.init.MinecraftPlusModTabs;
import net.mcreator.minecraftplus.init.MinecraftPlusModFluids;

public class PurpleStuffItem extends BucketItem {
	public PurpleStuffItem() {
		super(MinecraftPlusModFluids.PURPLE_STUFF,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(MinecraftPlusModTabs.TAB_ILLUMINATED));
	}
}
