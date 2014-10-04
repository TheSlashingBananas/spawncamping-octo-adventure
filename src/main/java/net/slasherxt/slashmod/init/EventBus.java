package net.slasherxt.slashmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.slasherxt.slashmod.world.WorldGenManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class EventBus {
	public static void init() {
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.bananaSeed, 2), 5);
		GameRegistry.registerWorldGenerator(new WorldGenManager(), 10);
	}
}
