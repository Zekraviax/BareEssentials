package com.zekra.bareessentials.items;

import com.zekra.bareessentials.BareEssentials;

import net.minecraft.item.Item;

public class EssentialIngot extends Item {

	public EssentialIngot(Properties properties) {
		super(new Item.Properties()
				.group(BareEssentials.setup.bareEssentialsItemGroup));
		
	}
}
