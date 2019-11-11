package com.zekra.bareessentials.items.tiers;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import com.zekra.bareessentials.items.ModItems;

public enum Essential_ItemTiers implements IItemTier {
	TITANIUM(5.f, 10.f, 1000, 6, 20, ModItems.TITANIUM_INGOT);
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private Essential_ItemTiers(float attackDamageIn, float efficiencyIn, int durabilityIn, int harvestLevelIn, int enchantabilityIn, Item repairMaterialIn) {
		this.attackDamage = attackDamageIn;
		this.efficiency = efficiencyIn;
		this.durability = durabilityIn;
		this.harvestLevel = harvestLevelIn;
		this.enchantability = enchantabilityIn;
		this.repairMaterial = repairMaterialIn;
	}

	@Override
	public int getMaxUses() {
		return durability;
	}

	@Override
	public float getEfficiency() {
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		return attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}
}
