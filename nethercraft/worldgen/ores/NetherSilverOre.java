package ardenexal.nethercraft.worldgen.ores;

import net.minecraft.block.BlockOre;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class NetherSilverOre extends BlockOre {

	public NetherSilverOre(int par1, int par2) {
		super(par1, par2);
		setHardness(4.0F);
		setStepSound(soundStoneFootstep);
		setBlockName("NetherSilverOre");
		setCreativeTab(Nethercraft.tabNethercraft);


	}

	@Override
	public String getTextureFile() {
		return CommonProxy.BLOCK_PNG;
	}

}
