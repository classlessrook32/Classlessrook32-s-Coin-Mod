package net.classlessrook32.mod.main;

import net.classlessrook32.mod.init.ClassItems;
import net.classlessrook32.mod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class main {
		
	public static CreativeTabs classtab = new CreativeTabs("Coins")
	  {
	    public Item getTabIconItem()
	    {
	      return ClassItems.CyanCoin;
	    }
	  };
	 	  
	@SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
	public static CommonProxy  proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Recipes.initShapedRecipes();
		
		System.out.println("[Classlessrook32's Coin Mod] Thank You for downloading \"Classlessrook32\'s Coin Mod!\"");
		System.out.println("[Classlessrook32's Coin Mod] We are now entering the PreInitialization of \"Classlessrook32's Coin Mod\"");
		
		ClassItems.init();
		ClassItems.Register();
		
	}
	
		@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("[Classlessrook32's Coin Mod]We are now entering the Initialization of \"Classlessrook32's Coin Mod\"");

		proxy.RegisterRenders();

		GameRegistry.addShapedRecipe(new ItemStack(ClassItems.BlackCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 0) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.RedCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 1) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.GreenCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 2) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.BrownCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 3) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.BlueCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 4) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.PurpleCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 5) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.CyanCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 6) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.LightGrayCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 7) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.GrayCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 8) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.PinkCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 9) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.LimeCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 10) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.YellowCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 11) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.LightBlueCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 12) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.MagentaCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 13) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.OrangeCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 14) });
	    GameRegistry.addShapedRecipe(new ItemStack(ClassItems.WhiteCoin), new Object[] { "ggg", "gdg", "ggg", 'g', Items.gold_nugget, 'd', new ItemStack(Items.dye, 1, 15) });
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("[Classlessrook32's Coin Mod] We are now entering the PostInitialization of \"Classlessrook32's Coin Mod\" Thank you for using my mod!");

	}
}
