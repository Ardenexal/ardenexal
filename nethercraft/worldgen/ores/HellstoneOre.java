package ardenexal.nethercraft.worldgen.ores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Random;

import net.minecraft.block.BlockOre;

import ardenexal.nethercraft.NethercraftCore;
import ardenexal.nethercraft.NethercraftWorld;
import ardenexal.nethercraft.items.Items;
import ardenexal.nethercraft.utils.Reference;
import ardenexal.nethercraft.worldgen.WorldProxy;

public class HellstoneOre extends BlockOre {

	public HellstoneOre(int id, int texture) {
		super(id, texture);
		
		setHardness(4.0F);
		setStepSound(soundStoneFootstep);
		setBlockName("Hellstone");
		setCreativeTab(NethercraftCore.tabNethercraft);
	}

	@Override
	public String getTextureFile() {
		return WorldProxy.BLOCK_PNG;
	}

	public int idDropped(int par1, Random par2Random, int par3){
		return Items.hellstone.itemID;
	}
}
