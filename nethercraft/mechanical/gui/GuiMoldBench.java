package ardenexal.nethercraft.mechanical.gui;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.ForgeHooksClient;

import org.lwjgl.opengl.GL11;

import ardenexal.nethercraft.core.utils.Reference;
import ardenexal.nethercraft.mechanical.MoldBench;
import ardenexal.nethercraft.mechanical.container.containerMoldBench;
import ardenexal.nethercraft.mechanical.tileentity.TileEntityMoldBench;

public class GuiMoldBench extends GuiContainer {

        public GuiMoldBench (InventoryPlayer inventoryPlayer,TileEntityMoldBench tileEntity) {
                //the container is instantiated and passed to the superclass for handling
                super(new containerMoldBench(inventoryPlayer, tileEntity));
        }

        @Override
        protected void drawGuiContainerForegroundLayer(int par1, int par2) {
                //draw text and stuff here
                //the parameters for drawString are: string, x, y, color
                fontRenderer.drawString("Mold Bench", (xSize/2)-25, 6, 4210752);

                
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float par1, int par2,
                        int par3) {
                //draw your Gui here, only thing you need to change is the path
                int texture = mc.renderEngine.getTexture(Reference.SPRITE_SHEET_LOCATION + "gui/guiMoldBench.png");
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.mc.renderEngine.bindTexture(texture);
                int j = (width - xSize) / 2;
                int k = (height - ySize) / 2;
                this.drawTexturedModalRect(j, k, 0, 0, 191, 176);
                
                displayGauge(j, k, 15, 66, MoldBench.getScaledBurnTime(58), MoldBench.getMetalId(), MoldBench.getMetalMeta());
        }
    	private void displayGauge(int j, int k, int line, int col, int squaled, int liquidId, int liquidMeta) {
    		int liquidImgIndex = 0;

    		if (liquidId <= 0)
    		return;
    		if (liquidId < Block.blocksList.length && Block.blocksList[liquidId] != null) {
    		ForgeHooksClient.bindTexture(Block.blocksList[liquidId].getTextureFile(), 0);
    		liquidImgIndex = Block.blocksList[liquidId].blockIndexInTexture;
    		} else if (Item.itemsList[liquidId] != null) {
    		ForgeHooksClient.bindTexture(Item.itemsList[liquidId].getTextureFile(), 0);
    		liquidImgIndex = Item.itemsList[liquidId].getIconFromDamage(liquidMeta);
    		} else
    		return;

    		int imgLine = liquidImgIndex / 16;
    		int imgColumn = liquidImgIndex - imgLine * 16;

    		int start = 0;

    		while (true) {
    		int x = 0;

    		if (squaled > 16) {
    		x = 16;
    		squaled -= 16;
    		} else {
    		x = squaled;
    		squaled = 0;
    		}

    		drawTexturedModalRect(j + col, k + line + 58 - x - start, imgColumn * 16, imgLine * 16 + (16 - x), 16, 16 - (16 - x));
    		start = start + 16;

    		if (x == 0 || squaled == 0) {
    		break;
    		}
    		}

    		int i = mc.renderEngine.getTexture(Reference.SPRITE_SHEET_LOCATION + "gui/guiMoldBench.png");

    		mc.renderEngine.bindTexture(i);
    		drawTexturedModalRect(j + col, k + line, 176, 0, 16, 60);
    		}
}