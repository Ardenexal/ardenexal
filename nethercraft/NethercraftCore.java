package ardenexal.nethercraft;

import java.io.File;

import ardenexal.nethercraft.core.NethercraftPacketHandler;
import ardenexal.nethercraft.items.Items;
import ardenexal.nethercraft.mechanical.CraftingRecipies;
import ardenexal.nethercraft.mechanical.MoldBench;
import ardenexal.nethercraft.utils.CreativeTabNethercraft;
import ardenexal.nethercraft.utils.NethercraftConfiguration;
import ardenexal.nethercraft.utils.Version;
import ardenexal.nethercraft.core.CoreProxy;
import ardenexal.nethercraft.worldgen.OreGeneration;
import ardenexal.nethercraft.worldgen.WorldGen;
import ardenexal.nethercraft.worldgen.ores.HellstoneOre;
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

@Mod(modid = "Nethercraft|Core", name = "Nethercraft", version = Version.Version)
@NetworkMod(clientSideRequired = true, serverSideRequired = true,channels={"Nethercraft"}, packetHandler = NethercraftPacketHandler.class)

public class NethercraftCore {
	// The instance of your mod that Forge uses.
	@Instance("Nethercraft|Core")
	public static NethercraftCore instance;
		

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "ardenexal.nethercraft.core.client.ClientProxy", serverSide = "ardenexal.nethercraft.core.CommonProxy")
	
	public static CoreProxy proxy;

	public static CreativeTabs tabNethercraft = new CreativeTabNethercraft(CreativeTabs.getNextID(), "NetherCraft");
	
	public static NethercraftConfiguration mainConfiguration;
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		mainConfiguration = new NethercraftConfiguration(new File(event.getModConfigurationDirectory(),"Nethercraft.conf"));

	}

	@Init
	public void load(FMLInitializationEvent event) {


		
		
		//Proxy
		proxy.registerRenderers();
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
	public void loadRecipes(){
		
	}
}