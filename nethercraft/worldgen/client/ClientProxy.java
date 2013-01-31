package ardenexal.nethercraft.worldgen.client;


import net.minecraftforge.client.MinecraftForgeClient;
import ardenexal.nethercraft.core.utils.Reference;
import ardenexal.nethercraft.worldgen.WorldProxy;

public class ClientProxy extends WorldProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(WorldProxy.BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(WorldProxy.ITEMS_PNG);
	}
	
}
