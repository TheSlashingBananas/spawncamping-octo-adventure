package net.slasherxt.slashmod.init;

import net.slasherxt.slashmod.block.BlockBanana;
import net.slasherxt.slashmod.block.BlockSM;
import net.slasherxt.slashmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockSM bananaBlock = new BlockBanana();
	
	public static void init() {
		GameRegistry.registerBlock(bananaBlock, "bananaBlock");
	}
}
