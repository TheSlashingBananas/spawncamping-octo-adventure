package net.slasherxt.slashmod.block.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.slasherxt.slashmod.init.ModItems;

public class BananaCrop extends BlockCrops {
	@Override
	protected Item func_149866_i()
    {
        return ModItems.bananaSeed;
    }

	@Override
    protected Item func_149865_P()
    {
        return ModItems.banana;
    }
}
