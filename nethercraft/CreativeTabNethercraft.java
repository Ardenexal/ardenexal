package ardenexal.nethercraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.StringTranslate;

public class CreativeTabNethercraft extends CreativeTabs {

	public CreativeTabNethercraft(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return Block.netherBrick.blockID;
	}
	public String getTranslatedTabLabel()
	{
	return StringTranslate.getInstance().translateKey("" + this.getTabLabel());
	}

	public String getTabLabel()
	{
	return "Nethercraft";
	}
}
