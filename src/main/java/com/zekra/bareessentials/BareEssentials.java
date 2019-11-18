package com.zekra.bareessentials;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zekra.bareessentials.biomes.EssentialBiomes;
import com.zekra.bareessentials.biomes.OutbackTest;
import com.zekra.bareessentials.blocks.EssentialCrystal;
import com.zekra.bareessentials.blocks.EssentialDoor;
import com.zekra.bareessentials.blocks.EssentialGemstoneBlock;
import com.zekra.bareessentials.blocks.EssentialOre;
import com.zekra.bareessentials.blocks.ModBlocks;
import com.zekra.bareessentials.blocks.WaxBlock;
import com.zekra.bareessentials.fluid.LiquidRegistry;
import com.zekra.bareessentials.items.EssentialDoorItem;
import com.zekra.bareessentials.items.EssentialGemstone;
import com.zekra.bareessentials.items.EssentialKnife;
import com.zekra.bareessentials.items.EssentialOreChunk;
import com.zekra.bareessentials.items.ModItems;
import com.zekra.bareessentials.items.WaxFlake;
import com.zekra.bareessentials.items.tiers.Essential_ItemTiers;
import com.zekra.bareessentials.setup.ModSetup;
import com.zekra.bareessentials.world.OreGeneration;

import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bareessentials")
public class BareEssentials {
	
	//public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	public static final String MOD_ID = "bareessentials";
	public static final Logger LOGGER = LogManager.getLogger();
	public static ModSetup setup = new ModSetup();
		
	public BareEssentials() {	
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
			
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		MinecraftForge.EVENT_BUS.register(this);
		
		LiquidRegistry.BLOCKS.register(modEventBus);
		LiquidRegistry.ITEMS.register(modEventBus);
		LiquidRegistry.FLUIDS.register(modEventBus);
	}
		
	public void setup(final FMLCommonSetupEvent event) {
		OreGeneration.SetupOreGeneration();
		setup.init();
			
		//LOGGER.info("Logger: OreGen complete!");
		//proxy.init();
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		OBJLoader.INSTANCE.addDomain("bareessentials");
	}

	
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(
				// Raw Ore blocks
				ModBlocks.BASALT = new EssentialOre().setRegistryName(MOD_ID, "basalt"),
				ModBlocks.BRECCIA = new EssentialOre().setRegistryName(MOD_ID, "breccia"),
				ModBlocks.CONGLOMERATE = new EssentialOre().setRegistryName(MOD_ID, "conglomerate"),
				ModBlocks.GABBRO = new EssentialOre().setRegistryName(MOD_ID, "gabbro"),
				ModBlocks.GNEISS = new EssentialOre().setRegistryName(MOD_ID, "gneiss"),
				ModBlocks.LIMESTONE = new EssentialOre().setRegistryName(MOD_ID, "limestone"),
				ModBlocks.MARBLE = new EssentialOre().setRegistryName(MOD_ID, "marble"),
				ModBlocks.PUMICE = new EssentialOre().setRegistryName(MOD_ID, "pumice"),
				ModBlocks.QUARTZITE = new EssentialOre().setRegistryName(MOD_ID, "quartzite"),
				ModBlocks.SCHIST = new EssentialOre().setRegistryName(MOD_ID, "schist"),
				ModBlocks.SHALE = new EssentialOre().setRegistryName(MOD_ID, "shale"),
				ModBlocks.SLATE = new EssentialOre().setRegistryName(MOD_ID, "slate"),
				
				// Gemstone blocks
				ModBlocks.AMETHYST_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "amethyst_block"),
				ModBlocks.BLUEGOLDSTONE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "bluegoldstone_block"),
				ModBlocks.EMERALD_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "emerald_block"),
				ModBlocks.GARNET_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "garnet_block"),
				ModBlocks.GOLDSTONE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "goldstone_block"),
				ModBlocks.OLIVINE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "olivine_block"),
				ModBlocks.RUBY_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "ruby_block"),
				ModBlocks.TURQUOISE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "turquoise_block"),
				
				// Wax Blocks
				ModBlocks.WAX_BLOCK_BLACK = new WaxBlock().setRegistryName(MOD_ID, "wax_block_black"),
				ModBlocks.WAX_BLOCK_BLUE = new WaxBlock().setRegistryName(MOD_ID, "wax_block_blue"),
				ModBlocks.WAX_BLOCK_BROWN = new WaxBlock().setRegistryName(MOD_ID, "wax_block_brown"),
				ModBlocks.WAX_BLOCK_CREAM = new WaxBlock().setRegistryName(MOD_ID, "wax_block_cream"),
				ModBlocks.WAX_BLOCK_CYAN = new WaxBlock().setRegistryName(MOD_ID, "wax_block_cyan"),
				ModBlocks.WAX_BLOCK_GRAY = new WaxBlock().setRegistryName(MOD_ID, "wax_block_gray"),
				ModBlocks.WAX_BLOCK_GREEN = new WaxBlock().setRegistryName(MOD_ID, "wax_block_green"),
				ModBlocks.WAX_BLOCK_LIGHT_BLUE = new WaxBlock().setRegistryName(MOD_ID, "wax_block_light_blue"),
				ModBlocks.WAX_BLOCK_LIGHT_GRAY = new WaxBlock().setRegistryName(MOD_ID, "wax_block_light_gray"),
				ModBlocks.WAX_BLOCK_LIME = new WaxBlock().setRegistryName(MOD_ID, "wax_block_lime"),
				ModBlocks.WAX_BLOCK_MAGENTA = new WaxBlock().setRegistryName(MOD_ID, "wax_block_magenta"),
				ModBlocks.WAX_BLOCK_ORANGE = new WaxBlock().setRegistryName(MOD_ID, "wax_block_orange"),
				ModBlocks.WAX_BLOCK_PINK = new WaxBlock().setRegistryName(MOD_ID, "wax_block_pink"),
				ModBlocks.WAX_BLOCK_PURPLE = new WaxBlock().setRegistryName(MOD_ID, "wax_block_purple"),
				ModBlocks.WAX_BLOCK_RED = new WaxBlock().setRegistryName(MOD_ID, "wax_block_red"),
				ModBlocks.WAX_BLOCK_WHITE = new WaxBlock().setRegistryName(MOD_ID, "wax_block_white"),
				ModBlocks.WAX_BLOCK_YELLOW = new WaxBlock().setRegistryName(MOD_ID, "wax_block_yellow"),
				
				// Crystal Blocks
				ModBlocks.BORNITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "bornite_crystal"),
				ModBlocks.CASSITERITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "cassiterite_crystal"),
				ModBlocks.CINNABAR_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "cinnabar_crystal"),
				ModBlocks.DOLOMITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "dolomite_crystal"),
				ModBlocks.GALENA_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "galena_crystal"),
				ModBlocks.HEMATITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "hematite_crystal"),
				ModBlocks.ILMENITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "ilmenite_crystal"),
				ModBlocks.PENTLANDITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "pentlandite_crystal"),
				ModBlocks.PYROLUSITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "pyrolusite_crystal"),
				ModBlocks.SCHEELITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "scheelite_crystal"),
				ModBlocks.SPERRYLITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "sperrylite_crystal"),
				ModBlocks.SPHALERITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "sphalerite_crystal"),
				ModBlocks.URANINITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "uraninite_crystal"),
				ModBlocks.WOLFRAMITE_CRYSTAL = new EssentialCrystal().setRegistryName(MOD_ID, "wolframite_crystal"),
				
				// Trees and Wood
				ModBlocks.GUM_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(4.0F).sound(SoundType.WOOD)).setRegistryName("gum_log"),
				ModBlocks.GUM_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName("gum_leaves"),
				ModBlocks.GUM_DOOR = new EssentialDoor().setRegistryName("gum_door"),
				ModBlocks.GUM_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("gum_planks"),
				ModBlocks.EUCALYPTUS_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(4.0F).sound(SoundType.WOOD)).setRegistryName("eucalyptus_log"),
				ModBlocks.EUCALYPTUS_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName("eucalyptus_leaves"),
				ModBlocks.EUCALYPTUS_DOOR = new EssentialDoor().setRegistryName("eucalyptus_door"),
				ModBlocks.EUCALYPTUS_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("eucalyptus_planks")
			);
		}
	
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			Item.Properties properties = new Item.Properties().group(setup.bareEssentialsItemGroup);
			
			event.getRegistry().registerAll
			(
				// Raw Ore BlockItems
				new BlockItem(ModBlocks.BASALT, properties).setRegistryName("basalt"),
				new BlockItem(ModBlocks.BRECCIA, properties).setRegistryName("breccia"),
				new BlockItem(ModBlocks.CONGLOMERATE, properties).setRegistryName("conglomerate"),
				new BlockItem(ModBlocks.GABBRO, properties).setRegistryName("gabbro"),
				new BlockItem(ModBlocks.GNEISS, properties).setRegistryName("gneiss"),
				new BlockItem(ModBlocks.LIMESTONE, properties).setRegistryName("limestone"),
				new BlockItem(ModBlocks.MARBLE, properties).setRegistryName("marble"),
				new BlockItem(ModBlocks.PUMICE, properties).setRegistryName("pumice"),
				new BlockItem(ModBlocks.QUARTZITE, properties).setRegistryName("quartzite"),
				new BlockItem(ModBlocks.SCHIST, properties).setRegistryName("schist"),
				new BlockItem(ModBlocks.SHALE, properties).setRegistryName("shale"),
				new BlockItem(ModBlocks.SLATE, properties).setRegistryName("slate"),
				
				// Ore Chunks
				ModItems.ALUMINIUM_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("aluminium_chunk"),
				ModItems.COPPER_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("copper_chunk"),
				ModItems.GOLD_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("gold_chunk"),
				ModItems.IRON_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("iron_chunk"),
				ModItems.LEAD_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("lead_chunk"),
				ModItems.MANGANESE_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("manganese_chunk"),
				ModItems.NICKEL_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("nickel_chunk"),
				ModItems.PLATINUM_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("platinum_chunk"),
				ModItems.SILVER_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("silver_chunk"),
				ModItems.TIN_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("tin_chunk"),
				ModItems.TITANIUM_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("titanium_chunk"),
				ModItems.TUNGSTEN_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("tungsten_chunk"),
				ModItems.URANIUM_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("uranium_chunk"),
				ModItems.ZINC_CHUNK = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("zinc_chunk"),
				
				// Ingots
				ModItems.ALUMINIUM_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("aluminium_ingot"),
				ModItems.BRASS_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("brass_ingot"),
				ModItems.BRONZE_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("bronze_ingot"),
				ModItems.COPPER_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("copper_ingot"),
				ModItems.LEAD_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("lead_ingot"),
				ModItems.MANGANESE_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("manganese_ingot"),
				ModItems.NICKEL_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("nickel_ingot"),
				ModItems.PLATINUM_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("platinum_ingot"),
				ModItems.SILVER_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("silver_ingot"),
				ModItems.STEEL_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("steel_ingot"),
				ModItems.TIN_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("tin_ingot"),
				ModItems.TITANIUM_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("titanium_ingot"),
				ModItems.TUNGSTEN_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("tungsten_ingot"),
				ModItems.ZINC_INGOT = (EssentialOreChunk) new EssentialOreChunk(properties).setRegistryName("zinc_ingot"),
				
				// Gemstone BlockItems
				new BlockItem(ModBlocks.AMETHYST_BLOCK, properties).setRegistryName("amethyst_block"),
				new BlockItem(ModBlocks.BLUEGOLDSTONE_BLOCK, properties).setRegistryName("bluegoldstone_block"),
				new BlockItem(ModBlocks.EMERALD_BLOCK, properties).setRegistryName("emerald_block"),
				new BlockItem(ModBlocks.GARNET_BLOCK, properties).setRegistryName("garnet_block"),
				new BlockItem(ModBlocks.GOLDSTONE_BLOCK, properties).setRegistryName("goldstone_block"),
				new BlockItem(ModBlocks.OLIVINE_BLOCK, properties).setRegistryName("olivine_block"),
				new BlockItem(ModBlocks.RUBY_BLOCK, properties).setRegistryName("ruby_block"),
				new BlockItem(ModBlocks.TURQUOISE_BLOCK, properties).setRegistryName("turquoise_block"),
				
				// Gemstones
				ModItems.AMETHYST = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("amethyst"),
				ModItems.BLUEGOLDSTONE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("bluegoldstone"),
				ModItems.EMERALD = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("emerald"),
				ModItems.GARNET = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("garnet"),
				ModItems.GOLDSTONE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("goldstone"),
				ModItems.OLIVINE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("olivine"),
				ModItems.RUBY = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("ruby"),
				ModItems.SAPPHIRE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("sapphire"),
				ModItems.TURQUOISE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("turquoise"),
				
				// Wax Blocks
				new BlockItem(ModBlocks.WAX_BLOCK_BLACK, properties).setRegistryName("wax_block_black"),
				new BlockItem(ModBlocks.WAX_BLOCK_BLUE, properties).setRegistryName("wax_block_blue"),
				new BlockItem(ModBlocks.WAX_BLOCK_BROWN, properties).setRegistryName("wax_block_brown"),
				new BlockItem(ModBlocks.WAX_BLOCK_CREAM, properties).setRegistryName("wax_block_cream"),
				new BlockItem(ModBlocks.WAX_BLOCK_CYAN, properties).setRegistryName("wax_block_cyan"),
				new BlockItem(ModBlocks.WAX_BLOCK_GRAY, properties).setRegistryName("wax_block_gray"),
				new BlockItem(ModBlocks.WAX_BLOCK_GREEN, properties).setRegistryName("wax_block_green"),
				new BlockItem(ModBlocks.WAX_BLOCK_LIGHT_BLUE, properties).setRegistryName("wax_block_light_blue"),
				new BlockItem(ModBlocks.WAX_BLOCK_LIGHT_GRAY, properties).setRegistryName("wax_block_light_gray"),
				new BlockItem(ModBlocks.WAX_BLOCK_LIME, properties).setRegistryName("wax_block_lime"),
				new BlockItem(ModBlocks.WAX_BLOCK_MAGENTA, properties).setRegistryName("wax_block_magenta"),
				new BlockItem(ModBlocks.WAX_BLOCK_ORANGE, properties).setRegistryName("wax_block_orange"),
				new BlockItem(ModBlocks.WAX_BLOCK_PINK, properties).setRegistryName("wax_block_pink"),
				new BlockItem(ModBlocks.WAX_BLOCK_PURPLE, properties).setRegistryName("wax_block_purple"),
				new BlockItem(ModBlocks.WAX_BLOCK_RED, properties).setRegistryName("wax_block_red"),
				new BlockItem(ModBlocks.WAX_BLOCK_WHITE, properties).setRegistryName("wax_block_white"),
				new BlockItem(ModBlocks.WAX_BLOCK_YELLOW, properties).setRegistryName("wax_block_yellow"),
				
				// Wax Flakes
				ModItems.WAX_FLAKE_BLACK = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_black"),
				ModItems.WAX_FLAKE_BLUE = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_blue"),
				ModItems.WAX_FLAKE_BROWN = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_brown"),
				ModItems.WAX_FLAKE_CREAM = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_cream"),
				ModItems.WAX_FLAKE_CYAN = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_cyan"),
				ModItems.WAX_FLAKE_GRAY = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_gray"),
				ModItems.WAX_FLAKE_GREEN = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_green"),
				ModItems.WAX_FLAKE_LIGHT_BLUE = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_light_blue"),
				ModItems.WAX_FLAKE_LIGHT_GRAY = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_light_gray"),
				ModItems.WAX_FLAKE_LIME = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_lime"),
				ModItems.WAX_FLAKE_MAGENTA = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_magenta"),
				ModItems.WAX_FLAKE_ORANGE = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_orange"),
				ModItems.WAX_FLAKE_PINK = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_pink"),
				ModItems.WAX_FLAKE_PURPLE = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_purple"),
				ModItems.WAX_FLAKE_RED = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_red"),
				ModItems.WAX_FLAKE_WHITE = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_white"),
				ModItems.WAX_FLAKE_YELLOW = (WaxFlake) new WaxFlake(properties).setRegistryName("wax_flake_yellow"),
				
				// Crystal BlockItems
				new BlockItem(ModBlocks.BORNITE_CRYSTAL, properties).setRegistryName("bornite_crystal"),
				new BlockItem(ModBlocks.CASSITERITE_CRYSTAL, properties).setRegistryName("cassiterite_crystal"),
				new BlockItem(ModBlocks.CINNABAR_CRYSTAL, properties).setRegistryName("cinnabar_crystal"),
				new BlockItem(ModBlocks.DOLOMITE_CRYSTAL, properties).setRegistryName("dolomite_crystal"),
				new BlockItem(ModBlocks.GALENA_CRYSTAL, properties).setRegistryName("galena_crystal"),
				new BlockItem(ModBlocks.HEMATITE_CRYSTAL, properties).setRegistryName("hematite_crystal"),
				new BlockItem(ModBlocks.ILMENITE_CRYSTAL, properties).setRegistryName("ilmenite_crystal"),
				new BlockItem(ModBlocks.PENTLANDITE_CRYSTAL, properties).setRegistryName("pentlandite_crystal"),
				new BlockItem(ModBlocks.PYROLUSITE_CRYSTAL, properties).setRegistryName("pyrolusite_crystal"),
				new BlockItem(ModBlocks.SCHEELITE_CRYSTAL, properties).setRegistryName("scheelite_crystal"),
				new BlockItem(ModBlocks.SPERRYLITE_CRYSTAL, properties).setRegistryName("sperrylite_crystal"),
				new BlockItem(ModBlocks.SPHALERITE_CRYSTAL, properties).setRegistryName("sphalerite_crystal"),
				new BlockItem(ModBlocks.URANINITE_CRYSTAL, properties).setRegistryName("uraninite_crystal"),
				new BlockItem(ModBlocks.WOLFRAMITE_CRYSTAL, properties).setRegistryName("wolframite_crystal"),
				
				// Trees and Wood
				new BlockItem(ModBlocks.GUM_LOG, properties).setRegistryName("gum_log"),
				new BlockItem(ModBlocks.GUM_LEAVES, properties).setRegistryName("gum_leaves"),
				new EssentialDoorItem(ModBlocks.GUM_DOOR, properties).setRegistryName("gum_door"),
				new BlockItem(ModBlocks.GUM_PLANKS, properties).setRegistryName("gum_planks"),
				new BlockItem(ModBlocks.EUCALYPTUS_LOG, properties).setRegistryName("eucalyptus_log"),
				new BlockItem(ModBlocks.EUCALYPTUS_LEAVES, properties).setRegistryName("eucalyptus_leaves"),
				new EssentialDoorItem(ModBlocks.EUCALYPTUS_DOOR, properties).setRegistryName("eucalyptus_door"),
				new BlockItem(ModBlocks.EUCALYPTUS_PLANKS, properties).setRegistryName("eucalyptus_planks"),
				
				
				// Knives
				new EssentialKnife(ItemTier.STONE, 1, 10.f, properties).setRegistryName("stone_knife"),
				
				// Tools
				//Items.DIAMOND_PICKAXE
				ModItems.TITANIUM_PICKAXE = (PickaxeItem) new PickaxeItem(Essential_ItemTiers.TITANIUM, 0, 0.f, properties).setRegistryName("titanium_pickaxe"),
				
				// Other
				ModItems.FOSSIL = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("fossil"),
				ModItems.ROCK = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("rock")
				
			);
		}
		 
		@SubscribeEvent
		public static void registerBiomes(final RegistryEvent.Register<Biome> event)
		{
			event.getRegistry().registerAll
			(
				EssentialBiomes.OutbackTestBiome = new OutbackTest().setRegistryName("outback_test")
			);
		}

		/*
		@SubscribeEvent
		public static void onModelRegister(ModelRegistryEvent event)
		{
			LOGGER.debug("Hello: Models Registered");
		}
		*/
		
		@SubscribeEvent
		public static void onModelBakeEvent(ModelBakeEvent event) {
			CrystalModelRegistry.RegisterCrystalModels(event);
		}

	    @SubscribeEvent
	    public static void onPreTextureStitch(TextureStitchEvent.Pre event) {
	        //event.addSprite(ResourceLocation.tryCreate("bareessentials:block/scheelite"));
	        //event.addSprite(ResourceLocation.tryCreate("bareessentials:block/bornite"));
	    }
	}
}