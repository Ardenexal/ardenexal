package ardenexal.nethercraft.worldgen;

import net.minecraft.item.ItemStack;
import ardenexal.nethercraft.items.Items;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler 
{
public int getBurnTime(ItemStack fuel) 
{
	if(fuel.itemID == Items.hellstone.itemID)
		return 2000;
		else
		return 0;
}
}