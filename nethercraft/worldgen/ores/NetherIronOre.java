package ardenexal.nethercraft.worldgen.ores;


import net.minecraft.block.BlockOre;
import ardenexal.nethercraft.NethercraftCore;
import ardenexal.nethercraft.NethercraftWorld;
import ardenexal.nethercraft.worldgen.WorldProxy;

public class NetherIronOre extends BlockOre {

	public NetherIronOre(int par1, int par2) {
		super(par1, par2);
		setHardness(4.0F);
		setStepSound(soundStoneFootstep);
		setBlockName("NetherIronOre");
		setCreativeTab(NethercraftCore.tabNethercraft);


	}

	@Override
	public String getTextureFile() {
		return WorldProxy.BLOCK_PNG;
	}
}
