package ardenexal.nethercraft.items.molds;

import net.minecraft.item.Item;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class UncookedSwordBladeMoldItem extends Item {

	public UncookedSwordBladeMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(3);
		setItemName("uncookedSwordBladeMold");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
