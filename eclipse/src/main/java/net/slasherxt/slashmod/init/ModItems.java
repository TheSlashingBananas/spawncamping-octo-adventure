package net.slasherxt.slashmod.init;

import net.slasherxt.slashmod.item.ItemBanana;
import net.slasherxt.slashmod.item.ItemBananaBunch;
import net.slasherxt.slashmod.item.ItemSM;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemSM banana = new ItemBanana();
	public static final ItemSM bananaBunch = new ItemBananaBunch();
	
	public static void init() {
		GameRegistry.registerItem(banana, "banana");
		GameRegistry.registerItem(bananaBunch, "bananaBunch");
	}
}
