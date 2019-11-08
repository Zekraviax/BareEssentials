package com.zekra.bareessentials.fluid;

import com.zekra.bareessentials.BareEssentials;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
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

public class LiquidWax {
	
	// Fluid assets for the FluidAttributes.builder
	public static final ResourceLocation STILL_WAX = new ResourceLocation("minecraft:block/brown_mushroom_block");
	public static final ResourceLocation FLOWING_WAX = new ResourceLocation("minecraft:block/mushroom_stem");
	
	// Set up registries
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "bareessentials");
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "bareessentials");
	public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, "bareessentials");

	// Register Fluid
	public static RegistryObject<FlowingFluid> liquid_wax = FLUIDS.register("liquid_wax", 
			() -> new ForgeFlowingFluid.Source(LiquidWax.liquid_wax_properties));
	// Register Flowing Fluid
	public static RegistryObject<FlowingFluid> liquid_wax_flowing = FLUIDS.register("liquid_wax_flowing", 
			() -> new ForgeFlowingFluid.Flowing(LiquidWax.liquid_wax_properties));
	// Register Fluid (Source?) Block
	public static RegistryObject<FlowingFluidBlock> liquid_wax_block = BLOCKS.register("liquid_wax_block", 
			() -> new FlowingFluidBlock(liquid_wax, Block.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0F).noDrops()));
	// Register Fluid Bucket Item
	public static RegistryObject<Item> liquid_wax_bucket = ITEMS.register("liquid_wax_bucket", 
		() -> new BucketItem(liquid_wax, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(BareEssentials.setup.bareEssentialsItemGroup)));
			
	// Liquid Wax properties
	public static final ForgeFlowingFluid.Properties liquid_wax_properties = new ForgeFlowingFluid.Properties(liquid_wax, liquid_wax_flowing, 
			FluidAttributes.builder(STILL_WAX, FLOWING_WAX).color(0x00FF00)).bucket(liquid_wax_bucket).block(liquid_wax_block);

	/*

	// Register LiquidWax to modEventBus
	public LiquidWax() {

		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);
		FLUIDS.register(modEventBus);

		
		System.out.println("Hello: Registered LiquidWax.");
	}
	
	*/
}
