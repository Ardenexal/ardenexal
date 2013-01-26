package ardenexal.nethercraft.mechanical.liquids;

import net.minecraft.item.Item;

import org.lwjgl.util.glu.Registry;

import cpw.mods.fml.common.registry.GameRegistry;

public class LiquidRegister {
	public static Item liquidGold;
	public static Item liquidIron;
	public static Item liquidSilver;
	public static Item liquidTin;
	public static Item liquidCopper;
	
	
	public static void init(){
		liquidGold = new Item(2220).setItemName("Liquid Gold");
		liquidIron = new Item(2220).setItemName("Liquid Iron");
		liquidSilver = new Item(2220).setItemName("Liquid Silver");
		liquidTin = new Item(2220).setItemName("Liquid Tin");
		liquidCopper = new Item(2220).setItemName("Liquid Copper");
		
	}

}
