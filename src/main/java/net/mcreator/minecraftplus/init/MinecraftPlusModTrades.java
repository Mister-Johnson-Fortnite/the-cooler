
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.minecraftplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MinecraftPlusModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.DIORITE_WALL, 17), new ItemStack(Blocks.STONE_STAIRS, 27),
					new ItemStack(MinecraftPlusModItems.RENAME_YOURSELF.get()), 1, 0, 0f));
			trades.get(5).add(new BasicItemListing(new ItemStack(Blocks.DIORITE_WALL, 16), new ItemStack(Blocks.STONE_STAIRS, 26),
					new ItemStack(MinecraftPlusModItems.RENAME_YOURSELF.get()), 100, 0, 0f));
		}
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.JUNGLE_TRAPDOOR, 3),

					new ItemStack(MinecraftPlusModItems.RENAME_YOURSELF.get()), 1, 0, 0f));
		}
	}
}
