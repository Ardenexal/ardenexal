package ardenexal.nethercraft.mechanical.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ardenexal.nethercraft.NethercraftCore;
import ardenexal.nethercraft.worldgen.WorldProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class itemUncookedMold extends Item {

	public static final String[] moldNames = new String[] { "Axe", "Pick",
			"Shovel", "SwordBlade", "SwordHandle" };

	public itemUncookedMold(int par1) {
		super(par1);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(NethercraftCore.tabNethercraft);
		this.setItemName("UncookedMold");
	}

	public String getItemDisplayName(ItemStack Stack) {

		int damage = Stack.getItemDamage();
		return "Uncooked " + moldNames[damage];
	}

	public String getTextureFile() {
		return WorldProxy.ITEMS_PNG;
	}

	@SideOnly(Side.CLIENT)
	public int getIconFromDamage(int meta) {
		int var2 = MathHelper.clamp_int(meta, 0, 15);
		return this.iconIndex + var2 % 8 * 16 + var2 / 8;
	}

	public String getItemNameIS(ItemStack par1ItemStack) {
		int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 4);
		return super.getItemName() + "." + moldNames[var2];
	}

	@SideOnly(Side.CLIENT)
	/**
	 * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
	 */
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int var4 = 0; var4 < 4; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
}
