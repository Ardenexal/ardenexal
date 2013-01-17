package ardenexal.nethercraft.items.molds;

import net.minecraft.item.Item;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class UncookedSwordHandleMoldItem extends Item {

	public UncookedSwordHandleMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(4);
		setItemName("uncookedSwordHandleMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
