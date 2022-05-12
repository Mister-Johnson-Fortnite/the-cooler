
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.minecraftplus.world.features.plants.AsbestosFlowerFeature;
import net.mcreator.minecraftplus.world.features.ores.CondemnedFeature;
import net.mcreator.minecraftplus.world.features.lakes.PurpleStuffFeature;
import net.mcreator.minecraftplus.world.features.DavidsHouseFeature;
import net.mcreator.minecraftplus.MinecraftPlusMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MinecraftPlusModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MinecraftPlusMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> PURPLE_STUFF = register("purple_stuff", PurpleStuffFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, PurpleStuffFeature.GENERATE_BIOMES, PurpleStuffFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DAVIDS_HOUSE = register("davids_house", DavidsHouseFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, DavidsHouseFeature.GENERATE_BIOMES, DavidsHouseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CONDEMNED = register("condemned", CondemnedFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CondemnedFeature.GENERATE_BIOMES, CondemnedFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ASBESTOS_FLOWER = register("asbestos_flower", AsbestosFlowerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, AsbestosFlowerFeature.GENERATE_BIOMES,
					AsbestosFlowerFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
