package ardenexal.nethercraft.mechanical.items;

import net.minecraft.item.Item;
import ardenexal.nethercraft.NethercraftCore;
import ardenexal.nethercraft.NethercraftWorld;
import ardenexal.nethercraft.worldgen.WorldProxy;

public class UncookedSwordHandleMoldItem extends Item {

	public UncookedSwordHandleMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(NethercraftCore.tabNethercraft);
		setIconIndex(4);
		setItemName("uncookedSwordHandleMold");
	}

	public String getTextureFile() {
		return WorldProxy.ITEMS_PNG;
	}

}
