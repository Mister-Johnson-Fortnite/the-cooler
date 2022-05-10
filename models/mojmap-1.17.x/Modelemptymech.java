// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelemptymech<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "emptymech"), "main");
	private final ModelPart leg2;
	private final ModelPart leg1;
	private final ModelPart body;
	private final ModelPart bone;

	public Modelemptymech(ModelPart root) {
		this.leg2 = root.getChild("leg2");
		this.leg1 = root.getChild("leg1");
		this.body = root.getChild("body");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(142, 111)
						.addBox(18.0F, -6.0F, -2.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 93)
						.addBox(13.0F, 2.0F, -8.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(103, 29)
						.addBox(11.0F, 12.0F, -10.0F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-30.0F, 6.0F, 4.0F));

		PartDefinition cube_r1 = leg2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(132, 25).addBox(-3.0F, -6.5F, 3.0F, 6.0F, 11.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, 5.4282F, 1.5359F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leg2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 135).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 13.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -3.5F, 1.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(48, 144)
						.addBox(11.0F, -6.0F, -2.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(142, 59)
						.addBox(13.0F, 2.0F, -8.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(113, 111)
						.addBox(11.0F, 12.0F, -10.0F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 4.0F));

		PartDefinition cube_r3 = leg1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(141, 130).addBox(-3.0F, -6.5F, 3.0F, 6.0F, 11.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, 5.4282F, 1.5359F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leg1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(24, 141).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 13.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -3.5F, 1.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(63, 51)
						.addBox(-11.0F, -18.0F, -8.5F, 22.0F, 9.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-17.0F, -36.0F, -11.0F, 34.0F, 18.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(70, 111)
						.addBox(-12.0F, -31.0F, -15.0F, 24.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(139, 73)
						.addBox(17.0F, -34.0F, -2.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 111)
						.addBox(-18.0F, -34.0F, -2.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(23, 120)
						.addBox(19.0F, -13.0F, -30.0F, 4.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 111)
						.addBox(-23.0F, -13.0F, -30.0F, 4.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(87, 42)
						.addBox(20.0F, -8.0F, -27.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(63, 51)
						.addBox(-22.0F, -8.0F, -27.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(20.0F, -15.0F, -29.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-22.0F, -15.0F, -29.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(63, 42)
						.addBox(11.0F, -10.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 84)
						.addBox(-13.0F, -10.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(92, 13)
						.addBox(-1.0F, -10.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(0.0F, -9.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(12.0F, -9.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-12.0F, -9.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -27.0F, 13.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 70)
						.addBox(-43.0F, -4.0F, 2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(-1.0F, -4.0F, 2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -7.0F, -20.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(61, 123)
						.addBox(-43.0F, -13.5F, -12.0F, 6.0F, 19.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(89, 123)
						.addBox(-1.0F, -13.5F, -12.0F, 6.0F, 19.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.2F, -22.5718F, -9.0931F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-45.0F, -6.0F, 2.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(117, 130)
						.addBox(-3.0F, -6.0F, 2.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -26.2525F, -1.54F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(46, 120)
						.addBox(-42.2F, -17.5F, 9.629F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(126, 59)
						.addBox(-0.2F, -17.5F, 9.629F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.2F, -23.5F, -16.629F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 70)
						.addBox(-11.0F, -9.0F, -15.0F, 22.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(88, 79)
						.addBox(-11.0F, 13.0F, -9.0F, 22.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, -5.0F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(92, 0)
						.addBox(-11.0F, 0.0F, 3.0F, 22.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(91, 98)
						.addBox(-11.0F, -2.0F, -3.0F, 22.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, -5.0F, 2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 84).addBox(-4.5F, -3.5F, -9.0F, 4.0F, 9.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -13.5F, 1.0F, 0.0F, 0.0F, 2.4871F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(26, 93).addBox(2.0F, -4.5F, -9.0F, 4.0F, 9.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -13.5F, 1.0F, 0.0F, 0.0F, -2.4871F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 42)
				.addBox(-11.0F, -9.0F, -8.5F, 22.0F, 9.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leg2.render(poseStack, buffer, packedLight, packedOverlay);
		leg1.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		bone.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.body.xRot = headPitch / (180F / (float) Math.PI);
	}
}