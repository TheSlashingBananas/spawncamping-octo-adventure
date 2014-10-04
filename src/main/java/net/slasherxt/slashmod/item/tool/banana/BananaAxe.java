package net.slasherxt.slashmod.item.tool.banana;

import net.minecraft.item.Item.ToolMaterial;
import net.slasherxt.slashmod.creativetab.CreativeTabSM;
import net.slasherxt.slashmod.init.ModTools;
import net.slasherxt.slashmod.item.tool.AxeSM;

public class BananaAxe extends AxeSM {
	public BananaAxe(ToolMaterial material) {
		super(ModTools.Banana);
		setUnlocalizedName("bananaAxe");
	}
}
