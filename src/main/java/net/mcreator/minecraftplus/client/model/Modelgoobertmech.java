package net.mcreator.minecraftplus.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgoobertmech<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("minecraft_plus", "modelgoobertmech"),
			"main");
	public final ModelPart thatonebit;
	public final ModelPart leg2;
	public final ModelPart leg1;
	public final ModelPart body;

	public Modelgoobertmech(ModelPart root) {
		this.thatonebit = root.getChild("thatonebit");
		this.leg2 = root.getChild("leg2");
		this.leg1 = root.getChild("leg1");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition thatonebit = partdefinition.addOrReplaceChild("thatonebit",
				CubeListBuilder.create().texOffs(0, 42).addBox(-11.0F, -9.0F, -8.5F, 22.0F, 9.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(142, 111).addBox(-12.0F, -4.0F, -2.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 93)
						.addBox(-17.0F, 4.0F, -8.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(103, 29)
						.addBox(-19.0F, 14.0F, -10.0F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 4.0F));
		PartDefinition cube_r1 = leg2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(132, 25).addBox(-3.0F, -6.5F, 3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, 7.4282F, 1.5359F, -2.5744F, 0.0F, 0.0F));
		PartDefinition cube_r2 = leg2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 135).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -1.5F, 1.0F, -1.0036F, 0.0F, 0.0F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(48, 144).addBox(11.0F, -4.0F, -2.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(142, 59)
						.addBox(13.0F, 4.0F, -8.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(113, 111)
						.addBox(11.0F, 14.0F, -10.0F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 4.0F));
		PartDefinition cube_r3 = leg1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(141, 130).addBox(-3.0F, -6.5F, 3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, 7.4282F, 1.5359F, -2.5744F, 0.0F, 0.0F));
		PartDefinition cube_r4 = leg1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(24, 141).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -1.5F, 1.0F, -1.0036F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(63, 51).addBox(-11.0F, -9.0F, -9.5F, 22.0F, 9.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-17.0F, -27.0F, -12.0F, 34.0F, 18.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(52, 79)
						.addBox(-6.0F, -44.0F, -6.0F, 12.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(116, 13)
						.addBox(-5.0F, -46.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(126, 48)
						.addBox(-5.0F, -28.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 84)
						.addBox(-2.0F, -48.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 111)
						.addBox(-12.0F, -22.0F, -16.0F, 24.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(139, 73)
						.addBox(17.0F, -25.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 111)
						.addBox(-18.0F, -25.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(23, 120)
						.addBox(19.0F, -4.0F, -31.0F, 4.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 111)
						.addBox(-23.0F, -4.0F, -31.0F, 4.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(87, 42)
						.addBox(20.0F, 1.0F, -28.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(63, 51)
						.addBox(-22.0F, 1.0F, -28.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(20.0F, -6.0F, -30.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-22.0F, -6.0F, -30.0F, 2.0F,
								3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(63, 42).addBox(11.0F, -10.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 84)
						.addBox(-13.0F, -10.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(92, 13)
						.addBox(-1.0F, -10.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(0.0F, -9.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(12.0F, -9.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-12.0F, -9.0F, -2.0F, 4.0F,
								12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -18.0F, 12.0F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 70).addBox(-43.0F, -4.0F, 2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(-1.0F, -4.0F, 2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, 2.0F, -21.5F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(61, 123).addBox(-43.0F, -13.5F, -12.0F, 6.0F, 19.0F, 8.0F, new CubeDeformation(0.0F))
						.texOffs(89, 123).addBox(-1.0F, -13.5F, -12.0F, 6.0F, 19.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.2F, -13.5718F, -10.0931F, 2.0944F, 0.0F, 0.0F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-45.0F, -6.0F, 2.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(117, 130)
						.addBox(-3.0F, -6.0F, 2.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -17.2525F, -2.54F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(46, 120).addBox(-42.2F, -17.5F, 9.629F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(126, 59)
						.addBox(-0.2F, -17.5F, 9.629F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.2F, -14.5F, -17.629F, -1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 70).addBox(-11.0F, -9.0F, -15.0F, 22.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(88, 79)
						.addBox(-11.0F, 13.0F, -9.0F, 22.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -6.0F, -2.4871F, 0.0F, 0.0F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(92, 0).addBox(-11.0F, 0.0F, 3.0F, 22.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(91, 98)
						.addBox(-11.0F, -2.0F, -3.0F, 22.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -6.0F, 2.4871F, 0.0F, 0.0F));
		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 84).addBox(-4.5F, -3.5F, -9.0F, 4.0F, 9.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -4.5F, 0.0F, 0.0F, 0.0F, 2.4871F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(26, 93).addBox(2.0F, -4.5F, -9.0F, 4.0F, 9.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -4.5F, 0.0F, 0.0F, 0.0F, -2.4871F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		thatonebit.render(poseStack, buffer, packedLight, packedOverlay);
		leg2.render(poseStack, buffer, packedLight, packedOverlay);
		leg1.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.body.xRot = headPitch / (180F / (float) Math.PI);
	}
}
