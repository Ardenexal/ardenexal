package ardenexal.nethercraft.mechanical.client;


import net.minecraftforge.client.MinecraftForgeClient;
import ardenexal.nethercraft.core.utils.Reference;
import ardenexal.nethercraft.mechanical.MechanicalProxy;


public class ClientProxy extends MechanicalProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(MechanicalProxy.BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(MechanicalProxy.ITEMS_PNG);
	}
	
}
