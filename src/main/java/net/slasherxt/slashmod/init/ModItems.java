package net.slasherxt.slashmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.slasherxt.slashmod.creativetab.CreativeTabSM;
import net.slasherxt.slashmod.item.ItemBanana;
import net.slasherxt.slashmod.item.ItemBananaBunch;
import net.slasherxt.slashmod.item.ItemBananaPeel;
import net.slasherxt.slashmod.item.ItemSM;
import net.slasherxt.slashmod.item.oreitems.BlueOreItem;
import net.slasherxt.slashmod.item.oreitems.GreenOreItem;
import net.slasherxt.slashmod.item.oreitems.OrangeOreItem;
import net.slasherxt.slashmod.item.oreitems.RedOreItem;
import net.slasherxt.slashmod.item.oreitems.WhiteOreItem;
import net.slasherxt.slashmod.item.oreitems.YellowOreItem;
import net.slasherxt.slashmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemSM banana = new ItemBanana();
	public static final ItemSM bananaBunch = new ItemBananaBunch();
	public static final ItemSM bananaPeel = new ItemBananaPeel();
	public static final Item bananaSeed = new ItemSeeds(ModBlocks.bananaCrop, Blocks.farmland).setTextureName(Reference.MOD_ID + ":bananaSeed").setUnlocalizedName("bananaSeed").setCreativeTab(CreativeTabSM.SM_TAB);
	
	public static final ItemSM redItem = new RedOreItem();
	public static final ItemSM blueItem = new BlueOreItem();
	public static final ItemSM greenItem = new GreenOreItem();
	public static final ItemSM orangeItem = new OrangeOreItem();
	public static final ItemSM whiteItem = new WhiteOreItem();
	public static final ItemSM yellowItem = new YellowOreItem();
	
	public static void init() {
		GameRegistry.registerItem(banana, "banana");
		GameRegistry.registerItem(bananaBunch, "bananaBunch");
		GameRegistry.registerItem(bananaPeel, "bananaPeel");
		GameRegistry.registerItem(bananaSeed, "bananaSeed");
		GameRegistry.registerItem(redItem, "redItem");
		GameRegistry.registerItem(blueItem, "blueItem");
		GameRegistry.registerItem(greenItem, "greenItem");
		GameRegistry.registerItem(orangeItem, "orangeItem");
		GameRegistry.registerItem(whiteItem, "whiteItem");
		GameRegistry.registerItem(yellowItem, "yellowItem");
	}
}
