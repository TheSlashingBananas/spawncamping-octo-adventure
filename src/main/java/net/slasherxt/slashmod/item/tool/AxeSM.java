package net.slasherxt.slashmod.item.tool;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import com.google.common.collect.Sets;

public class AxeSM extends ToolSM
{
    private static final Set field_150917_c = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
    private static final String __OBFID = "CL_00001770";

    protected AxeSM(Item.ToolMaterial material)
    {
        super(3.0F, material, field_150917_c);
    }

    public float func_150893_a(ItemStack itemStack, Block block)
    {
        return block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine ? super.func_150893_a(itemStack, block) : this.efficiencyOnProperMaterial;
    }
}