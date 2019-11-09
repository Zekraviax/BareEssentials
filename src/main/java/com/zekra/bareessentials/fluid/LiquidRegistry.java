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
	public static final RegistryObject<FlowingFluidBlock> LIQUID_WAX_BLOCK = BLOCKS.register("liquid_wax_block", 
			() -> new FlowingLiquidWaxBlock(LiquidRegistry.LIQUID_WAX, Block.Properties.create
					(new Material.Builder(MaterialColor.WATER).doesNotBlockMovement().notSolid().replaceable().liquid().build()).hardnessAndResistance(100.f).noDrops()));
	
	// Fluid Buckets
	public static final RegistryObject<Item> LIQUID_WAX_BUCKET = ITEMS.register("liquid_wax_bucket", 
			() -> new BucketItem(LiquidRegistry.LIQUID_WAX, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(BareEssentials.setup.bareEssentialsItemGroup)));
	
	// Fluid Sources
	public static final RegistryObject<FlowingFluid> LIQUID_WAX = FLUIDS.register("liquid_wax", 
			() -> new ForgeFlowingFluid.Source(LiquidRegistry.LIQUID_WAX_PROPERTIES));
	
	// Fluid Flowing
	public static final RegistryObject<FlowingFluid> LIQUID_WAX_FLOWING = 
			FLUIDS.register("liquid_wax_flowing", () -> new ForgeFlowingFluid.Flowing(LiquidRegistry.LIQUID_WAX_PROPERTIES));
	
	// Fluid Properties
    public static final ResourceLocation liquidWaxStillTexture = new ResourceLocation("bareessentials", "block/water_still");
    public static final ResourceLocation liquidWaxFlowingTexture = new ResourceLocation("bareessentials", "block/water_flow");
    public static final ResourceLocation liquidWaxOverlayTexture = new ResourceLocation("bareessentials", "block/water_overlay");
	
	public static final ForgeFlowingFluid.Properties LIQUID_WAX_PROPERTIES = new ForgeFlowingFluid.Properties(LIQUID_WAX, LIQUID_WAX_FLOWING, 
			FluidAttributes.builder(liquidWaxStillTexture, liquidWaxFlowingTexture).overlay(liquidWaxOverlayTexture)).bucket(LIQUID_WAX_BUCKET).block(LIQUID_WAX_BLOCK).canMultiply();
}
