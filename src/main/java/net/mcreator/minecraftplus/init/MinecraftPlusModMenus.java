
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.minecraftplus.world.inventory.MarkerColorSelectMenuMenu;
import net.mcreator.minecraftplus.world.inventory.MODPassivesMenu1Menu;
import net.mcreator.minecraftplus.world.inventory.MODGuiMenu;
import net.mcreator.minecraftplus.world.inventory.BecomeGarfedAndStuffMenu;
import net.mcreator.minecraftplus.world.inventory.ActiveAbilitiesMODMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftPlusModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<MODGuiMenu> MOD_GUI = register("mod_gui", (id, inv, extraData) -> new MODGuiMenu(id, inv, extraData));
	public static final MenuType<ActiveAbilitiesMODMenu> ACTIVE_ABILITIES_MOD = register("active_abilities_mod",
			(id, inv, extraData) -> new ActiveAbilitiesMODMenu(id, inv, extraData));
	public static final MenuType<BecomeGarfedAndStuffMenu> BECOME_GARFED_AND_STUFF = register("become_garfed_and_stuff",
			(id, inv, extraData) -> new BecomeGarfedAndStuffMenu(id, inv, extraData));
	public static final MenuType<MarkerColorSelectMenuMenu> MARKER_COLOR_SELECT_MENU = register("marker_color_select_menu",
			(id, inv, extraData) -> new MarkerColorSelectMenuMenu(id, inv, extraData));
	public static final MenuType<MODPassivesMenu1Menu> MOD_PASSIVES_MENU_1 = register("mod_passives_menu_1",
			(id, inv, extraData) -> new MODPassivesMenu1Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
