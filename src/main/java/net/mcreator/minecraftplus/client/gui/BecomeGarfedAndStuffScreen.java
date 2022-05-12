
package net.mcreator.minecraftplus.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.minecraftplus.world.inventory.BecomeGarfedAndStuffMenu;
import net.mcreator.minecraftplus.network.BecomeGarfedAndStuffButtonMessage;
import net.mcreator.minecraftplus.MinecraftPlusMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BecomeGarfedAndStuffScreen extends AbstractContainerScreen<BecomeGarfedAndStuffMenu> {
	private final static HashMap<String, Object> guistate = BecomeGarfedAndStuffMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox checkit;

	public BecomeGarfedAndStuffScreen(BecomeGarfedAndStuffMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("minecraft_plus:textures/become_garfed_and_stuff.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("minecraft_plus:textures/the_garf.png"));
		this.blit(ms, this.leftPos + -310, this.topPos + -100, 0, 0, 792, 712, 792, 712);

		RenderSystem.setShaderTexture(0, new ResourceLocation("minecraft_plus:textures/death.png"));
		this.blit(ms, this.leftPos + 2, this.topPos + 3, 0, 0, 100, 100, 100, 100);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "locate the remnants of garfland", 7, 166, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 103, 98, 20, new TextComponent("garf yourself."), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 143, 82, 20, new TextComponent("i dare you."), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 102, this.topPos + 3, 56, 20, new TextComponent("cancer"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BecomeGarfedAndStuffButtonMessage(2, x, y, z));
				BecomeGarfedAndStuffButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 102, this.topPos + 23, 56, 20, new TextComponent("cancer"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BecomeGarfedAndStuffButtonMessage(3, x, y, z));
				BecomeGarfedAndStuffButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 102, this.topPos + 43, 56, 20, new TextComponent("cancer"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BecomeGarfedAndStuffButtonMessage(4, x, y, z));
				BecomeGarfedAndStuffButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 102, this.topPos + 63, 56, 20, new TextComponent("cancer"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BecomeGarfedAndStuffButtonMessage(5, x, y, z));
				BecomeGarfedAndStuffButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 158, this.topPos + 3, 56, 20, new TextComponent("cancer"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BecomeGarfedAndStuffButtonMessage(6, x, y, z));
				BecomeGarfedAndStuffButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 158, this.topPos + 23, 56, 20, new TextComponent("cancer"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BecomeGarfedAndStuffButtonMessage(7, x, y, z));
				BecomeGarfedAndStuffButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		checkit = new Checkbox(this.leftPos + 2, this.topPos + 123, 150, 20, new TextComponent("check if you dare"), false);
		guistate.put("checkbox:checkit", checkit);
		this.addRenderableWidget(checkit);
		this.addRenderableWidget(new Button(this.leftPos + 158, this.topPos + 43, 56, 20, new TextComponent("cancer"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BecomeGarfedAndStuffButtonMessage(8, x, y, z));
				BecomeGarfedAndStuffButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 158, this.topPos + 63, 56, 20, new TextComponent("cancer"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new BecomeGarfedAndStuffButtonMessage(9, x, y, z));
				BecomeGarfedAndStuffButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
	}
}
