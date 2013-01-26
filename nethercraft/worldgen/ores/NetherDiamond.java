package ardenexal.nethercraft.worldgen.ores;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import ardenexal.nethercraft.NethercraftCore;
import ardenexal.nethercraft.NethercraftWorld;
import ardenexal.nethercraft.worldgen.WorldProxy;

public class NetherDiamond extends BlockOre {

	public NetherDiamond(int par1, int par2) {
		super(par1, par2);
		setHardness(4.0F);
		setStepSound(soundStoneFootstep);
		setBlockName("NetherDiamondOre");
		setCreativeTab(NethercraftCore.tabNethercraft);


	}

	@Override
	public String getTextureFile() {
		return WorldProxy.BLOCK_PNG;
	}
public int idDroppped(int par1, Random par2Random, int par3){
	return Item.diamond.itemID;
}
}
