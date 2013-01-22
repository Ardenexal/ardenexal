package ardenexal.nethercraft.mechanical.items;

import net.minecraft.item.Item;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;


public class cookedShovelMoldItem extends Item {

	public cookedShovelMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(7);
		setItemName("cookedShovelMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
