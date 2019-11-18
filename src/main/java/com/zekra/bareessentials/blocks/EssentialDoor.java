package com.zekra.bareessentials.blocks;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EssentialDoor extends DoorBlock {

	public EssentialDoor() {
		super(Properties.create(Material.WOOD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(3.f));
	}
}