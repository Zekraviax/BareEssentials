package com.zekra.bareessentials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.util.Constants;

public class WaxBlock extends Block {

	public WaxBlock() {
		super(Properties.create(Material.ROCK)
				.sound(SoundType.STONE)
				.hardnessAndResistance(3f, 6.0f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(0));
	}
	
	// Detect any "heat sources" when placed next to this
	public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		if (worldIn.getBlockState(fromPos) == Blocks.MAGMA_BLOCK.getDefaultState() ||
				// Lava needs to check for any liquid level
				worldIn.getBlockState(fromPos) == Blocks.LAVA.getDefaultState() ||
				worldIn.getBlockState(fromPos) == Blocks.FIRE.getDefaultState() ||
				worldIn.getBlockState(fromPos) == Blocks.GLOWSTONE.getDefaultState() ||
				worldIn.getBlockState(fromPos) == Blocks.TORCH.getDefaultState() ||
				worldIn.getBlockState(fromPos) == Blocks.LANTERN.getDefaultState() ||
				// Campfires need to check for a special state
				worldIn.getBlockState(fromPos) == Blocks.CAMPFIRE.getDefaultState()) {
			
			System.out.println("Hello: Found a neighbouring heat source.");
			Block.replaceBlock(this.getDefaultState(), ModBlocks.LIQUID_WAX_BLOCK_WHITE.getDefaultState(), worldIn, pos, Constants.BlockFlags.DEFAULT_AND_RERENDER);
		} 
		else 
		{
			System.out.println("Hello: Neighbour is a: " + worldIn.getBlockState(fromPos).toString());
		}
	}
}