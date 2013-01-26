package ardenexal.nethercraft.core.client;


import net.minecraftforge.client.MinecraftForgeClient;
import ardenexal.nethercraft.core.CoreProxy;
import ardenexal.nethercraft.utils.Reference;


public class ClientProxy extends CoreProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(CoreProxy.BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(CoreProxy.ITEMS_PNG);
	}
	
}
