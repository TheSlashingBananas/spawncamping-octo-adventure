package net.slasherxt.slashmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.slasherxt.slashmod.init.ModItems;
import net.slasherxt.slashmod.reference.Reference;

public class CreativeTabSM {
	public static final CreativeTabs SM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return ModItems.banana;
		}
	};
}
