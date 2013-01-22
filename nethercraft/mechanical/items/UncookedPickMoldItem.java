package ardenexal.nethercraft.mechanical.items;

import net.minecraft.item.Item;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class UncookedPickMoldItem extends Item {

	public UncookedPickMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(0);
		setItemName("uncookedPickMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
