package ardenexal.nethercraft.blocks.ores;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class NetherDiamond extends BlockOre {

	public NetherDiamond(int par1, int par2) {
		super(par1, par2);
		setHardness(4.0F);
		setStepSound(soundStoneFootstep);
		setBlockName("NetherDiamondOre");
		setCreativeTab(Nethercraft.tabNethercraft);


	}

	@Override
	public String getTextureFile() {
		return CommonProxy.BLOCK_PNG;
	}
public int idDroppped(int par1, Random par2Random, int par3){
	return Item.diamond.itemID;
}
}
