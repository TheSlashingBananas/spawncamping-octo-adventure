package net.slasherxt.slashmod.init;

import net.minecraft.block.Block;
import net.slasherxt.slashmod.block.BlockBanana;
import net.slasherxt.slashmod.block.BlockSM;
import net.slasherxt.slashmod.block.crops.BananaCrop;
import net.slasherxt.slashmod.block.ores.BlueOre;
import net.slasherxt.slashmod.block.ores.GreenOre;
import net.slasherxt.slashmod.block.ores.OrangeOre;
import net.slasherxt.slashmod.block.ores.RedOre;
import net.slasherxt.slashmod.block.ores.WhiteOre;
import net.slasherxt.slashmod.block.ores.YellowOre;
import net.slasherxt.slashmod.creativetab.CreativeTabSM;
import net.slasherxt.slashmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockSM bananaBlock = new BlockBanana();
	public static final Block bananaCrop = new BananaCrop().setBlockName("bananaCrop").setCreativeTab(CreativeTabSM.SM_TAB).setBlockTextureName(Reference.MOD_ID + ":bananaCrop");
	
	public static final BlockSM redOre = new RedOre();
	public static final BlockSM blueOre = new BlueOre();
	public static final BlockSM greenOre = new GreenOre();
	public static final BlockSM orangeOre = new OrangeOre();
	public static final BlockSM whiteOre = new WhiteOre();
	public static final BlockSM yellowOre = new YellowOre();
	
	public static void init() {
		GameRegistry.registerBlock(bananaBlock, "bananaBlock");
		GameRegistry.registerBlock(bananaCrop, "bananaCrop");
		GameRegistry.registerBlock(redOre, "redOre");
		GameRegistry.registerBlock(blueOre, "blueOre");
		GameRegistry.registerBlock(greenOre, "greenOre");
		GameRegistry.registerBlock(orangeOre, "orangeOre");
		GameRegistry.registerBlock(whiteOre, "whiteOre");
		GameRegistry.registerBlock(yellowOre, "yellowOre");
	}
}
