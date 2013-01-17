package ardenexal.nethercraft.items.molds;

import net.minecraft.item.Item;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class cookedSwordHandleMoldItem extends Item {

	public cookedSwordHandleMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(9);
		setItemName("cookedSwordHandleMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}