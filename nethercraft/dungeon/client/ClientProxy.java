package ardenexal.nethercraft.dungeon.client;


import net.minecraftforge.client.MinecraftForgeClient;
import ardenexal.nethercraft.core.utils.Reference;
import ardenexal.nethercraft.dungeon.DungeonProxy;


public class ClientProxy extends DungeonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(DungeonProxy.BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(DungeonProxy.ITEMS_PNG);
	}
	
}
