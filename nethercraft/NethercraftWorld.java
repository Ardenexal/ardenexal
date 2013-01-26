package ardenexal.nethercraft;

import java.io.File;

import ardenexal.nethercraft.core.NethercraftPacketHandler;
import ardenexal.nethercraft.items.Items;
import ardenexal.nethercraft.mechanical.CraftingRecipies;
import ardenexal.nethercraft.mechanical.MoldBench;
import ardenexal.nethercraft.utils.CreativeTabNethercraft;
import ardenexal.nethercraft.utils.NethercraftConfiguration;
import ardenexal.nethercraft.utils.Reference;
import ardenexal.nethercraft.utils.Version;
import ardenexal.nethercraft.worldgen.WorldProxy;
import ardenexal.nethercraft.worldgen.OreGeneration;
import ardenexal.nethercraft.worldgen.WorldGen;
import ardenexal.nethercraft.worldgen.ores.HellstoneOre;
import ardenexal.nethercraft.worldgen.ores.NetherCopperOre;
import ardenexal.nethercraft.worldgen.ores.NetherDiamond;
import ardenexal.nethercraft.worldgen.ores.NetherGoldOre;
import ardenexal.nethercraft.worldgen.ores.NetherIronOre;
import ardenexal.nethercraft.worldgen.ores.NetherSilverOre;
import ardenexal.nethercraft.worldgen.ores.NetherTinOre;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Nethercraft|World", name = "Nethercraft", version = Version.Version)
@NetworkMod(clientSideRequired = true, serverSideRequired = true, channels = { "Nethercraft" }, packetHandler = NethercraftPacketHandler.class)
public class NethercraftWorld {
	// The instance of your mod that Forge uses.
	@Instance("Nethercraft|World")
	public static NethercraftWorld instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "ardenexal.nethercraft.worldgen.client.ClientProxy", serverSide = "ardenexal.nethercraft.worldgen.CommonProxy")
	public static WorldProxy proxy;



	// Blocks
	public static Block HellstoneOre;
	public static Block NetherIron;
	public static Block NetherGold;
	public static Block NetherSilver;
	public static Block NetherTin;
	public static Block NetherCopper;
	public static Block NetherDiamond;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Init
	public void load(FMLInitializationEvent event) {

		//Block Properties
		Property hellstoneOreId = NethercraftCore.mainConfiguration.getBlock(
				"HellstoneOre.id", Reference.ORE_HELLSTONE_ID);
		Property netherIronId = NethercraftCore.mainConfiguration.getBlock(
				"NetherIron.id", Reference.ORE_NETHER_IRON_ID);
		Property netherGoldId = NethercraftCore.mainConfiguration.getBlock(
				"NetherGold.id", Reference.ORE_NETHER_GOLD_ID);
		Property netherSilverId = NethercraftCore.mainConfiguration.getBlock(
				"NetherSilver.id", Reference.ORE_NETHER_SILVER_ID);
		Property netherTinId = NethercraftCore.mainConfiguration.getBlock(
				"NetherTin.id", Reference.ORE_NETHER_TIN_ID);
		Property netherCopperId = NethercraftCore.mainConfiguration.getBlock(
				"NetherCopper.id", Reference.ORE_NETHER_COPPER_ID);
		Property netherDiamondId = NethercraftCore.mainConfiguration.getBlock(
				"NetherDiamond.id", Reference.ORE_NETHER_DIAMOND_ID);

		try {
			NethercraftCore.mainConfiguration.load();
			//Block Registration
			HellstoneOre = new HellstoneOre(
					hellstoneOreId.getInt(Reference.ORE_HELLSTONE_ID), 0);
			NetherIron = new NetherIronOre(
					netherIronId.getInt(Reference.ORE_NETHER_IRON_ID), 1);
			NetherGold = new NetherGoldOre(
					netherGoldId.getInt(Reference.ORE_NETHER_GOLD_ID), 2);
			NetherSilver = new NetherSilverOre(
					netherSilverId.getInt(Reference.ORE_NETHER_SILVER_ID), 6);
			NetherTin = new NetherTinOre(
					netherTinId.getInt(Reference.ORE_NETHER_TIN_ID), 5);
			NetherCopper = new NetherCopperOre(
					netherCopperId.getInt(Reference.ORE_NETHER_COPPER_ID), 4);
			NetherDiamond = new NetherDiamond(
					netherDiamondId.getInt(Reference.ORE_NETHER_DIAMOND_ID), 3);

			addBlock(HellstoneOre, "Hellstone Ore");
			addBlock(NetherIron, "Nether Iron Ore");
			addBlock(NetherGold, "Nether Gold Ore");
			addBlock(NetherSilver, "Nether Silver Ore");
			addBlock(NetherTin, "Nether Tin Ore");
			addBlock(NetherCopper, "Nether Copper Ore");
			addBlock(NetherDiamond, "Nether Diamond");

		} finally {
			NethercraftCore.mainConfiguration.save();
		}

		WorldGen.generate();

		// Proxy
		proxy.registerRenderers();
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}

	public static void addBlock(Block block, String Name) {
		GameRegistry.registerBlock(block, "NC_"
				+ block.getBlockName().toString());
		LanguageRegistry.addName(block, Name);
	}
}