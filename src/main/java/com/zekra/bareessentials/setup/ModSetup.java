package com.zekra.bareessentials.setup;

import com.zekra.bareessentials.blocks.ModBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
	
	public ItemGroup bareEssentialsItemGroup = new ItemGroup("bareessentials") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModBlocks.AMETHYST_BLOCK);
		}
	};
	
	public void init() {

	}
}