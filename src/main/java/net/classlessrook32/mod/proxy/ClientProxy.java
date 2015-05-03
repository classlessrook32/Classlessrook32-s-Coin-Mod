package net.classlessrook32.mod.proxy;

import net.classlessrook32.mod.init.ClassItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void RegisterRenders()
	{
		ClassItems.RegisterRenders();
	}
}
