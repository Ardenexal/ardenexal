package ardenexal.nethercraft.dungeon;

import net.minecraft.item.Item;
import ardenexal.nethercraft.NethercraftCore;
import ardenexal.nethercraft.NethercraftWorld;
import ardenexal.nethercraft.worldgen.WorldProxy;

public class JiwaStone extends Item {

	public JiwaStone(int par1) {
		super(par1);
		setMaxStackSize(1);
		setCreativeTab(NethercraftCore.tabNethercraft);
		setIconCoord(0, 0);
		setItemName("jiwaStone");
	}

	public String getTextureFile() {
		return WorldProxy.ITEMS_PNG;
	}

}
