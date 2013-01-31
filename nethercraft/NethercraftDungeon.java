package ardenexal.nethercraft;

import java.io.File;

import ardenexal.nethercraft.core.NethercraftPacketHandler;
import ardenexal.nethercraft.core.utils.CreativeTabNethercraft;
import ardenexal.nethercraft.core.utils.NethercraftConfiguration;
import ardenexal.nethercraft.core.utils.Reference;
import ardenexal.nethercraft.core.utils.Version;
import ardenexal.nethercraft.dungeon.DungeonProxy;
import ardenexal.nethercraft.dungeon.JiwaStone;

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

@Mod(modid = "Nethercraft|Dungeon", name = "Nethercraft", version = Version.Version)
@NetworkMod(clientSideRequired = true, serverSideRequired = true,channels={"Nethercraft"}, packetHandler = NethercraftPacketHandler.class)

public class NethercraftDungeon {
	// The instance of your mod that Forge uses.
	@Instance("Nethercraft|Dungeon")
	public static NethercraftDungeon instance;
		

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "ardenexal.nethercraft.dungeon.client.ClientProxy", serverSide = "ardenexal.nethercraft.dungeon.DungeonProxy")
	
	public static DungeonProxy proxy;

	public static Item itemJiwastone;
	
	public static NethercraftConfiguration mainConfiguration;
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		

	}

	@Init
	public void load(FMLInitializationEvent event) {

		Property jiwastoneid = NethercraftCore.mainConfiguration.getItem("jiwastone.id", Reference.ITEM_JIWA_STONE);
		
		try{
			NethercraftCore.mainConfiguration.load();
			
			itemJiwastone = new JiwaStone(jiwastoneid.getInt());
			LanguageRegistry.addName(itemJiwastone, "Jiwa Stone");
		}finally{
			NethercraftCore.mainConfiguration.save();
		}
		
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