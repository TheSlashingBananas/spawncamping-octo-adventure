package net.slasherxt.slashmod.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.slasherxt.slashmod.item.ItemSM;
import net.slasherxt.slashmod.item.tool.BananaAxe;
import net.slasherxt.slashmod.item.tool.BananaPickaxe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTools {
	public static final ToolMaterial Banana = EnumHelper.addToolMaterial("Banana", 0, 475, 6.0F, 2.0F, 22);
	
	public static final ItemSM bananaAxe = new BananaAxe(Banana);
	public static final ItemSM bananaPickaxe = new BananaPickaxe(Banana);
	public static final ItemSM bananaSword = new BananaSword(Banana);
	public static final ItemSM bananaHoe = new BananaHoe(Banana);
	public static final ItemSM bananaSpade = new BananaSpade(Banana);
	
	public static void init() {
		GameRegistry.registerItem(bananaAxe, "Banana Axe");
		GameRegistry.registerItem(bananaPickaxe, "Banana Pickaxe");
		GameRegistry.registerItem(bananaSword, "Banana Sword");
		GameRegistry.registerItem(bananaHoe, "Banana Hoe");
		GameRegistry.registerItem(bananaSpade, "Banana Spade");
	}
}
