package ardenexal.nethercraft.items;

import net.minecraft.item.Item;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class itemHellstone extends Item {
	protected itemHellstone(int par1) {
		super(par1);

	setMaxStackSize(64);
	setCreativeTab(Nethercraft.tabNethercraft);
	setIconIndex(10);
	setItemName("itemHellstone");
}

public String getTextureFile() {
	return CommonProxy.ITEMS_PNG;
}

}
