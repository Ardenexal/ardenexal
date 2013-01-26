package ardenexal.nethercraft.worldgen.ores;

import net.minecraft.item.Item;
import ardenexal.nethercraft.NethercraftCore;
import ardenexal.nethercraft.NethercraftWorld;
import ardenexal.nethercraft.worldgen.WorldProxy;

public class itemHellstone extends Item {
	public itemHellstone(int par1) {
		super(par1);

	setMaxStackSize(64);
	setCreativeTab(NethercraftCore.tabNethercraft);
	setIconIndex(10);
	setItemName("itemHellstone");
}

public String getTextureFile() {
	return WorldProxy.ITEMS_PNG;
}

}
