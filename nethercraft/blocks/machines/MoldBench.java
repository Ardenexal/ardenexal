package ardenexal.nethercraft.blocks.machines;

import java.util.Random;

import ardenexal.nethercraft.Nethercraft;
import ardenexal.nethercraft.utils.Reference;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.src.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidTank;

public class MoldBench extends BlockContainer {

	public static int MAX_LIQUID = LiquidContainerRegistry.BUCKET_VOLUME * 3;
	
	private static LiquidTank liquidMetalTank;
	
        public MoldBench (int id) {
                super(id, Material.wood);
                setHardness(2.0F);
                setResistance(5.0F);
                setBlockName("blockMoldBench");
                setCreativeTab(Nethercraft.tabNethercraft);
                
                liquidMetalTank = new LiquidTank(MAX_LIQUID);
        }
        
        @Override
        public String getTextureFile(){
        	return Reference.BLOCK_SPRITE_SHEET;
        }

        @Override
        public boolean onBlockActivated(World world, int x, int y, int z,
                        EntityPlayer player, int idk, float what, float these, float are) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if (tileEntity == null || player.isSneaking()) {
                        return false;
                }
                //opens gui, to be implemented later
                player.openGui(Nethercraft.instance,0,world,x,y,z);
                return true;
        }

        @Override
        public void breakBlock(World world, int x, int y, int z, int par5, int par6) {
                dropItems(world, x, y, z);
                super.breakBlock(world, x, y, z, par5, par6);
        }
       
        private void dropItems(World world, int x, int y, int z){
                Random rand = new Random();

                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if (!(tileEntity instanceof IInventory)) {
                        return;
                }
                IInventory inventory = (IInventory) tileEntity;

                for (int i = 0; i < inventory.getSizeInventory(); i++) {
                        ItemStack item = inventory.getStackInSlot(i);

                        if (item != null && item.stackSize > 0) {
                                float rx = rand.nextFloat() * 0.8F + 0.1F;
                                float ry = rand.nextFloat() * 0.8F + 0.1F;
                                float rz = rand.nextFloat() * 0.8F + 0.1F;

                                EntityItem entityItem = new EntityItem(world,
                                                x + rx, y + ry, z + rz,
                                                new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));

                                if (item.hasTagCompound()) {
                                        item.setTagCompound((NBTTagCompound) item.getTagCompound().copy());
                                        
                                }

                                float factor = 0.05F;
                                entityItem.motionX = rand.nextGaussian() * factor;
                                entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
                                entityItem.motionZ = rand.nextGaussian() * factor;
                                world.spawnEntityInWorld(entityItem);
                                item.stackSize = 0;
                        }
                }
        }
    	public static int getScaledBurnTime(int i) {
    		return liquidMetalTank.getLiquid() != null ? (int) (((float) liquidMetalTank.getLiquid().amount / (float) (MAX_LIQUID)) * i) : 0;
    		}
        @Override
        public TileEntity createNewTileEntity(World world) {
                return new TileEntityMoldBench();
        }
        public static int getMetalId(){
			return liquidMetalTank.getLiquid() !=null ? liquidMetalTank.getLiquid().itemID : 0;
        }
    	public static int getMetalMeta() {
    		return liquidMetalTank.getLiquid() != null ? liquidMetalTank.getLiquid().itemMeta : 0;
    		}

}
