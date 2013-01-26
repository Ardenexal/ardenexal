package ardenexal.nethercraft.mechanical.client;


import net.minecraftforge.client.MinecraftForgeClient;
import ardenexal.nethercraft.mechanical.MechanicalProxy;
import ardenexal.nethercraft.utils.Reference;


public class ClientProxy extends MechanicalProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(MechanicalProxy.BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(MechanicalProxy.ITEMS_PNG);
	}
	
}
