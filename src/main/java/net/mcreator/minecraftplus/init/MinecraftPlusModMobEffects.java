
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.minecraftplus.potion.LeanifiedMobEffect;
import net.mcreator.minecraftplus.potion.CancerMobEffect;
import net.mcreator.minecraftplus.MinecraftPlusMod;

public class MinecraftPlusModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MinecraftPlusMod.MODID);
	public static final RegistryObject<MobEffect> CANCER = REGISTRY.register("cancer", () -> new CancerMobEffect());
	public static final RegistryObject<MobEffect> LEANIFIED = REGISTRY.register("leanified", () -> new LeanifiedMobEffect());
}
