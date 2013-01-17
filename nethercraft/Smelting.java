package ardenexal.nethercraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ardenexal.nethercraft.blocks.Blocks;
import ardenexal.nethercraft.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public void init() {
		GameRegistry.addSmelting(Blocks.NetherIron.blockID, new ItemStack(Item.ingotIron), 0.1f);
		GameRegistry.addSmelting(Blocks.NetherGold.blockID, new ItemStack(Item.ingotGold), 0.1f);
		
		GameRegistry.addSmelting(Items.uncookedpickmolditem.itemID, new ItemStack(Items.cookedpickmolditem), 0.1f);
		GameRegistry.addSmelting(Items.uncookedaxemolditem.itemID, new ItemStack(Items.cookedaxemolditem), 0.1f);
		GameRegistry.addSmelting(Items.uncookedshovelmolditem.itemID, new ItemStack(Items.cookedshovelmolditem), 0.1f);
		GameRegistry.addSmelting(Items.uncookedswordbladekmolditem.itemID, new ItemStack(Items.cookedswordblademolditem), 0.1f);
		GameRegistry.addSmelting(Items.uncookedswordhandlemolditem.itemID, new ItemStack(Items.cookedswordhandlemolditem), 0.1f);
		
	}

}
