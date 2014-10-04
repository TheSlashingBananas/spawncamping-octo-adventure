package net.slasherxt.slashmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.banana), "ggg", "iai", "ggg", 'i', new ItemStack(Items.iron_ingot), 'g', new ItemStack(Items.gold_ingot), 'a', new ItemStack(Items.apple)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.bananaBlock), "pbp", "bsb", "pbp", 'p', new ItemStack(ModItems.bananaPeel), 'b', new ItemStack(ModItems.bananaBunch), 's', new ItemStack(ModItems.banana)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.bananaPeel), new ItemStack(ModItems.banana)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.bananaBunch), new ItemStack(ModItems.banana), new ItemStack(ModItems.banana), new ItemStack(ModItems.banana)));
	}
}
