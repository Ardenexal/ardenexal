package ardenexal.nethercraft.utils;

import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;

public class Utils {
	public static void preDestroyBlock(World world, int i, int j, int k) {
TileEntity tile = world.getBlockTileEntity(i, j, k);

if (tile instanceof IInventory && !CoreProxy.proxy.isRenderWorld(world))
if (!(tile instanceof IDropControlInventory) || ((IDropControlInventory) tile).doDrop()) {
dropItems(world, (IInventory) tile, i, j, k);
}


}
}
public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4)
{
             if(itemstack.getItemDamage() == 0){list.add("Does 1 heart of damage");}
        else if(itemstack.getItemDamage() == 1){list.add("Does 2 hearts of damage");}
        else if(itemstack.getItemDamage() == 2){list.add("Does 4 hearts of damage");}
}
