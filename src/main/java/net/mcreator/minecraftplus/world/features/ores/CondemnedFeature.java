
package net.mcreator.minecraftplus.world.features.ores;

public class CondemnedFeature extends OreFeature {

	public static CondemnedFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new CondemnedFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("minecraft_plus:condemned", FEATURE,
				new OreConfiguration(CondemnedFeatureRuleTest.INSTANCE, MinecraftPlusModBlocks.CONDEMNED.get().defaultBlockState(), 4));
		PLACED_FEATURE = PlacementUtils.register("minecraft_plus:condemned", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(8), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.NETHER, Level.OVERWORLD, Level.END);

	public CondemnedFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class CondemnedFeatureRuleTest extends RuleTest {

		static final CondemnedFeatureRuleTest INSTANCE = new CondemnedFeatureRuleTest();

		private static final com.mojang.serialization.Codec<CondemnedFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<CondemnedFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("minecraft_plus:condemned_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE, Blocks.END_STONE, Blocks.NETHERRACK);
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
