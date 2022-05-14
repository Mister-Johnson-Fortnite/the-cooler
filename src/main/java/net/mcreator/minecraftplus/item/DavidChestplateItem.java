
package net.mcreator.minecraftplus.item;

import net.minecraft.sounds.SoundEvent;

public abstract class DavidChestplateItem extends ArmorItem {

	public DavidChestplateItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1024;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{0, 0, 1, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.death"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinecraftPlusModItems.DAVID.get()));
			}

			@Override
			public String getName() {
				return "david_chestplate";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DavidChestplateItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MinecraftPlusModTabs.TAB_ILLUMINATED).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("no more asbestos taste!"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minecraft_plus:textures/models/armor/davidset_layer_1.png";
		}

	}

	public static class Chestplate extends DavidChestplateItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MinecraftPlusModTabs.TAB_ILLUMINATED));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minecraft_plus:textures/models/armor/davidset_layer_1.png";
		}

	}

}
