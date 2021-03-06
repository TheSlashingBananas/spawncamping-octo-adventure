package net.slasherxt.slashmod.block.ores;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.slasherxt.slashmod.block.BlockSM;
import net.slasherxt.slashmod.init.ModItems;

public class YellowOre extends BlockSM {
	public YellowOre() {
		setHardness(3F);
		setResistance(2.5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		setBlockName("yellowOre");
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		Random rand = new Random();
		
		ret.add(new ItemStack(ModItems.yellowItem, rand.nextInt(3) + 1));
		
        return ret;
	}
}
