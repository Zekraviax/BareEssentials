package com.zekra.bareessentials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EssentialCrystal extends Block {

	public EssentialCrystal() {
		super(Properties.create(Material.ROCK)
				.sound(SoundType.STONE)
				.hardnessAndResistance(1f, 30.0f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1));
	}
    
	
	@Override
	public boolean isSolid(BlockState p_200124_1_) {
	  return false;
	}
	
    /*  
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    
    @OnlyIn(Dist.CLIENT)
    @Override
    public float func_220080_a(BlockState state, IBlockReader worldIn, BlockPos pos) {
        //Makes the ground stay bright
        return 1.0F;
    }
    
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public boolean isVariableOpacity() {
        return true;
    }
    */
}
