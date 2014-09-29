package net.slasherxt.slashmod.init;

import net.slasherxt.slashmod.item.ItemBanana;
import net.slasherxt.slashmod.item.ItemBananaBunch;
import net.slasherxt.slashmod.item.ItemBananaPeel;
import net.slasherxt.slashmod.item.ItemSM;
import net.slasherxt.slashmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemSM banana = new ItemBanana();
	public static final ItemSM bananaBunch = new ItemBananaBunch();
	public static final ItemSM bananaPeel = new ItemBananaPeel();
	
	public static void init() {
		GameRegistry.registerItem(banana, "banana");
		GameRegistry.registerItem(bananaBunch, "bananaBunch");
		GameRegistry.registerItem(bananaPeel, "bananaPeel");
	}
}
