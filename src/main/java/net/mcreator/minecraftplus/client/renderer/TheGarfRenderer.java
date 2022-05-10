
package net.mcreator.minecraftplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.minecraftplus.entity.TheGarfEntity;
import net.mcreator.minecraftplus.client.model.Modelthe_garf;

public class TheGarfRenderer extends MobRenderer<TheGarfEntity, Modelthe_garf<TheGarfEntity>> {
	public TheGarfRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthe_garf(context.bakeLayer(Modelthe_garf.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<TheGarfEntity, Modelthe_garf<TheGarfEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("minecraft_plus:textures/the_garf.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TheGarfEntity entity) {
		return new ResourceLocation("minecraft_plus:textures/the_garf.png");
	}
}
