
package net.mcreator.minecraftplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraftplus.entity.MechaGoobertEntity;
import net.mcreator.minecraftplus.client.model.Modelgoobertmech;

public class MechaGoobertRenderer extends MobRenderer<MechaGoobertEntity, Modelgoobertmech<MechaGoobertEntity>> {
	public MechaGoobertRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgoobertmech(context.bakeLayer(Modelgoobertmech.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechaGoobertEntity entity) {
		return new ResourceLocation("minecraft_plus:textures/goobertmech.png");
	}
}
