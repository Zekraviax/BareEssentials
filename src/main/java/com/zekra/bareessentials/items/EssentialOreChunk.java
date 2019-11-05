package com.zekra.bareessentials.items;

import com.zekra.bareessentials.BareEssentials;

import net.minecraft.item.Item;

public class EssentialOreChunk extends Item {

	public EssentialOreChunk(Properties properties) {
		super(new Item.Properties()
				.group(BareEssentials.setup.bareEssentialsItemGroup));
		
	}
}