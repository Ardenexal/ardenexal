package ardenexal.nethercraft.worldgen;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import ardenexal.nethercraft.NethercraftWorld;

public class WorldGen {

	//Ore Generation
	public static OreGeneration HellstoneGen = new OreGeneration(NethercraftWorld.HellstoneOre,1,8, 0, 32, 10);
	public static OreGeneration NetherIronGen = new OreGeneration(NethercraftWorld.NetherIron,1,6, 0, 128, 20);
	public static OreGeneration NetherGoldGen = new OreGeneration(NethercraftWorld.NetherGold,1,4, 0, 64, 5);
	public static OreGeneration NetherSilverGen = new OreGeneration(NethercraftWorld.NetherSilver,1,6, 0, 128, 5);
	public static OreGeneration NetherTinGen = new OreGeneration(NethercraftWorld.NetherTin,1,6, 0, 128, 10);
	public static OreGeneration NetherCopperGen = new OreGeneration(NethercraftWorld.NetherCopper,1,6, 0, 128, 10);
	public static OreGeneration NetherDiamondGen = new OreGeneration(NethercraftWorld.NetherDiamond,1,5, 0, 16, 2);
	

    
	public static void generate() {
		GameRegistry.registerWorldGenerator(HellstoneGen);
		GameRegistry.registerWorldGenerator(NetherIronGen);
		GameRegistry.registerWorldGenerator(NetherGoldGen);
		GameRegistry.registerWorldGenerator(NetherSilverGen);
		GameRegistry.registerWorldGenerator(NetherTinGen);
		GameRegistry.registerWorldGenerator(NetherCopperGen);
		GameRegistry.registerWorldGenerator(NetherDiamondGen);
	}

}
