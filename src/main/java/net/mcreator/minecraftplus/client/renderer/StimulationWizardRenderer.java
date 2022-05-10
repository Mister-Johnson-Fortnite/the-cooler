
package net.mcreator.minecraftplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraftplus.entity.StimulationWizardEntity;
import net.mcreator.minecraftplus.client.model.Modelstimwizard;

public class StimulationWizardRenderer extends MobRenderer<StimulationWizardEntity, Modelstimwizard<StimulationWizardEntity>> {
	public StimulationWizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstimwizard(context.bakeLayer(Modelstimwizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StimulationWizardEntity entity) {
		return new ResourceLocation("minecraft_plus:textures/stimwizard.png");
	}
}
