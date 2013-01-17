package ardenexal.nethercraft.client;


import net.minecraftforge.client.MinecraftForgeClient;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.utils.Reference;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(CommonProxy.BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(CommonProxy.ITEMS_PNG);
	}
	
}
