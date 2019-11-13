package com.zekra.bareessentials;

import com.zekra.bareessentials.blocks.CrystalTypes;

import net.minecraft.state.EnumProperty;


public class EssentialProperties {
	
	public static EnumProperty<CrystalTypes> SCHEELITE;
	public static EnumProperty<CrystalTypes> BORNITE;
	
	public static void CreateCrystalTypes() {
		
		SCHEELITE = EnumProperty.create("scheelite", CrystalTypes.class);
		BORNITE = EnumProperty.create("bornite", CrystalTypes.class);
		
		BareEssentials.LOGGER.debug("Hello: Registered CrystalTypes");
	}
}
