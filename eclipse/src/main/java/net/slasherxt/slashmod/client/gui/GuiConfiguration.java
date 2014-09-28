package net.slasherxt.slashmod.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.slasherxt.slashmod.handler.ConfigurationHandler;
import net.slasherxt.slashmod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;

public class GuiConfiguration extends GuiConfig {
	public GuiConfiguration(GuiScreen guiScreen) {
		super(guiScreen, new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}
}
