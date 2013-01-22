package ardenexal.nethercraft.mechanical.items;

import net.minecraft.item.Item;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class cookedPickMoldItem extends Item {

	public cookedPickMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(5);
		setItemName("cookedPickMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
