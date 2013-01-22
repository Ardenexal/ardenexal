package ardenexal.nethercraft.worldgen.ores;

import net.minecraft.block.BlockOre;
import ardenexal.nethercraft.CommonProxy;
import ardenexal.nethercraft.Nethercraft;

public class NetherTinOre extends BlockOre {

	public NetherTinOre(int par1, int par2) {
		super(par1, par2);
		setHardness(4.0F);
		setStepSound(soundStoneFootstep);
		setBlockName("NetherTinOre");
		setCreativeTab(Nethercraft.tabNethercraft);


	}

	@Override
	public String getTextureFile() {
		return CommonProxy.BLOCK_PNG;
	}

}
