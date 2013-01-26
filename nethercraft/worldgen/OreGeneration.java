package ardenexal.nethercraft.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import cpw.mods.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator{
	public Block block;
	public int metadata;
	public int noBlocks;
	public int min;
	public int max;
	public int nochunks;
	
	public OreGeneration(Block par1, int par2, int par3,int par4,int par5, int par6){
		this.block = par1;
		this.metadata = par2;
		this.noBlocks = par3;
		this.min = par4;
		this.max = par5;
		this.nochunks = par6;
		
	}


	private void generateNether(net.minecraft.world.World world, Random random, int chunkX, int chunkZ) {
		 for (int i = 0; i < nochunks; i++)
         {
                 int randPosX = chunkX + random.nextInt(16);
             int randPosY = random.nextInt(max - min)+min;
             int randPosZ = chunkZ + random.nextInt(16);
             (new WorldGenMinableNether(block.blockID, metadata,noBlocks)).generate(world, random, randPosX, randPosY, randPosZ);
         }
		 
		 int Xcoord = chunkX + random.nextInt(16);
		 int Ycoord = random.nextInt(60);
		 int Zcoord = chunkZ + random.nextInt(16);

		 (new WorldGenMinableNether(block.blockID,metadata,noBlocks)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}
	@Override
	public void generate(Random random, int chunkX, int chunkZ,
			net.minecraft.world.World world,
			net.minecraft.world.chunk.IChunkProvider chunkGenerator,
			net.minecraft.world.chunk.IChunkProvider chunkProvider) {
		
		if (world.provider.isHellWorld == true){
			generateNether(world, random, chunkX*16, chunkZ*16);
				
		}
		
	}

}
