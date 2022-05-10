
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MinecraftPlusModTabs {
	public static CreativeModeTab TAB_ILLUMINATED;

	public static void load() {
		TAB_ILLUMINATED = new CreativeModeTab("tabilluminated") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinecraftPlusModBlocks.LIQUIDATIONIFICATION.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
