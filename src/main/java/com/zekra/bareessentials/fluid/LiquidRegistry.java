package com.zekra.bareessentials.fluid;

import com.zekra.bareessentials.BareEssentials;
import com.zekra.bareessentials.blocks.FlowingLiquidWaxBlock;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LiquidRegistry {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "bareessentials");
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "bareessentials");
	public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, "bareessentials");
	
	// Fluid Blocks
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_BLACK = BLOCKS.register("liquid_wax_block_black", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_BLACK, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_BLUE = BLOCKS.register("liquid_wax_block_blue", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_BLUE, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_BROWN = BLOCKS.register("liquid_wax_block_brown", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_BROWN, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_CREAM = BLOCKS.register("liquid_wax_block_cream", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_CREAM, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_CYAN = BLOCKS.register("liquid_wax_block_cyan", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_CYAN, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_GRAY = BLOCKS.register("liquid_wax_block_gray", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_GRAY, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_GREEN = BLOCKS.register("liquid_wax_block_green", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_GREEN, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_LIGHT_BLUE = BLOCKS.register("liquid_wax_block_light_blue", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_LIGHT_BLUE, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_LIGHT_GRAY = BLOCKS.register("liquid_wax_block_light_gray", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_LIGHT_GRAY, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_LIME = BLOCKS.register("liquid_wax_block_lime", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_LIME, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_MAGENTA = BLOCKS.register("liquid_wax_block_magenta", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_MAGENTA, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_ORANGE = BLOCKS.register("liquid_wax_block_orange", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_ORANGE, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_PINK = BLOCKS.register("liquid_wax_block_pink", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_PINK, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_PURPLE = BLOCKS.register("liquid_wax_block_purple", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_PURPLE, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_RED = BLOCKS.register("liquid_wax_block_red", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_RED, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_WHITE = BLOCKS.register("liquid_wax_block_white", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_WHITE, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK_YELLOW = BLOCKS.register("liquid_wax_block_yellow", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX_YELLOW, Block.Properties.create
			(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	
	// Fluid Buckets
    public static final Item.Properties bucketProperties = new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(BareEssentials.setup.bareEssentialsItemGroup);
    
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_BLACK = ITEMS.register("liquid_wax_bucket_black", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_BLACK, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_BLUE = ITEMS.register("liquid_wax_bucket_blue", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_BLUE, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_BROWN = ITEMS.register("liquid_wax_bucket_brown", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_BROWN, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_CREAM = ITEMS.register("liquid_wax_bucket_cream", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_CREAM, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_CYAN = ITEMS.register("liquid_wax_bucket_cyan", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_CYAN, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_GRAY = ITEMS.register("liquid_wax_bucket_gray", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_GRAY, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_GREEN = ITEMS.register("liquid_wax_bucket_green", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_GREEN, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_LIGHT_BLUE = ITEMS.register("liquid_wax_bucket_light_blue", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_LIGHT_BLUE, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_LIGHT_GRAY = ITEMS.register("liquid_wax_bucket_light_gray", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_LIGHT_GRAY, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_LIME = ITEMS.register("liquid_wax_bucket_lime", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_LIME, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_MAGENTA = ITEMS.register("liquid_wax_bucket_magenta", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_MAGENTA, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_ORANGE = ITEMS.register("liquid_wax_bucket_orange", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_ORANGE, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_PINK = ITEMS.register("liquid_wax_bucket_pink", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_PINK, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_PURPLE = ITEMS.register("liquid_wax_bucket_purple", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_PURPLE, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_RED = ITEMS.register("liquid_wax_bucket_red", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_RED, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_WHITE = ITEMS.register("liquid_wax_bucket_white", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_WHITE, bucketProperties));
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET_YELLOW = ITEMS.register("liquid_wax_bucket_yellow", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX_YELLOW, bucketProperties));
	
	// Fluid Sources
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_BLACK = FLUIDS.register("liquid_wax_black", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_BLACK_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_BLUE = FLUIDS.register("liquid_wax_blue", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_BLUE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_BROWN = FLUIDS.register("liquid_wax_brown", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_BROWN_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_CREAM = FLUIDS.register("liquid_wax_cream", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_CREAM_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_CYAN = FLUIDS.register("liquid_wax_cyan", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_CYAN_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_GRAY = FLUIDS.register("liquid_wax_gray", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_GRAY_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_GREEN = FLUIDS.register("liquid_wax_green", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_GREEN_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_LIGHT_BLUE = FLUIDS.register("liquid_wax_light_blue", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_LIGHT_BLUE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_LIGHT_GRAY = FLUIDS.register("liquid_wax_light_gray", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_LIGHT_GRAY_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_LIME = FLUIDS.register("liquid_wax_lime", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_LIME_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_MAGENTA = FLUIDS.register("liquid_wax_magenta", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_MAGENTA_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_ORANGE = FLUIDS.register("liquid_wax_orange", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_ORANGE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_PINK = FLUIDS.register("liquid_wax_pink", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_PINK_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_PURPLE = FLUIDS.register("liquid_wax_purple", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_PURPLE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_RED = FLUIDS.register("liquid_wax_red", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_RED_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_WHITE = FLUIDS.register("liquid_wax_white", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_WHITE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_YELLOW = FLUIDS.register("liquid_wax_yellow", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_YELLOW_PROPERTIES));
	
	// Fluid Flowing
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_BLACK = FLUIDS.register("liquid_wax_flowing_black", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_BLACK_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_BLUE = FLUIDS.register("liquid_wax_flowing_blue", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_BLUE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_BROWN = FLUIDS.register("liquid_wax_flowing_brown", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_BROWN_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_CREAM = FLUIDS.register("liquid_wax_flowing_cream", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_CREAM_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_CYAN = FLUIDS.register("liquid_wax_flowing_cyan", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_CYAN_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_GRAY = FLUIDS.register("liquid_wax_flowing_gray", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_GRAY_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_GREEN = FLUIDS.register("liquid_wax_flowing_green", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_GREEN_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_LIGHT_BLUE = FLUIDS.register("liquid_wax_flowing_light_blue", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_LIGHT_BLUE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_LIGHT_GRAY = FLUIDS.register("liquid_wax_flowing_light_gray", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_LIGHT_GRAY_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_LIME = FLUIDS.register("liquid_wax_flowing_lime", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_LIME_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_MAGENTA = FLUIDS.register("liquid_wax_flowing_magenta", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_MAGENTA_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_ORANGE = FLUIDS.register("liquid_wax_flowing_orange", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_ORANGE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_PINK = FLUIDS.register("liquid_wax_flowing_pink", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_PINK_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_PURPLE = FLUIDS.register("liquid_wax_flowing_purple", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_PURPLE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_RED = FLUIDS.register("liquid_wax_flowing_red", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_RED_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_WHITE = FLUIDS.register("liquid_wax_flowing_white", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_WHITE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING_YELLOW = FLUIDS.register("liquid_wax_flowing_yellow", 
			() -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_YELLOW_PROPERTIES));
	
	// Variables
    public static final ResourceLocation liquidWaxStillTexture = new ResourceLocation("bareessentials", "block/wax_still");
    public static final ResourceLocation liquidWaxFlowingTexture = new ResourceLocation("bareessentials", "block/wax_flow");
    public static final ResourceLocation liquidWaxOverlayTexture = new ResourceLocation("bareessentials", "block/wax_overlay");
   
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_BLACK_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_BLACK, LIQUID_WAX_FLOWING_BLACK, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFF1a1a1a)).
    		bucket(LIQUID_WAX_BUCKET_BLACK).block(LIQUID_WAX_BLOCK_BLACK).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_BLUE_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_BLUE, LIQUID_WAX_FLOWING_BLUE, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFF7774fc)).
    		bucket(LIQUID_WAX_BUCKET_BLUE).block(LIQUID_WAX_BLOCK_BLUE).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_BROWN_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_BROWN, LIQUID_WAX_FLOWING_BROWN, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFF7d3e2a)).
    		bucket(LIQUID_WAX_BUCKET_BROWN).block(LIQUID_WAX_BLOCK_BROWN).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_CREAM_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_CREAM, LIQUID_WAX_FLOWING_CREAM, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFffedd6)).
    		bucket(LIQUID_WAX_BUCKET_CREAM).block(LIQUID_WAX_BLOCK_CREAM).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_CYAN_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_CYAN, LIQUID_WAX_FLOWING_CYAN, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFF76e3d6)).
    		bucket(LIQUID_WAX_BUCKET_CYAN).block(LIQUID_WAX_BLOCK_CYAN).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_GRAY_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_GRAY, LIQUID_WAX_FLOWING_GRAY, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFF4f4f4f)).
    		bucket(LIQUID_WAX_BUCKET_GRAY).block(LIQUID_WAX_BLOCK_GRAY).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_GREEN_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_GREEN, LIQUID_WAX_FLOWING_GREEN, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFF7dffa2)).
    		bucket(LIQUID_WAX_BUCKET_GREEN).block(LIQUID_WAX_BLOCK_GREEN).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_LIGHT_BLUE_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_LIGHT_BLUE, LIQUID_WAX_FLOWING_LIGHT_BLUE, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFF78c7ff)).
    		bucket(LIQUID_WAX_BUCKET_LIGHT_BLUE).block(LIQUID_WAX_BLOCK_LIGHT_BLUE).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_LIGHT_GRAY_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_LIGHT_GRAY, LIQUID_WAX_FLOWING_LIGHT_GRAY, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFF8c8c8c)).
    		bucket(LIQUID_WAX_BUCKET_LIGHT_GRAY).block(LIQUID_WAX_BLOCK_LIGHT_GRAY).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_LIME_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_LIME, LIQUID_WAX_FLOWING_LIME, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFbbeb7c)).
    		bucket(LIQUID_WAX_BUCKET_LIME).block(LIQUID_WAX_BLOCK_LIME).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_MAGENTA_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_MAGENTA, LIQUID_WAX_FLOWING_MAGENTA, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFff61ab)).
    		bucket(LIQUID_WAX_BUCKET_MAGENTA).block(LIQUID_WAX_BLOCK_MAGENTA).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_ORANGE_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_ORANGE, LIQUID_WAX_FLOWING_ORANGE, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFffa557)).
    		bucket(LIQUID_WAX_BUCKET_ORANGE).block(LIQUID_WAX_BLOCK_ORANGE).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_PINK_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_PINK, LIQUID_WAX_FLOWING_PINK, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFffabc8)).
    		bucket(LIQUID_WAX_BUCKET_PINK).block(LIQUID_WAX_BLOCK_PINK).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_PURPLE_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_PURPLE, LIQUID_WAX_FLOWING_PURPLE, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFda61ff)).
    		bucket(LIQUID_WAX_BUCKET_PURPLE).block(LIQUID_WAX_BLOCK_PURPLE).slopeFindDistance(0);
    public static final ForgeFlowingFluid.Properties LIQUID_WAX_RED_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_RED, LIQUID_WAX_FLOWING_RED, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFff5757)).
    		bucket(LIQUID_WAX_BUCKET_RED).block(LIQUID_WAX_BLOCK_RED).slopeFindDistance(0);
	public static final ForgeFlowingFluid.Properties LIQUID_WAX_WHITE_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_WHITE, LIQUID_WAX_FLOWING_WHITE, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFebebeb)).
			bucket(LIQUID_WAX_BUCKET_WHITE).block(LIQUID_WAX_BLOCK_WHITE).slopeFindDistance(0);
	public static final ForgeFlowingFluid.Properties LIQUID_WAX_YELLOW_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX_YELLOW, LIQUID_WAX_FLOWING_YELLOW, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture).color(0xFFffdd57)).
    		bucket(LIQUID_WAX_BUCKET_YELLOW).block(LIQUID_WAX_BLOCK_YELLOW).slopeFindDistance(0);
}
