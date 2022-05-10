
package net.mcreator.minecraftplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraftplus.entity.SquirrelEntity;
import net.mcreator.minecraftplus.client.model.Modelsquirrel;

public class SquirrelRenderer extends MobRenderer<SquirrelEntity, Modelsquirrel<SquirrelEntity>> {
	public SquirrelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsquirrel(context.bakeLayer(Modelsquirrel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SquirrelEntity entity) {
		return new ResourceLocation("minecraft_plus:textures/squirrel.png");
	}
}
