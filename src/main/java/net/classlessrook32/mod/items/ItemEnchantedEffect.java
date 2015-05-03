package net.classlessrook32.mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEnchantedEffect extends Item{
	
	@Override
	public boolean hasEffect(ItemStack par1ItemStack){
		return true;
	}
}
