
package net.mcreator.minecraftplus.fluid;

public abstract class PurpleStuffFluid extends ForgeFlowingFluid {

	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(MinecraftPlusModFluids.PURPLE_STUFF,
			MinecraftPlusModFluids.FLOWING_PURPLE_STUFF,
			FluidAttributes
					.builder(new ResourceLocation("minecraft_plus:blocks/minion_of_the_void"),
							new ResourceLocation("minecraft_plus:blocks/inscryption-1"))

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.fill_success"))))
			.explosionResistance(100f)

			.tickRate(1)

			.bucket(MinecraftPlusModItems.PURPLE_STUFF_BUCKET).block(() -> (LiquidBlock) MinecraftPlusModBlocks.PURPLE_STUFF.get());

	private PurpleStuffFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-5);
	}

	public static class Source extends PurpleStuffFluid {
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

	public static class Flowing extends PurpleStuffFluid {
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
