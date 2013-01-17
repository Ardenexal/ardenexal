package ardenexal.nethercraft.items;

import net.minecraft.item.Item;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class JiwaStone extends Item {

	public JiwaStone(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(Nethercraft.tabNethercraft);
		setIconIndex(0);
		setItemName("jiwaStone");
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
