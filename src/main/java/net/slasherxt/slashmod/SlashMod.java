package net.slasherxt.slashmod;

import net.slasherxt.slashmod.handler.ConfigurationHandler;
import net.slasherxt.slashmod.init.ModBlocks;
import net.slasherxt.slashmod.init.ModItems;
import net.slasherxt.slashmod.init.ModTools;
import net.slasherxt.slashmod.init.Recipes;
import net.slasherxt.slashmod.proxy.IProxy;
import net.slasherxt.slashmod.reference.Reference;
import net.slasherxt.slashmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class SlashMod {
	
	@Instance("SlashMod")
	public static SlashMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		ModItems.init();
		ModBlocks.init();
		ModTools.init();
		
		LogHelper.info("PreInit Complete");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Recipes.init();
		LogHelper.info("Init Complete");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("PostInit Complete");
	}
}
