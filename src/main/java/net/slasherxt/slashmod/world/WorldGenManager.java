package net.slasherxt.slashmod.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.slasherxt.slashmod.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenManager implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for(int bO = 0; bO < 10; bO++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(ModBlocks.blueOre, 13)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        for(int gO = 0; gO < 10; gO++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(ModBlocks.greenOre, 13)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        for(int rO = 0; rO < 10; rO++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(ModBlocks.redOre, 13)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        for(int oO = 0; oO < 10; oO++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(ModBlocks.orangeOre, 13)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        for(int wO = 0; wO < 10; wO++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(ModBlocks.whiteOre, 13)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        for(int yO = 0; yO < 10; yO++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(ModBlocks.yellowOre, 13)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
}