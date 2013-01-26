package ardenexal.nethercraft;

import java.io.File;

import ardenexal.nethercraft.core.NethercraftPacketHandler;
import ardenexal.nethercraft.items.Items;
import ardenexal.nethercraft.mechanical.MechanicalProxy;
import ardenexal.nethercraft.mechanical.MoldBench;
import ardenexal.nethercraft.mechanical.items.itemCookedMold;
import ardenexal.nethercraft.mechanical.items.itemUncookedMold;
import ardenexal.nethercraft.utils.CreativeTabNethercraft;
import ardenexal.nethercraft.utils.NethercraftConfiguration;
import ardenexal.nethercraft.utils.Reference;
import ardenexal.nethercraft.utils.Version;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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

@Mod(modid = "Nethercraft|Machine", name = "Nethercraft", version = Version.Version)
@NetworkMod(clientSideRequired = true, serverSideRequired = true, channels = { "Nethercraft" }, packetHandler = NethercraftPacketHandler.class)
public class NethercraftMachine {
	// The instance of your mod that Forge uses.
	@Instance("Nethercraft|Machine")
	public static NethercraftMachine instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "ardenexal.nethercraft.mechanical.client.ClientProxy", serverSide = "ardenexal.nethercraft.mechanical.CommonProxy")
	public static MechanicalProxy proxy;
	public static NethercraftConfiguration mainConfiguration;

	// Items
	public static Item uncookedMold;
	public static Item cookedMold;
	public static Block MoldBench;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Init
	public void load(FMLInitializationEvent event) {
		Property itemUncookedMoldId = NethercraftCore.mainConfiguration.getItem("uncookedmold.id", Reference.ITEM_UNCOOKEDMOLD);
		Property itemcookedMoldId = NethercraftCore.mainConfiguration.getItem("cookedmold.id", Reference.ITEM_COOKEDMOLD);
		Property moldBenchId = NethercraftCore.mainConfiguration.getBlock("MoldBench.id", Reference.MACHINE_MOLDBENCH_ID);
		
		try{
			uncookedMold = new itemUncookedMold(itemUncookedMoldId.getInt(Reference.ITEM_UNCOOKEDMOLD));
		cookedMold = new itemCookedMold(itemcookedMoldId.getInt(Reference.ITEM_COOKEDMOLD));
		MoldBench = new MoldBench(moldBenchId.getInt(Reference.MACHINE_MOLDBENCH_ID));
		
		addBlock(MoldBench, "Mold Bench");
		}finally{
			NethercraftCore.mainConfiguration.save();
		}
		
		
		
		loadRecipes();
		
		NetworkRegistry.instance().registerGuiHandler(this,proxy);
		
		//Proxy
		proxy.registerRenderers();
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}

	public void loadRecipes() {

	}

	public static void addBlock(Block block, String Name) {
		GameRegistry.registerBlock(block, "NC_"
				+ block.getBlockName().toString());
		LanguageRegistry.addName(block, Name);
	}
}