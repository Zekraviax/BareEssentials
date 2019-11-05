package com.zekra.bareessentials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EssentialGemstoneBlock extends Block {

	public EssentialGemstoneBlock() {
		super(Properties.create(Material.ROCK)
				.sound(SoundType.STONE)
				.hardnessAndResistance(1f, 30.0f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(2));
	}
}