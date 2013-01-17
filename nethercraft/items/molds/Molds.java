package ardenexal.nethercraft.items.molds;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class Molds extends ItemBlock {
	private final String[] subNames = { "UncookedPickMold", "UncookedAxeMold",
			"UncookedSwordBladeMold", "UncookedSwordHandleMold",
			"UncookedShovelMold" };

	public Molds(int id) {
		super(id);
		setHasSubtypes(true);
		setItemName("Mold");
	}

	@Override
	public String getItemNameIS(ItemStack itemstack) {
		return getItemName() + "." + subNames[itemstack.getItemDamage()];
	}

	public static void init() {

	}

	@Override
	public int getMetadata(int damageValue) {
		return damageValue;
	}

}
