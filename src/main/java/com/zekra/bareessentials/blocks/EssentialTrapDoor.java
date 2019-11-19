package com.zekra.bareessentials.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.material.Material;

public class EssentialTrapDoor extends TrapDoorBlock {

	public EssentialTrapDoor() {
		super(Properties.create(Material.WOOD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(3.f));

	}
}