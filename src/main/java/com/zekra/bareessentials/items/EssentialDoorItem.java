package com.zekra.bareessentials.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.TallBlockItem;

public class EssentialDoorItem extends TallBlockItem {

	public EssentialDoorItem(Block blockIn, Properties builder) {
		super(blockIn, builder);
	}
	
	@Override   
	protected boolean placeBlock(BlockItemUseContext context, BlockState state) {
		context.getWorld().setBlockState(context.getPos().up(), Blocks.AIR.getDefaultState(), 27);
	    return super.placeBlock(context, state);
	}
}