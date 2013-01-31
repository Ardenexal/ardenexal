package ardenexal.nethercraft.mechanical;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import ardenexal.nethercraft.core.utils.Reference;
import ardenexal.nethercraft.mechanical.container.containerMoldBench;
import ardenexal.nethercraft.mechanical.gui.GuiMoldBench;
import ardenexal.nethercraft.mechanical.tileentity.TileEntityMoldBench;

public class MechanicalProxy implements IGuiHandler {
	public static String ITEMS_PNG = Reference.ITEM_SPRITE_SHEET;
	public static String BLOCK_PNG = Reference.BLOCK_SPRITE_SHEET;

	// Client stuff
	public void registerRenderers() {
		// Nothing here as this is the server side proxy
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity instanceof TileEntityMoldBench) {
			return new containerMoldBench(player.inventory,
					(TileEntityMoldBench) tileEntity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity instanceof TileEntityMoldBench) {
			return new GuiMoldBench(player.inventory,
					(TileEntityMoldBench) tileEntity);
		}
		return null;
	}

}
