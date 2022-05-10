
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.minecraftplus.potion.DownedMobEffect;
import net.mcreator.minecraftplus.MinecraftPlusMod;

public class MinecraftPlusModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MinecraftPlusMod.MODID);
	public static final RegistryObject<MobEffect> DOWNED = REGISTRY.register("downed", () -> new DownedMobEffect());
}
