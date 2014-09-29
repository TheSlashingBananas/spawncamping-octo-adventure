package net.slasherxt.slashmod.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.slasherxt.slashmod.utility.LogHelper;

public class BlockBanana extends BlockSM {
	public BlockBanana() {
		super();
		setBlockName("bananaBlock");
		setHardness(1F);
		setResistance(15F);
		setLightLevel(2F);
		setStepSound(soundTypeSand);
	}
	
	@Override
	public boolean onBlockActivated(World world, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		LogHelper.info(entityPlayer.getDisplayName());
		
		entityPlayer.getFoodStats().setFoodLevel(20);
		entityPlayer.setHealth(20);
		
		return false;
	}
}
