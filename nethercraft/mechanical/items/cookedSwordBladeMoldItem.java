package ardenexal.nethercraft.mechanical.items;

import net.minecraft.item.Item;
import ardenexal.nethercraft.NethercraftCore;
import ardenexal.nethercraft.NethercraftWorld;
import ardenexal.nethercraft.worldgen.WorldProxy;

public class cookedSwordBladeMoldItem extends Item {

	public cookedSwordBladeMoldItem(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(NethercraftCore.tabNethercraft);
		setIconIndex(8);
		setItemName("cookedSwordBladeMold");
	}

	public String getTextureFile() {
		return WorldProxy.ITEMS_PNG;
	}

}