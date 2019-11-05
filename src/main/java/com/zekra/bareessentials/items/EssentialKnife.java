package com.zekra.bareessentials.items;

import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class EssentialKnife extends SwordItem {
	public EssentialKnife(ItemTier tier, int attackDamage, float attackSpeedIn, Properties properties) {
		super(tier, attackDamage, attackSpeedIn, properties);
		this.setRegistryName("stone_knife");
	}
}
