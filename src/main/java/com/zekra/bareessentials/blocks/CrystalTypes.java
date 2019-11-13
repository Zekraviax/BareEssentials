package com.zekra.bareessentials.blocks;

import net.minecraft.util.IStringSerializable;

public enum CrystalTypes implements IStringSerializable {
	
	SCHEELITE("scheelite"),
	BORNITE("bornite");
	
	private final String name;

	private CrystalTypes(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.getName();
	}
	
	public String getName() {
		return this.name;
	}
}
