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
public class Modelstimwizard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("minecraft_plus", "modelstimwizard"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart arm1;
	public final ModelPart arm2;

	public Modelstimwizard(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.arm1 = root.getChild("arm1");
		this.arm2 = root.getChild("arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, -1.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -2.0F, -6.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 15)
						.addBox(-1.5F, -6.0F, -3.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 19)
						.addBox(-2.5F, -4.0F, -4.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 9).addBox(-2.5F, -2.0F, -4.5F, 5.0F,
								5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.5F, -0.5F, 0.3054F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 9).addBox(-9.0F, -41.0F, -1.0F, 6.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 24.0F, -2.0F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-2.0F, -7.0F, -1.5F));
		PartDefinition cube_r2 = leg1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 26).addBox(-1.0F, -10.0F, -0.4F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 8.5F, -1.5F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r3 = leg1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 23.0F, -0.5F, 0.1309F, 0.0F, 0.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(2.0F, -7.0F, -1.5F));
		PartDefinition cube_r4 = leg2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -10.0F, -0.4F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 8.5F, -1.5F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r5 = leg2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(8, 26).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 23.0F, -0.5F, 0.1309F, 0.0F, 0.0F));
		PartDefinition arm1 = partdefinition.addOrReplaceChild("arm1", CubeListBuilder.create(), PartPose.offset(-3.0F, -15.5F, -1.666F));
		PartDefinition cube_r6 = arm1.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(36, 37).addBox(0.0F, -10.0F, 1.6F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.0F, -1.334F, 0.0873F, 0.0F, 0.1745F));
		PartDefinition cube_r7 = arm1.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(38, 0).addBox(-1.2F, -8.0F, 0.1F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 23.5F, -0.334F, -0.1309F, 0.0F, 0.0F));
		PartDefinition arm2 = partdefinition.addOrReplaceChild("arm2", CubeListBuilder.create(), PartPose.offset(3.0F, -15.5F, -1.666F));
		PartDefinition cube_r8 = arm2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(32, 25).addBox(-3.0F, -10.0F, 1.6F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 9.0F, -1.334F, 0.0873F, 0.0F, -0.1745F));
		PartDefinition cube_r9 = arm2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(36, 19).addBox(-1.8F, -8.0F, 0.1F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 23.5F, -0.334F, -0.1309F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		leg1.render(poseStack, buffer, packedLight, packedOverlay);
		leg2.render(poseStack, buffer, packedLight, packedOverlay);
		arm1.render(poseStack, buffer, packedLight, packedOverlay);
		arm2.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arm1.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.arm2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
