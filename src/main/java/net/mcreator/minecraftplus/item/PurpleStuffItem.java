
package net.mcreator.minecraftplus.item;

import net.minecraft.network.chat.Component;

public class PurpleStuffItem extends BucketItem {

	public PurpleStuffItem() {
		super(MinecraftPlusModFluids.PURPLE_STUFF,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(MinecraftPlusModTabs.TAB_ILLUMINATED));
	}

}
