
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftplus.entity.StimulationWizardEntity;
import net.mcreator.minecraftplus.entity.SquirrelGunEntity;
import net.mcreator.minecraftplus.entity.SquirrelEntity;
import net.mcreator.minecraftplus.entity.SlimeGunEntity;
import net.mcreator.minecraftplus.entity.MechaGoobertEntity;
import net.mcreator.minecraftplus.MinecraftPlusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftPlusModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MinecraftPlusMod.MODID);
	public static final RegistryObject<EntityType<MechaGoobertEntity>> MECHA_GOOBERT = register("mecha_goobert",
			EntityType.Builder.<MechaGoobertEntity>of(MechaGoobertEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MechaGoobertEntity::new).fireImmune().sized(2f, 2.5f));
	public static final RegistryObject<EntityType<StimulationWizardEntity>> STIMULATION_WIZARD = register("stimulation_wizard",
			EntityType.Builder.<StimulationWizardEntity>of(StimulationWizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StimulationWizardEntity::new).fireImmune()
					.sized(0.6f, 3.3000000000000003f));
	public static final RegistryObject<EntityType<SlimeGunEntity>> SLIME_GUN = register("projectile_slime_gun",
			EntityType.Builder.<SlimeGunEntity>of(SlimeGunEntity::new, MobCategory.MISC).setCustomClientFactory(SlimeGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SquirrelEntity>> SQUIRREL = register("squirrel",
			EntityType.Builder.<SquirrelEntity>of(SquirrelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SquirrelEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<SquirrelGunEntity>> SQUIRREL_GUN = register("projectile_squirrel_gun",
			EntityType.Builder.<SquirrelGunEntity>of(SquirrelGunEntity::new, MobCategory.MISC).setCustomClientFactory(SquirrelGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DashhitEntity>> DASHHIT = register("projectile_dashhit",
			EntityType.Builder.<DashhitEntity>of(DashhitEntity::new, MobCategory.MISC).setCustomClientFactory(DashhitEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TheGarfEntity>> THE_GARF = register("the_garf",
			EntityType.Builder.<TheGarfEntity>of(TheGarfEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TheGarfEntity::new)

					.sized(10f, 10f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MechaGoobertEntity.init();
			StimulationWizardEntity.init();
			SquirrelEntity.init();
			TheGarfEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MECHA_GOOBERT.get(), MechaGoobertEntity.createAttributes().build());
		event.put(STIMULATION_WIZARD.get(), StimulationWizardEntity.createAttributes().build());
		event.put(SQUIRREL.get(), SquirrelEntity.createAttributes().build());
		event.put(THE_GARF.get(), TheGarfEntity.createAttributes().build());
	}
}
