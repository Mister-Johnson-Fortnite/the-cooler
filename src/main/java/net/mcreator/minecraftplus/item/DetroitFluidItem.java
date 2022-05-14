
package net.mcreator.minecraftplus.item;

import net.minecraft.network.chat.Component;

public class DetroitFluidItem extends BucketItem {

	public DetroitFluidItem() {
		super(MinecraftPlusModFluids.DETROIT_FLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(MinecraftPlusModTabs.TAB_ILLUMINATED));
	}

}
