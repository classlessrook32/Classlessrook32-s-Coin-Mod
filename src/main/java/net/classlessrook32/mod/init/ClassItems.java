package net.classlessrook32.mod.init;

import net.classlessrook32.mod.items.ItemEnchantedEffect;
import net.classlessrook32.mod.main.Reference;
import net.classlessrook32.mod.main.main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClassItems 
{
	
	//put variables here
	  public static Item CyanCoin;
	  public static Item GreenCoin;
	  public static Item YellowCoin;
	  public static Item BlackCoin;
	  public static Item MagentaCoin;
	  public static Item PurpleCoin;
	  public static Item BlueCoin;
	  public static Item BrownCoin;
	  public static Item GrayCoin;
	  public static Item LightGrayCoin;
	  public static Item WhiteCoin;
	  public static Item RedCoin;
	  public static Item LimeCoin;
	  public static Item OrangeCoin;
	  public static Item LightBlueCoin;
	  public static Item PinkCoin;
	//end of variables
	public static void init()
	{
	//details about the item
		
		CyanCoin  =  new ItemEnchantedEffect().setUnlocalizedName("CyanCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
		GreenCoin = new ItemEnchantedEffect().setUnlocalizedName("GreenCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    YellowCoin = new ItemEnchantedEffect().setUnlocalizedName("YellowCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    BlackCoin = new ItemEnchantedEffect().setUnlocalizedName("BlackCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    MagentaCoin = new ItemEnchantedEffect().setUnlocalizedName("MagentaCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    PurpleCoin = new ItemEnchantedEffect().setUnlocalizedName("PurpleCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    BlueCoin = new ItemEnchantedEffect().setUnlocalizedName("BlueCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    BrownCoin = new ItemEnchantedEffect().setUnlocalizedName("BrownCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    GrayCoin = new ItemEnchantedEffect().setUnlocalizedName("GrayCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    LightGrayCoin = new ItemEnchantedEffect().setUnlocalizedName("LightGrayCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    WhiteCoin = new ItemEnchantedEffect().setUnlocalizedName("WhiteCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    RedCoin = new ItemEnchantedEffect().setUnlocalizedName("RedCoin").setMaxStackSize(8).setCreativeTab(main.classtab);  
	    LimeCoin = new ItemEnchantedEffect().setUnlocalizedName("LimeCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    OrangeCoin = new ItemEnchantedEffect().setUnlocalizedName("OrangeCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    LightBlueCoin = new ItemEnchantedEffect().setUnlocalizedName("LightBlueCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
	    PinkCoin = new ItemEnchantedEffect().setUnlocalizedName("PinkCoin").setMaxStackSize(8).setCreativeTab(main.classtab);
		
	//end of details about the item
	}

	public static void Register()
	{
	//registering into the game
		GameRegistry.registerItem(CyanCoin, "CyanCoin");
		GameRegistry.registerItem(GreenCoin, "GreenCoin");
		GameRegistry.registerItem(YellowCoin, "YellowCoin");
		GameRegistry.registerItem(PinkCoin, "PinkCoin");
	    GameRegistry.registerItem(LightBlueCoin, "LightBlueCoin");
	    GameRegistry.registerItem(OrangeCoin, "OrangeCoin");
	    GameRegistry.registerItem(LimeCoin, "LimeCoin");
	    GameRegistry.registerItem(RedCoin, "RedCoin");
	    GameRegistry.registerItem(WhiteCoin, "WhiteCoin");
	    GameRegistry.registerItem(LightGrayCoin, "LightGrayCoin");
	    GameRegistry.registerItem(GrayCoin, "GrayCoin");
	    GameRegistry.registerItem(BrownCoin, "BrownCoin");
	    GameRegistry.registerItem(BlueCoin, "BlueCoin");
	    GameRegistry.registerItem(PurpleCoin, "PurpleCoin");
	    GameRegistry.registerItem(MagentaCoin, "MagentaCoin");
	    GameRegistry.registerItem(BlackCoin, "BlackCoin");

	//end registering into the game
	}
	
	public static void RegisterRenders()
	{
	//model rendering
		RegisterRender(CyanCoin);
		RegisterRender(GreenCoin);
		RegisterRender(YellowCoin);
		RegisterRender(PinkCoin);
		RegisterRender(LightBlueCoin);
		RegisterRender(OrangeCoin);
		RegisterRender(LimeCoin);
		RegisterRender(RedCoin);
		RegisterRender(WhiteCoin);
		RegisterRender(LightGrayCoin);
		RegisterRender(GrayCoin);
		RegisterRender(BrownCoin);
		RegisterRender(BlueCoin);
		RegisterRender(PurpleCoin);
		RegisterRender(MagentaCoin);
		RegisterRender(BlackCoin);
		
	//end model rendering
	}
	
	public static void RegisterRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
