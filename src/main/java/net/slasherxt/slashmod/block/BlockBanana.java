package net.slasherxt.slashmod.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		LogHelper.info(entityPlayer.getDisplayName());
		
		entityPlayer.getFoodStats().addStats(20, 7.2F);
		entityPlayer.setHealth(20);
		world.setBlockToAir(x, y, z);
		
		return false;
	}
}
