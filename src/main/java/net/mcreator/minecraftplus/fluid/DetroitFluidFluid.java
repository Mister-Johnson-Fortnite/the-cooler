
package net.mcreator.minecraftplus.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftplus.init.MinecraftPlusModItems;
import net.mcreator.minecraftplus.init.MinecraftPlusModFluids;
import net.mcreator.minecraftplus.init.MinecraftPlusModBlocks;

public abstract class DetroitFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(MinecraftPlusModFluids.DETROIT_FLUID,
			MinecraftPlusModFluids.FLOWING_DETROIT_FLUID, FluidAttributes.builder(new ResourceLocation("minecraft_plus:blocks/blacktextureface"),
					new ResourceLocation("minecraft_plus:blocks/blacktextureface"))

	).explosionResistance(100f).canMultiply()

			.bucket(MinecraftPlusModItems.DETROIT_FLUID_BUCKET).block(() -> (LiquidBlock) MinecraftPlusModBlocks.DETROIT_FLUID.get());

	private DetroitFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends DetroitFluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DetroitFluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
