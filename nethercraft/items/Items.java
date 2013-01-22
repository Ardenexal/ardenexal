package ardenexal.nethercraft.items;


import net.minecraft.item.Item;
import ardenexal.nethercraft.Nethercraft;
import ardenexal.nethercraft.mechanical.items.UncookedAxeMoldItem;
import ardenexal.nethercraft.mechanical.items.UncookedPickMoldItem;
import ardenexal.nethercraft.mechanical.items.UncookedShovelMoldItem;
import ardenexal.nethercraft.mechanical.items.UncookedSwordBladeMoldItem;
import ardenexal.nethercraft.mechanical.items.UncookedSwordHandleMoldItem;
import ardenexal.nethercraft.mechanical.items.cookedAxeMoldItem;
import ardenexal.nethercraft.mechanical.items.cookedPickMoldItem;
import ardenexal.nethercraft.mechanical.items.cookedShovelMoldItem;
import ardenexal.nethercraft.mechanical.items.cookedSwordBladeMoldItem;
import ardenexal.nethercraft.mechanical.items.cookedSwordHandleMoldItem;
import ardenexal.nethercraft.worldgen.ores.itemHellstone;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	
	//Uncooked Molds
	public final static Item uncookedpickmolditem = new UncookedPickMoldItem(4109);
	public final static Item uncookedaxemolditem = new UncookedAxeMoldItem(4110);
	public final static Item uncookedshovelmolditem = new UncookedShovelMoldItem(4111);
	public final static Item uncookedswordbladekmolditem = new UncookedSwordBladeMoldItem(4112);
	public final static Item uncookedswordhandlemolditem = new UncookedSwordHandleMoldItem(4113);
	
	//Cooked Molds
	public final static Item cookedpickmolditem = new cookedPickMoldItem(4114);
	public final static Item cookedaxemolditem = new cookedAxeMoldItem(4115);
	public final static Item cookedshovelmolditem = new cookedShovelMoldItem(4116);
	public final static Item cookedswordblademolditem = new cookedSwordBladeMoldItem(4117);
	public final static Item cookedswordhandlemolditem = new cookedSwordHandleMoldItem(4118);

	public final static Item jiwastone = new JiwaStone(4119);
	public final static Item hellstone = new itemHellstone(4120);
	
	public static void include(){
	LanguageRegistry.addName(uncookedpickmolditem,"Uncooked Pick Mold");
	LanguageRegistry.addName(uncookedaxemolditem,"Uncooked Axe Mold");
	LanguageRegistry.addName(uncookedshovelmolditem,"Uncooked Shovel Mold");
	LanguageRegistry.addName(uncookedswordbladekmolditem,"Uncooked Sword Blade Mold");
	LanguageRegistry.addName(uncookedswordhandlemolditem,"Uncooked Sword Handle Mold");
	
	LanguageRegistry.addName(cookedpickmolditem,"cooked Pick Mold");
	LanguageRegistry.addName(cookedaxemolditem,"cooked Axe Mold");
	LanguageRegistry.addName(cookedshovelmolditem,"cooked Shovel Mold");
	LanguageRegistry.addName(cookedswordblademolditem,"cooked Sword Blade Mold");
	LanguageRegistry.addName(cookedswordhandlemolditem,"cooked Sword Handle Mold");
	
	LanguageRegistry.addName(hellstone, "Hellstone");
	LanguageRegistry.addName(jiwastone, "Jiwa Stone");
	}

}
