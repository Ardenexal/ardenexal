package ardenexal.nethercraft.blocks;

import ardenexal.nethercraft.Nethercraft;
import ardenexal.nethercraft.mechanical.*;
import ardenexal.nethercraft.utils.Reference;
import ardenexal.nethercraft.worldgen.ores.HellstoneOre;
import ardenexal.nethercraft.worldgen.ores.NetherCopperOre;
import ardenexal.nethercraft.worldgen.ores.NetherDiamond;
import ardenexal.nethercraft.worldgen.ores.NetherGoldOre;
import ardenexal.nethercraft.worldgen.ores.NetherIronOre;
import ardenexal.nethercraft.worldgen.ores.NetherSilverOre;
import ardenexal.nethercraft.worldgen.ores.NetherTinOre;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class Blocks {

	// Blocks
	public static Block HellstoneOre;
	public static Block NetherIron;
	public static Block NetherGold;
	public static Block NetherSilver;
	public static Block NetherTin;
	public static Block NetherCopper;
	public static Block NetherDiamond;
	public static Block MoldBench;

	public static void include() {
		Property hellstoneOreId = Nethercraft.mainConfiguration.getBlock("HellstoneOre.id", Reference.ORE_HELLSTONE_ID);
		Property netherIronId = Nethercraft.mainConfiguration.getBlock("NetherIron.id", Reference.ORE_NETHER_IRON_ID);
		Property netherGoldId = Nethercraft.mainConfiguration.getBlock("NetherGold.id", Reference.ORE_NETHER_GOLD_ID);
		Property netherSilverId = Nethercraft.mainConfiguration.getBlock("NetherSilver.id", Reference.ORE_NETHER_SILVER_ID);
		Property netherTinId = Nethercraft.mainConfiguration.getBlock("NetherTin.id", Reference.ORE_NETHER_TIN_ID);
		Property netherCopperId = Nethercraft.mainConfiguration.getBlock("NetherCopper.id", Reference.ORE_NETHER_COPPER_ID);
		Property netherDiamondId = Nethercraft.mainConfiguration.getBlock("NetherDiamond.id", Reference.ORE_NETHER_DIAMOND_ID);
		Property moldBenchId = Nethercraft.mainConfiguration.getBlock("MoldBench.id", Reference.MACHINE_MOLDBENCH_ID);
		
		try {
			Nethercraft.mainConfiguration.load();
			HellstoneOre = new HellstoneOre(hellstoneOreId.getInt(Reference.ORE_HELLSTONE_ID), 0);
			NetherIron = new NetherIronOre(netherIronId.getInt(Reference.ORE_NETHER_IRON_ID), 1);
			NetherGold = new NetherGoldOre(netherGoldId.getInt(Reference.ORE_NETHER_GOLD_ID), 2);
			NetherSilver = new NetherSilverOre(netherSilverId.getInt(Reference.ORE_NETHER_SILVER_ID), 6);
			NetherTin = new NetherTinOre(netherTinId.getInt(Reference.ORE_NETHER_TIN_ID), 5);
			NetherCopper = new NetherCopperOre(netherCopperId.getInt(Reference.ORE_NETHER_COPPER_ID), 4);
			NetherDiamond = new NetherDiamond(netherDiamondId.getInt(Reference.ORE_NETHER_DIAMOND_ID), 3);
			MoldBench = new MoldBench(moldBenchId.getInt(Reference.MACHINE_MOLDBENCH_ID));

			addBlock(HellstoneOre, "Hellstone Ore");
			addBlock(NetherIron, "Nether Iron Ore");
			addBlock(NetherGold, "Nether Gold Ore");
			addBlock(NetherSilver, "Nether Silver Ore");
			addBlock(NetherTin, "Nether Tin Ore");
			addBlock(NetherCopper, "Nether Copper Ore");
			addBlock(NetherDiamond, "Nether Diamond");
			addBlock(MoldBench, "Mold Bench");
		} finally {
			Nethercraft.mainConfiguration.save();
		}

	}

	public static void addBlock(Block block, String Name) {
		GameRegistry.registerBlock(block, "NC_" + block.getBlockName().toString());
		LanguageRegistry.addName(block, Name);
	}
}
