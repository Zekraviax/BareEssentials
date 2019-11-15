package com.zekra.bareessentials.blocks;

import java.util.Random;

import com.zekra.bareessentials.BareEssentials;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class EssentialCrystal extends CropsBlock implements IGrowable {

	public static final VoxelShape CRYSTAL_FIVE_COLLISION_BOX = Block.makeCuboidShape(2.5D, 0.0D, 3.0D, 12.5D, 11.0D, 14.0D);
	protected Integer TICKS_UNTIL_NEXT_GROWTH = 0;
	public static final IntegerProperty CRYSTAL_AGE = IntegerProperty.create("crystal_age", 0, 4);
	public static final EnumProperty<CrystalTypes> CRYSTAL_TYPE = EnumProperty.create("crystal_type", CrystalTypes.class);
	
	public EssentialCrystal() {
		super(Properties.create(Material.ROCK)
				.sound(SoundType.STONE)
				.hardnessAndResistance(1f, 30.0f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1)
				.doesNotBlockMovement()
				.tickRandomly());
		this.setDefaultState(this.stateContainer.getBaseState().with(this.getAgeProperty(), Integer.valueOf(0)));
		this.setDefaultState(this.stateContainer.getBaseState().with(this.getTypeProperty(), CrystalTypes.SCHEELITE));
	}
	
	@Override
	public boolean isSolid(BlockState p_200124_1_) {
	  return false;
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return CRYSTAL_FIVE_COLLISION_BOX;
	}
	
	@Override
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return true;
	}
	
	@Override
	public IntegerProperty getAgeProperty() {
	    return CRYSTAL_AGE;
	}
	
	// Type property functions
	public EnumProperty<CrystalTypes> getTypeProperty() {
		return CRYSTAL_TYPE;
	}
	
	@Override
	public int getMaxAge() {
		return 4;
	}
	
	@Override
	protected int getAge(BlockState state) {
		return state.get(this.getAgeProperty());
	}
	
	protected Enum<CrystalTypes> getType (BlockState state) {
		return state.get(this.getTypeProperty());
	}
	
	@Override
	public BlockState withAge(int age) {
		return this.getDefaultState().with(this.getAgeProperty(), Integer.valueOf(age));
	}
	
	/*
	public BlockState withType (EnumProperty<CrystalTypes> type) {
		return this.getDefaultState().with(this.getTypeProperty(), CRYSTAL_TYPE);
	}
	*/

	@Override
	public boolean isMaxAge(BlockState state) {
		return state.get(this.getAgeProperty()) >= this.getMaxAge();
	}
	
	@Override
	public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
		this.TICKS_UNTIL_NEXT_GROWTH++;
		BareEssentials.LOGGER.debug("Crystal: 'Tick' called. Age in ticks: " + this.TICKS_UNTIL_NEXT_GROWTH.toString());
		
		if (TICKS_UNTIL_NEXT_GROWTH % 4 == 0)
			grow(worldIn, pos, state);
	}
	
	@Override
    protected IItemProvider getSeedsItem() {
		return this;
	}

	@Override
	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
		return new ItemStack(this.getSeedsItem());
	}
	
	@Override
	public void grow(World worldIn, BlockPos pos, BlockState state) {
		int currentAge = this.getAge(state);
		int maxAge = this.getMaxAge();
		
		if (currentAge < maxAge)
			worldIn.setBlockState(pos, this.withAge(getAge(state) + 1), 2);
	}

	@Override
	public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return !this.isMaxAge(state);
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return false;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
		this.grow(worldIn, pos, state);
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(CRYSTAL_AGE, CRYSTAL_TYPE);
	}
}
