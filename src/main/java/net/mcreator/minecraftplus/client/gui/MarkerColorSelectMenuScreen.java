
package net.mcreator.minecraftplus.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.minecraftplus.world.inventory.MarkerColorSelectMenuMenu;
import net.mcreator.minecraftplus.network.MarkerColorSelectMenuButtonMessage;
import net.mcreator.minecraftplus.MinecraftPlusMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MarkerColorSelectMenuScreen extends AbstractContainerScreen<MarkerColorSelectMenuMenu> {
	private final static HashMap<String, Object> guistate = MarkerColorSelectMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MarkerColorSelectMenuScreen(MarkerColorSelectMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("minecraft_plus:textures/marker_color_select_menu.png");

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
		this.font.draw(poseStack, "This is why I don't do UI design.", 124, 152, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 3, 51, 20, new TextComponent("Black"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(0, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 22, 51, 20, new TextComponent("White"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(1, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 41, 56, 20, new TextComponent("Orange"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(2, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 60, 61, 20, new TextComponent("Magenta"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(3, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 79, 77, 20, new TextComponent("Light Blue"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(4, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 98, 56, 20, new TextComponent("Yellow"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(5, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 117, 46, 20, new TextComponent("Lime"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(6, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 136, 46, 20, new TextComponent("Pink"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(7, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 3, 46, 20, new TextComponent("Gray"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(8, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 22, 77, 20, new TextComponent("Light Gray"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(9, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 41, 46, 20, new TextComponent("Cyan"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(10, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 60, 56, 20, new TextComponent("Purple"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(11, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 79, 46, 20, new TextComponent("Blue"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(12, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 98, 51, 20, new TextComponent("Brown"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(13, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 117, 51, 20, new TextComponent("Green"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(14, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 136, 40, 20, new TextComponent("Red"), e -> {
			if (true) {
				MinecraftPlusMod.PACKET_HANDLER.sendToServer(new MarkerColorSelectMenuButtonMessage(15, x, y, z));
				MarkerColorSelectMenuButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}));
	}
}
