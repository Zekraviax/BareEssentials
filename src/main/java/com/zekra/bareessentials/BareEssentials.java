package com.zekra.bareessentials;

import com.zekra.bareessentials.blocks.*;
import com.zekra.bareessentials.blocks.trees.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zekra.bareessentials.biomes.EssentialBiomes;
import com.zekra.bareessentials.biomes.OutbackTest;
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
import net.minecraft.block.Block.Properties;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
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
			Properties metalProperties = Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1.5f, 6.0f).harvestTool(ToolType.PICKAXE).harvestLevel(2);
			
			event.getRegistry().registerAll
			(
				// Raw Ore
				ModBlocks.BASALT = new EssentialOre().setRegistryName(MOD_ID, "basalt"),
				ModBlocks.BRECCIA = new EssentialOre().setRegistryName(MOD_ID, "breccia"),
				ModBlocks.CONGLOMERATE = new EssentialOre().setRegistryName(MOD_ID, "conglomerate"),
				ModBlocks.GABBRO = new EssentialOre().setRegistryName(MOD_ID, "gabbro"),
				ModBlocks.GNEISS = new EssentialOre().setRegistryName(MOD_ID, "gneiss"),
				ModBlocks.GYPSUM = new EssentialOre().setRegistryName(MOD_ID, "gypsum"),
				ModBlocks.LIMESTONE = new EssentialOre().setRegistryName(MOD_ID, "limestone"),
				ModBlocks.MARBLE = new EssentialOre().setRegistryName(MOD_ID, "marble"),
				ModBlocks.PUMICE = new EssentialOre().setRegistryName(MOD_ID, "pumice"),
				ModBlocks.QUARTZITE = new EssentialOre().setRegistryName(MOD_ID, "quartzite"),
				ModBlocks.RHYOLITE = new EssentialOre().setRegistryName(MOD_ID, "rhyolite"),
				ModBlocks.SCHIST = new EssentialOre().setRegistryName(MOD_ID, "schist"),
				ModBlocks.SHALE = new EssentialOre().setRegistryName(MOD_ID, "shale"),
				ModBlocks.SLATE = new EssentialOre().setRegistryName(MOD_ID, "slate"),
				
				// Metals
				ModBlocks.ALUMINIUM_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "aluminium_block"),
				ModBlocks.BRASS_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "brass_block"),
				ModBlocks.BRONZE_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "bronze_block"),
				ModBlocks.COPPER_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "copper_block"),
				ModBlocks.GOLD_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "gold_block"),
				ModBlocks.IRON_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "iron_block"),
				ModBlocks.LEAD_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "lead_block"),
				ModBlocks.MANGANESE_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "manganese_block"),
				ModBlocks.NICKEL_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "nickel_block"),
				ModBlocks.PLATINUM_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "platinum_block"),
				ModBlocks.SILVER_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "silver_block"),
				ModBlocks.STEEL_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "steel_block"),
				ModBlocks.TIN_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "tin_block"),
				ModBlocks.TITANIUM_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "titanium_block"),
				ModBlocks.TUNGSTEN_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "tungsten_block"),
				ModBlocks.ZINC_BLOCK = new Block(metalProperties).setRegistryName(MOD_ID, "zinc_block"),
				
				// Gemstone
				ModBlocks.AMETHYST_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "amethyst_block"),
				ModBlocks.BLOODSTONE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "bloodstone_block"),
				ModBlocks.BLUEGOLDSTONE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "bluegoldstone_block"),
				ModBlocks.CALCITE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "calcite_block"),
				ModBlocks.CARNELIAN_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "carnelian_block"),
				ModBlocks.CITRINE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "citrine_block"),
				ModBlocks.EMERALD_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "emerald_block"),
				ModBlocks.FLUORITE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "fluorite_block"),
				ModBlocks.GARNET_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "garnet_block"),
				ModBlocks.GOLDSTONE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "goldstone_block"),
				ModBlocks.JADE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "jade_block"),
				ModBlocks.JASPER_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "jasper_block"),
				ModBlocks.LABRADORITE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "labradorite_block"),
				ModBlocks.LAPIS_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "lapis_block"),
				ModBlocks.OBSIDIAN_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "obsidian_block"),
				ModBlocks.ONYX_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "onyx_block"),
				ModBlocks.OPAL_BLACK_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "opal_black_block"),
				ModBlocks.OPAL_BOULDER_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "opal_boulder_block"),
				ModBlocks.OPAL_DRAGONBREATH_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "opal_dragonbreath_block"),
				ModBlocks.OPAL_FIRE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "opal_fire_block"),
				ModBlocks.OPAL_LIGHTNING_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "opal_lightning_block"),
				ModBlocks.OPAL_WATER_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "opal_water_block"),
				ModBlocks.OPAL_WHITE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "opal_white_block"),
				ModBlocks.PERIDOT_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "peridot_block"),
				ModBlocks.QUARTZ_CLEAR_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "quartz_clear_block"),
				ModBlocks.QUARTZ_MILKY_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "quartz_milky_block"),
				ModBlocks.QUARTZ_ROSE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "quartz_rose_block"),
				ModBlocks.QUARTZ_SMOKY_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "quartz_smoky_block"),
				ModBlocks.RUBY_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "ruby_block"),
				ModBlocks.SAPPHIRE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "sapphire_block"),
				ModBlocks.SELENITE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "selenite_block"),
				ModBlocks.SPINEL_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "spinel_block"),
				ModBlocks.TIGERS_EYE_BLOCK = new EssentialGemstoneBlock().setRegistryName(MOD_ID, "tigers_eye_block"),
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

				// Wax Sheets
				ModBlocks.WAX_SHEET_BLACK = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_black"),
				ModBlocks.WAX_SHEET_BLUE = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_blue"),
				ModBlocks.WAX_SHEET_BROWN = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_brown"),
				ModBlocks.WAX_SHEET_CREAM = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_cream"),
				ModBlocks.WAX_SHEET_CYAN = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_cyan"),
				ModBlocks.WAX_SHEET_GRAY = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_gray"),
				ModBlocks.WAX_SHEET_GREEN = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_green"),
				ModBlocks.WAX_SHEET_LIGHT_BLUE = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_light_blue"),
				ModBlocks.WAX_SHEET_LIGHT_GRAY = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_light_gray"),
				ModBlocks.WAX_SHEET_LIME = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_lime"),
				ModBlocks.WAX_SHEET_MAGENTA = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_magenta"),
				ModBlocks.WAX_SHEET_ORANGE = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_orange"),
				ModBlocks.WAX_SHEET_PINK = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_pink"),
				ModBlocks.WAX_SHEET_PURPLE = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_purple"),
				ModBlocks.WAX_SHEET_RED = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_red"),
				ModBlocks.WAX_SHEET_WHITE = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_white"),
				ModBlocks.WAX_SHEET_YELLOW = new WaxSheet().setRegistryName(MOD_ID, "wax_sheet_yellow"),
				
				// Crystals
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
				// Banksia
				ModBlocks.BANKSIA_BUTTON = new EssentialButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "banksia_button"),
				ModBlocks.BANKSIA_DOOR = new EssentialDoor().setRegistryName(MOD_ID, "banksia_door"),
				ModBlocks.BANKSIA_FENCE = new FenceBlock((Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName(MOD_ID, "banksia_fence"),
				ModBlocks.BANKSIA_FENCE_GATE = new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "banksia_fence_gate"),
				ModBlocks.BANKSIA_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(MOD_ID, "banksia_leaves"),
				ModBlocks.BANKSIA_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(4.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "banksia_log"),
				ModBlocks.BANKSIA_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "banksia_planks"),
				ModBlocks.BANKSIA_PRESSURE_PLATE = new EssentialPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "banksia_pressure_plate"),
				ModBlocks.BANKSIA_SAPLING = new EssentialSapling(new BanksiaTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.f).sound(SoundType.PLANT)).setRegistryName(MOD_ID, "banksia_sapling"),
				//ModBlocks.BANKSIA_SIGN = new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)).setRegistryName("banksia_sign"),
				ModBlocks.BANKSIA_SLAB = new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "banksia_slab"),
				ModBlocks.BANKSIA_STAIRS = new EssentialStairs(ModBlocks.BANKSIA_PLANKS.getDefaultState(), Block.Properties.from(ModBlocks.BANKSIA_PLANKS)).setRegistryName(MOD_ID, "banksia_stairs"),
				ModBlocks.BANKSIA_TRAPDOOR = new EssentialTrapDoor().setRegistryName(MOD_ID, "banksia_trapdoor"),
				//ModBlocks.BANKSIA_WALL_SIGN,
				ModBlocks.BANKSIA_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("banksia_wood"),
				ModBlocks.STRIPPED_BANKSIA_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "stripped_banksia_log"),
				ModBlocks.STRIPPED_BANKSIA_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_banksia_wood"),
				// Cherry Blossom
				ModBlocks.CHERRY_BLOSSOM_BUTTON = new EssentialButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "cherry_blossom_button"),
				ModBlocks.CHERRY_BLOSSOM_DOOR = new EssentialDoor().setRegistryName(MOD_ID, "cherry_blossom_door"),
				ModBlocks.CHERRY_BLOSSOM_FENCE = new FenceBlock((Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName(MOD_ID, "cherry_blossom_fence"),
				ModBlocks.CHERRY_BLOSSOM_FENCE_GATE = new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "cherry_blossom_fence_gate"),
				ModBlocks.CHERRY_BLOSSOM_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(MOD_ID, "cherry_blossom_leaves"),
				ModBlocks.CHERRY_BLOSSOM_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(4.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "cherry_blossom_log"),
				ModBlocks.CHERRY_BLOSSOM_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "cherry_blossom_planks"),
				ModBlocks.CHERRY_BLOSSOM_PRESSURE_PLATE = new EssentialPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "cherry_blossom_pressure_plate"),
				ModBlocks.CHERRY_BLOSSOM_SAPLING = new EssentialSapling(new CherryBlossomTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.f).sound(SoundType.PLANT)).setRegistryName(MOD_ID, "cherry_blossom_sapling"),
				//ModBlocks.CHERRY_BLOSSOM_SIGN = new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)).setRegistryName("cherry_blossom_sign"),
				ModBlocks.CHERRY_BLOSSOM_SLAB = new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "cherry_blossom_slab"),
				ModBlocks.CHERRY_BLOSSOM_STAIRS = new EssentialStairs(ModBlocks.CHERRY_BLOSSOM_PLANKS.getDefaultState(), Block.Properties.from(ModBlocks.CHERRY_BLOSSOM_PLANKS)).setRegistryName(MOD_ID, "cherry_blossom_stairs"),
				ModBlocks.CHERRY_BLOSSOM_TRAPDOOR = new EssentialTrapDoor().setRegistryName(MOD_ID, "cherry_blossom_trapdoor"),
				ModBlocks.CHERRY_BLOSSOM_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("cherry_blossom_wood"),
				ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "stripped_cherry_blossom_log"),
				ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_cherry_blossom_wood"),
				// Eucalyptus
				ModBlocks.EUCALYPTUS_BUTTON = new EssentialButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "eucalyptus_button"),
				ModBlocks.EUCALYPTUS_DOOR = new EssentialDoor().setRegistryName(MOD_ID, "eucalyptus_door"),
				ModBlocks.EUCALYPTUS_FENCE = new FenceBlock((Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName(MOD_ID, "eucalyptus_fence"),
				ModBlocks.EUCALYPTUS_FENCE_GATE = new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "eucalyptus_fence_gate"),
				ModBlocks.EUCALYPTUS_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(MOD_ID, "eucalyptus_leaves"),
				ModBlocks.EUCALYPTUS_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(4.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "eucalyptus_log"),			
				ModBlocks.EUCALYPTUS_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "eucalyptus_planks"),
				ModBlocks.EUCALYPTUS_PRESSURE_PLATE = new EssentialPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "eucalyptus_pressure_plate"),
				ModBlocks.EUCALYPTUS_SAPLING = new EssentialSapling(new EucalyptusTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.f).sound(SoundType.PLANT)).setRegistryName(MOD_ID, "eucalyptus_sapling"),
				//ModBlocks.EUCALYPTUS_SIGN = new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)).setRegistryName("eucalyptus_sign"),
				ModBlocks.EUCALYPTUS_SLAB = new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "eucalyptus_slab"),
				ModBlocks.EUCALYPTUS_STAIRS = new EssentialStairs(ModBlocks.EUCALYPTUS_PLANKS.getDefaultState(), Block.Properties.from(ModBlocks.EUCALYPTUS_PLANKS)).setRegistryName(MOD_ID, "eucalyptus_stairs"),
				ModBlocks.EUCALYPTUS_TRAPDOOR = new EssentialTrapDoor().setRegistryName(MOD_ID, "eucalyptus_trapdoor"),
				ModBlocks.EUCALYPTUS_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("eucalyptus_wood"),
				ModBlocks.STRIPPED_EUCALYPTUS_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "stripped_eucalyptus_log"),
				ModBlocks.STRIPPED_EUCALYPTUS_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_eucalyptus_wood"),
				// Gum
				ModBlocks.GUM_BUTTON = new EssentialButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "gum_button"),
				ModBlocks.GUM_DOOR = new EssentialDoor().setRegistryName(MOD_ID, "gum_door"),
				ModBlocks.GUM_FENCE = new FenceBlock((Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName(MOD_ID, "gum_fence"),
				ModBlocks.GUM_FENCE_GATE = new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "gum_fence_gate"),
				ModBlocks.GUM_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(MOD_ID, "gum_leaves"),
				ModBlocks.GUM_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(4.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "gum_log"),			
				ModBlocks.GUM_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "gum_planks"),
				ModBlocks.GUM_PRESSURE_PLATE = new EssentialPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "gum_pressure_plate"),
				ModBlocks.GUM_SAPLING = new EssentialSapling(new GumTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.f).sound(SoundType.PLANT)).setRegistryName(MOD_ID, "gum_sapling"),
				//ModBlocks.GUM_SIGN = new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)).setRegistryName("gum_sign"),
				ModBlocks.GUM_SLAB = new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "gum_slab"),
				ModBlocks.GUM_STAIRS = new EssentialStairs(ModBlocks.GUM_PLANKS.getDefaultState(), Block.Properties.from(ModBlocks.GUM_PLANKS)).setRegistryName(MOD_ID, "gum_stairs"),
				ModBlocks.GUM_TRAPDOOR = new EssentialTrapDoor().setRegistryName(MOD_ID, "gum_trapdoor"),
				ModBlocks.GUM_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("gum_wood"),
				ModBlocks.STRIPPED_GUM_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "stripped_gum_log"),
				ModBlocks.STRIPPED_GUM_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_gum_wood"),
				// Holly
				ModBlocks.HOLLY_BUTTON = new EssentialButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "holly_button"),
				ModBlocks.HOLLY_DOOR = new EssentialDoor().setRegistryName(MOD_ID, "holly_door"),
				ModBlocks.HOLLY_FENCE = new FenceBlock((Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName(MOD_ID, "holly_fence"),
				ModBlocks.HOLLY_FENCE_GATE = new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "holly_fence_gate"),	
				ModBlocks.HOLLY_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(MOD_ID, "holly_leaves"),
				ModBlocks.HOLLY_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(4.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "holly_log"),
				ModBlocks.HOLLY_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "holly_planks"),
				ModBlocks.HOLLY_PRESSURE_PLATE = new EssentialPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "holly_pressure_plate"),
				ModBlocks.HOLLY_SAPLING = new EssentialSapling(new HollyTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.f).sound(SoundType.PLANT)).setRegistryName(MOD_ID, "holly_sapling"),
				//ModBlocks.HOLLY_SIGN = new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)).setRegistryName("holly_sign"),
				ModBlocks.HOLLY_SLAB = new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "holly_slab"),
				ModBlocks.HOLLY_STAIRS = new EssentialStairs(ModBlocks.HOLLY_PLANKS.getDefaultState(), Block.Properties.from(ModBlocks.HOLLY_PLANKS)).setRegistryName(MOD_ID, "holly_stairs"),
				ModBlocks.HOLLY_TRAPDOOR = new EssentialTrapDoor().setRegistryName(MOD_ID, "holly_trapdoor"),
				ModBlocks.HOLLY_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("holly_wood"),
				ModBlocks.STRIPPED_HOLLY_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "stripped_holly_log"),
				ModBlocks.STRIPPED_HOLLY_WOOD = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "stripped_holly_wood"),
				// Wattle
				ModBlocks.WATTLE_BUTTON = new EssentialButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "wattle_button"),
				ModBlocks.WATTLE_DOOR = new EssentialDoor().setRegistryName(MOD_ID, "wattle_door"),
				ModBlocks.WATTLE_FENCE = new FenceBlock((Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName(MOD_ID, "wattle_fence"),
				ModBlocks.WATTLE_FENCE_GATE = new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "wattle_fence_gate"),
				ModBlocks.WATTLE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(MOD_ID, "wattle_leaves"),
				ModBlocks.WATTLE_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(4.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "wattle_log"),
				ModBlocks.WATTLE_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "wattle_planks"),
				ModBlocks.WATTLE_PRESSURE_PLATE = new EssentialPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "wattle_pressure_plate"),
				ModBlocks.WATTLE_SAPLING = new EssentialSapling(new WattleTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.f).sound(SoundType.PLANT)).setRegistryName(MOD_ID, "wattle_sapling"),
				//ModBlocks.WATTLE_SIGN = new StandingSignBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)).setRegistryName("wattle_sign"),
				ModBlocks.WATTLE_SLAB = new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "wattle_slab"),
				ModBlocks.WATTLE_STAIRS = new EssentialStairs(ModBlocks.WATTLE_PLANKS.getDefaultState(), Block.Properties.from(ModBlocks.WATTLE_PLANKS)).setRegistryName(MOD_ID, "wattle_stairs"),
				ModBlocks.WATTLE_TRAPDOOR = new EssentialTrapDoor().setRegistryName(MOD_ID, "wattle_trapdoor"),
				ModBlocks.WATTLE_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("wattle_wood"),
				ModBlocks.STRIPPED_WATTLE_LOG = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "stripped_wattle_log"),
				ModBlocks.STRIPPED_WATTLE_WOOD = new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(MOD_ID, "stripped_wattle_wood")
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
				new BlockItem(ModBlocks.GYPSUM, properties).setRegistryName("gypsum"),
				new BlockItem(ModBlocks.LIMESTONE, properties).setRegistryName("limestone"),
				new BlockItem(ModBlocks.MARBLE, properties).setRegistryName("marble"),
				new BlockItem(ModBlocks.PUMICE, properties).setRegistryName("pumice"),
				new BlockItem(ModBlocks.QUARTZITE, properties).setRegistryName("quartzite"),
				new BlockItem(ModBlocks.RHYOLITE, properties).setRegistryName("rhyolite"),
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
				
				// Metal Blocks
				new BlockItem(ModBlocks.ALUMINIUM_BLOCK, properties).setRegistryName("aluminium_block"),
				new BlockItem(ModBlocks.BRASS_BLOCK, properties).setRegistryName("brass_block"),
				new BlockItem(ModBlocks.BRONZE_BLOCK, properties).setRegistryName("bronze_block"),
				new BlockItem(ModBlocks.COPPER_BLOCK, properties).setRegistryName("copper_block"),
				new BlockItem(ModBlocks.LEAD_BLOCK, properties).setRegistryName("lead_block"),
				new BlockItem(ModBlocks.MANGANESE_BLOCK, properties).setRegistryName("manganese_block"),
				new BlockItem(ModBlocks.NICKEL_BLOCK, properties).setRegistryName("nickel_block"),
				new BlockItem(ModBlocks.PLATINUM_BLOCK, properties).setRegistryName("platinum_block"),
				new BlockItem(ModBlocks.SILVER_BLOCK, properties).setRegistryName("silver_block"),
				new BlockItem(ModBlocks.STEEL_BLOCK, properties).setRegistryName("steel_block"),
				new BlockItem(ModBlocks.TIN_BLOCK, properties).setRegistryName("tin_block"),
				new BlockItem(ModBlocks.TITANIUM_BLOCK, properties).setRegistryName("titanium_block"),
				new BlockItem(ModBlocks.TUNGSTEN_BLOCK, properties).setRegistryName("tungsten_block"),
				new BlockItem(ModBlocks.ZINC_BLOCK, properties).setRegistryName("zinc_block"),
				
				// Gemstones
				ModItems.AMETHYST = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("amethyst"),
				ModItems.BLOODSTONE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("bloodstone"),
				ModItems.BLUEGOLDSTONE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("bluegoldstone"),
				ModItems.CALCITE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("calcite"),
				ModItems.CARNELIAN = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("carnelian"),
				ModItems.CITRINE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("citrine"),
				ModItems.EMERALD = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("emerald"),
				ModItems.FLUORITE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("fluorite"),
				ModItems.GARNET = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("garnet"),
				ModItems.GOLDSTONE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("goldstone"),
				ModItems.JADE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("jade"),
				ModItems.JASPER = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("jasper"),
				ModItems.LABRADORITE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("labradorite"),
				ModItems.LAPIS = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("lapis"),
				ModItems.OBSIDIAN = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("obsidian"),
				ModItems.ONYX = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("onyx"),
				ModItems.OPAL_BLACK = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("opal_black"),
				ModItems.OPAL_BOULDER = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("opal_boulder"),
				ModItems.OPAL_DRAGONBREATH = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("opal_dragonbreath"),
				ModItems.OPAL_FIRE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("opal_fire"),
				ModItems.OPAL_LIGHTNING = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("opal_lightning"),
				ModItems.OPAL_WATER = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("opal_water"),
				ModItems.OPAL_WHITE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("opal_white"),
				ModItems.PERIDOT = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("peridot"),
				ModItems.QUARTZ_CLEAR = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("quartz_clear"),
				ModItems.QUARTZ_MILKY = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("quartz_milky"),
				ModItems.QUARTZ_ROSE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("quartz_rose"),
				ModItems.QUARTZ_SMOKY = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("quartz_smoky"),
				ModItems.RUBY = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("ruby"),
				ModItems.SAPPHIRE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("sapphire"),
				ModItems.SELENITE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("selenite"),
				ModItems.SPINEL = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("spinel"),
				ModItems.TIGERS_EYE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("tigers_eye"),
				ModItems.TURQUOISE = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("turquoise"),
				
				// Gemstone BlockItems
				new BlockItem(ModBlocks.AMETHYST_BLOCK, properties).setRegistryName("amethyst_block"),
				new BlockItem(ModBlocks.BLOODSTONE_BLOCK, properties).setRegistryName("bloodstone_block"),
				new BlockItem(ModBlocks.BLUEGOLDSTONE_BLOCK, properties).setRegistryName("bluegoldstone_block"),
				new BlockItem(ModBlocks.CALCITE_BLOCK, properties).setRegistryName("calcite_block"),
				new BlockItem(ModBlocks.CARNELIAN_BLOCK, properties).setRegistryName("carnelian_block"),
				new BlockItem(ModBlocks.CITRINE_BLOCK, properties).setRegistryName("citrine_block"),
				new BlockItem(ModBlocks.EMERALD_BLOCK, properties).setRegistryName("emerald_block"),
				new BlockItem(ModBlocks.FLUORITE_BLOCK, properties).setRegistryName("fluorite_block"),
				new BlockItem(ModBlocks.GARNET_BLOCK, properties).setRegistryName("garnet_block"),
				new BlockItem(ModBlocks.GOLDSTONE_BLOCK, properties).setRegistryName("goldstone_block"),
				new BlockItem(ModBlocks.JADE_BLOCK, properties).setRegistryName("jade_block"),
				new BlockItem(ModBlocks.JASPER_BLOCK, properties).setRegistryName("jasper_block"),
				new BlockItem(ModBlocks.LABRADORITE_BLOCK, properties).setRegistryName("labradorite_block"),
				new BlockItem(ModBlocks.LAPIS_BLOCK, properties).setRegistryName("lapis_block"),
				new BlockItem(ModBlocks.OBSIDIAN_BLOCK, properties).setRegistryName("obsidian_block"),
				new BlockItem(ModBlocks.ONYX_BLOCK, properties).setRegistryName("onyx_block"),
				new BlockItem(ModBlocks.OPAL_BLACK_BLOCK, properties).setRegistryName("opal_black_block"),
				new BlockItem(ModBlocks.OPAL_BOULDER_BLOCK, properties).setRegistryName("opal_boulder_block"),
				new BlockItem(ModBlocks.OPAL_DRAGONBREATH_BLOCK, properties).setRegistryName("opal_dragonbreath_block"),
				new BlockItem(ModBlocks.OPAL_FIRE_BLOCK, properties).setRegistryName("opal_fire_block"),
				new BlockItem(ModBlocks.OPAL_LIGHTNING_BLOCK, properties).setRegistryName("opal_lightning_block"),
				new BlockItem(ModBlocks.OPAL_WATER_BLOCK, properties).setRegistryName("opal_water_block"),
				new BlockItem(ModBlocks.OPAL_WHITE_BLOCK, properties).setRegistryName("opal_white_block"),
				new BlockItem(ModBlocks.PERIDOT_BLOCK, properties).setRegistryName("peridot_block"),
				new BlockItem(ModBlocks.QUARTZ_CLEAR_BLOCK, properties).setRegistryName("quartz_clear_block"),
				new BlockItem(ModBlocks.QUARTZ_MILKY_BLOCK, properties).setRegistryName("quartz_milky_block"),
				new BlockItem(ModBlocks.QUARTZ_ROSE_BLOCK, properties).setRegistryName("quartz_rose_block"),
				new BlockItem(ModBlocks.QUARTZ_SMOKY_BLOCK, properties).setRegistryName("quartz_smoky_block"),
				new BlockItem(ModBlocks.RUBY_BLOCK, properties).setRegistryName("ruby_block"),
				new BlockItem(ModBlocks.SAPPHIRE_BLOCK, properties).setRegistryName("sapphire_block"),
				new BlockItem(ModBlocks.SELENITE_BLOCK, properties).setRegistryName("selenite_block"),
				new BlockItem(ModBlocks.SPINEL_BLOCK, properties).setRegistryName("spinel_block"),
				new BlockItem(ModBlocks.TIGERS_EYE_BLOCK, properties).setRegistryName("tigers_eye_block"),
				new BlockItem(ModBlocks.TURQUOISE_BLOCK, properties).setRegistryName("turquoise_block"),
				
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

				// Wax Sheets
				new BlockItem(ModBlocks.WAX_SHEET_BLACK, properties).setRegistryName("wax_sheet_black"),
				new BlockItem(ModBlocks.WAX_SHEET_BLUE, properties).setRegistryName("wax_sheet_blue"),
				new BlockItem(ModBlocks.WAX_SHEET_BROWN, properties).setRegistryName("wax_sheet_brown"),
				new BlockItem(ModBlocks.WAX_SHEET_CREAM, properties).setRegistryName("wax_sheet_cream"),
				new BlockItem(ModBlocks.WAX_SHEET_CYAN, properties).setRegistryName("wax_sheet_cyan"),
				new BlockItem(ModBlocks.WAX_SHEET_GRAY, properties).setRegistryName("wax_sheet_gray"),
				new BlockItem(ModBlocks.WAX_SHEET_GREEN, properties).setRegistryName("wax_sheet_green"),
				new BlockItem(ModBlocks.WAX_SHEET_LIGHT_BLUE, properties).setRegistryName("wax_sheet_light_blue"),
				new BlockItem(ModBlocks.WAX_SHEET_LIGHT_GRAY, properties).setRegistryName("wax_sheet_light_gray"),
				new BlockItem(ModBlocks.WAX_SHEET_LIME, properties).setRegistryName("wax_sheet_lime"),
				new BlockItem(ModBlocks.WAX_SHEET_MAGENTA, properties).setRegistryName("wax_sheet_magenta"),
				new BlockItem(ModBlocks.WAX_SHEET_ORANGE, properties).setRegistryName("wax_sheet_orange"),
				new BlockItem(ModBlocks.WAX_SHEET_PINK, properties).setRegistryName("wax_sheet_pink"),
				new BlockItem(ModBlocks.WAX_SHEET_PURPLE, properties).setRegistryName("wax_sheet_purple"),
				new BlockItem(ModBlocks.WAX_SHEET_RED, properties).setRegistryName("wax_sheet_red"),
				new BlockItem(ModBlocks.WAX_SHEET_WHITE, properties).setRegistryName("wax_sheet_white"),
				new BlockItem(ModBlocks.WAX_SHEET_YELLOW, properties).setRegistryName("wax_sheet_yellow"),

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
				// Banksia
				new BlockItem(ModBlocks.BANKSIA_BUTTON, properties).setRegistryName("banksia_button"),
				new EssentialDoorItem(ModBlocks.BANKSIA_DOOR, properties).setRegistryName("banksia_door"),
				new BlockItem(ModBlocks.BANKSIA_FENCE, properties).setRegistryName("banksia_fence"),
				new BlockItem(ModBlocks.BANKSIA_FENCE_GATE, properties).setRegistryName("banksia_fence_gate"),
				new BlockItem(ModBlocks.BANKSIA_LEAVES, properties).setRegistryName("banksia_leaves"),
				new BlockItem(ModBlocks.BANKSIA_LOG, properties).setRegistryName("banksia_log"),
				new BlockItem(ModBlocks.BANKSIA_PLANKS, properties).setRegistryName("banksia_planks"),
				new BlockItem(ModBlocks.BANKSIA_PRESSURE_PLATE, properties).setRegistryName("banksia_pressure_plate"),
				new BlockItem(ModBlocks.BANKSIA_SAPLING, properties).setRegistryName("banksia_sapling"),
				//new SignItem((new Item.Properties()).maxStackSize(16).group(setup.bareEssentialsItemGroup), ModBlocks.BANKSIA_SIGN, Blocks.ACACIA_WALL_SIGN).setRegistryName("banksia_sign"),
				new BlockItem(ModBlocks.BANKSIA_SLAB, properties).setRegistryName("banksia_slab"),
				new BlockItem(ModBlocks.BANKSIA_STAIRS, properties).setRegistryName("banksia_stairs"),
				new BlockItem(ModBlocks.BANKSIA_TRAPDOOR, properties).setRegistryName("banksia_trapdoor"),
				new BlockItem(ModBlocks.BANKSIA_WOOD, properties).setRegistryName("banksia_wood"),
				new BlockItem(ModBlocks.STRIPPED_BANKSIA_LOG, properties).setRegistryName("stripped_banksia_log"),
				new BlockItem(ModBlocks.STRIPPED_BANKSIA_WOOD, properties).setRegistryName("stripped_banksia_wood"),
				// Cherry Blossom
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_BUTTON, properties).setRegistryName("cherry_blossom_button"),
				new EssentialDoorItem(ModBlocks.CHERRY_BLOSSOM_DOOR, properties).setRegistryName("cherry_blossom_door"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_FENCE, properties).setRegistryName("cherry_blossom_fence"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_FENCE_GATE, properties).setRegistryName("cherry_blossom_fence_gate"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_LEAVES, properties).setRegistryName("cherry_blossom_leaves"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_LOG, properties).setRegistryName("cherry_blossom_log"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_PLANKS, properties).setRegistryName("cherry_blossom_planks"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_PRESSURE_PLATE, properties).setRegistryName("cherry_blossom_pressure_plate"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_SAPLING, properties).setRegistryName("cherry_blossom_sapling"),
				//new BlockItem(ModBlocks.CHERRY_BLOSSOM_SIGN, properties).setRegistryName("cherry_blossom_sign"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_SLAB, properties).setRegistryName("cherry_blossom_slab"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_STAIRS, properties).setRegistryName("cherry_blossom_stairs"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_TRAPDOOR, properties).setRegistryName("cherry_blossom_trapdoor"),
				new BlockItem(ModBlocks.CHERRY_BLOSSOM_WOOD, properties).setRegistryName("cherry_blossom_wood"),
				new BlockItem(ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG, properties).setRegistryName("stripped_cherry_blossom_log"),
				new BlockItem(ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD, properties).setRegistryName("stripped_cherry_blossom_wood"),
				// Eucalyptus
				new BlockItem(ModBlocks.EUCALYPTUS_BUTTON, properties).setRegistryName("eucalyptus_button"),
				new EssentialDoorItem(ModBlocks.EUCALYPTUS_DOOR, properties).setRegistryName("eucalyptus_door"),
				new BlockItem(ModBlocks.EUCALYPTUS_FENCE, properties).setRegistryName("eucalyptus_fence"),
				new BlockItem(ModBlocks.EUCALYPTUS_FENCE_GATE, properties).setRegistryName("eucalyptus_fence_gate"),
				new BlockItem(ModBlocks.EUCALYPTUS_LEAVES, properties).setRegistryName("eucalyptus_leaves"),
				new BlockItem(ModBlocks.EUCALYPTUS_LOG, properties).setRegistryName("eucalyptus_log"),
				new BlockItem(ModBlocks.EUCALYPTUS_PLANKS, properties).setRegistryName("eucalyptus_planks"),
				new BlockItem(ModBlocks.EUCALYPTUS_PRESSURE_PLATE, properties).setRegistryName("eucalyptus_pressure_plate"),
				new BlockItem(ModBlocks.EUCALYPTUS_SAPLING, properties).setRegistryName("eucalyptus_sapling"),
				//new BlockItem(ModBlocks.EUCALYPTUS_SIGN, properties).setRegistryName("eucalyptus_sign"),
				new BlockItem(ModBlocks.EUCALYPTUS_SLAB, properties).setRegistryName("eucalyptus_slab"),
				new BlockItem(ModBlocks.EUCALYPTUS_STAIRS, properties).setRegistryName("eucalyptus_stairs"),
				new BlockItem(ModBlocks.EUCALYPTUS_TRAPDOOR, properties).setRegistryName("eucalyptus_trapdoor"),
				new BlockItem(ModBlocks.EUCALYPTUS_WOOD, properties).setRegistryName("eucalyptus_wood"),
				new BlockItem(ModBlocks.STRIPPED_EUCALYPTUS_LOG, properties).setRegistryName("stripped_eucalyptus_log"),
				new BlockItem(ModBlocks.STRIPPED_EUCALYPTUS_WOOD, properties).setRegistryName("stripped_eucalyptus_wood"),
				// Gum
				new BlockItem(ModBlocks.GUM_BUTTON, properties).setRegistryName("gum_button"),
				new EssentialDoorItem(ModBlocks.GUM_DOOR, properties).setRegistryName("gum_door"),
				new BlockItem(ModBlocks.GUM_FENCE, properties).setRegistryName("gum_fence"),
				new BlockItem(ModBlocks.GUM_FENCE_GATE, properties).setRegistryName("gum_fence_gate"),
				new BlockItem(ModBlocks.GUM_LEAVES, properties).setRegistryName("gum_leaves"),
				new BlockItem(ModBlocks.GUM_LOG, properties).setRegistryName("gum_log"),
				new BlockItem(ModBlocks.GUM_PLANKS, properties).setRegistryName("gum_planks"),
				new BlockItem(ModBlocks.GUM_PRESSURE_PLATE, properties).setRegistryName("gum_pressure_plate"),
				new BlockItem(ModBlocks.GUM_SAPLING, properties).setRegistryName("gum_sapling"),
				//new BlockItem(ModBlocks.GUM_SIGN, properties).setRegistryName("gum_sign"),
				new BlockItem(ModBlocks.GUM_SLAB, properties).setRegistryName("gum_slab"),
				new BlockItem(ModBlocks.GUM_STAIRS, properties).setRegistryName("gum_stairs"),
				new BlockItem(ModBlocks.GUM_TRAPDOOR, properties).setRegistryName("gum_trapdoor"),
				new BlockItem(ModBlocks.GUM_WOOD, properties).setRegistryName("gum_wood"),
				new BlockItem(ModBlocks.STRIPPED_GUM_LOG, properties).setRegistryName("stripped_gum_log"),
				new BlockItem(ModBlocks.STRIPPED_GUM_WOOD, properties).setRegistryName("stripped_gum_wood"),
				// Holly
				new BlockItem(ModBlocks.HOLLY_BUTTON, properties).setRegistryName("holly_button"),
				new EssentialDoorItem(ModBlocks.HOLLY_DOOR, properties).setRegistryName("holly_door"),
				new BlockItem(ModBlocks.HOLLY_FENCE, properties).setRegistryName("holly_fence"),
				new BlockItem(ModBlocks.HOLLY_FENCE_GATE, properties).setRegistryName("holly_fence_gate"),
				new BlockItem(ModBlocks.HOLLY_LEAVES, properties).setRegistryName("holly_leaves"),
				new BlockItem(ModBlocks.HOLLY_LOG, properties).setRegistryName("holly_log"),
				new BlockItem(ModBlocks.HOLLY_PLANKS, properties).setRegistryName("holly_planks"),
				new BlockItem(ModBlocks.HOLLY_PRESSURE_PLATE, properties).setRegistryName("holly_pressure_plate"),
				new BlockItem(ModBlocks.HOLLY_SAPLING, properties).setRegistryName("holly_sapling"),
				//new BlockItem(ModBlocks.HOLLY_SIGN, properties).setRegistryName("holly_sign"),
				new BlockItem(ModBlocks.HOLLY_SLAB, properties).setRegistryName("holly_slab"),
				new BlockItem(ModBlocks.HOLLY_STAIRS, properties).setRegistryName("holly_stairs"),
				new BlockItem(ModBlocks.HOLLY_TRAPDOOR, properties).setRegistryName("holly_trapdoor"),
				new BlockItem(ModBlocks.HOLLY_WOOD, properties).setRegistryName("holly_wood"),
				new BlockItem(ModBlocks.STRIPPED_HOLLY_LOG, properties).setRegistryName("stripped_holly_log"),
				new BlockItem(ModBlocks.STRIPPED_HOLLY_WOOD, properties).setRegistryName("stripped_holly_wood"),
				// Wattle
				new BlockItem(ModBlocks.WATTLE_BUTTON, properties).setRegistryName("wattle_button"),
				new EssentialDoorItem(ModBlocks.WATTLE_DOOR, properties).setRegistryName("wattle_door"),
				new BlockItem(ModBlocks.WATTLE_FENCE, properties).setRegistryName("wattle_fence"),
				new BlockItem(ModBlocks.WATTLE_FENCE_GATE, properties).setRegistryName("wattle_fence_gate"),
				new BlockItem(ModBlocks.WATTLE_LEAVES, properties).setRegistryName("wattle_leaves"),
				new BlockItem(ModBlocks.WATTLE_LOG, properties).setRegistryName("wattle_log"),
				new BlockItem(ModBlocks.WATTLE_PLANKS, properties).setRegistryName("wattle_planks"),
				new BlockItem(ModBlocks.WATTLE_PRESSURE_PLATE, properties).setRegistryName("wattle_pressure_plate"),
				new BlockItem(ModBlocks.WATTLE_SAPLING, properties).setRegistryName("wattle_sapling"),
				//new BlockItem(ModBlocks.WATTLE_SIGN, properties).setRegistryName("wattle_sign"),
				new BlockItem(ModBlocks.WATTLE_SLAB, properties).setRegistryName("wattle_slab"),
				new BlockItem(ModBlocks.WATTLE_STAIRS, properties).setRegistryName("wattle_stairs"),
				new BlockItem(ModBlocks.WATTLE_TRAPDOOR, properties).setRegistryName("wattle_trapdoor"),
				new BlockItem(ModBlocks.WATTLE_WOOD, properties).setRegistryName("wattle_wood"),
				new BlockItem(ModBlocks.STRIPPED_WATTLE_LOG, properties).setRegistryName("stripped_wattle_log"),
				new BlockItem(ModBlocks.STRIPPED_WATTLE_WOOD, properties).setRegistryName("stripped_wattle_wood"),
				
				// Knives
				ModItems.STONE_KNIFE =  (EssentialKnife) new EssentialKnife(ItemTier.STONE, 1, 10.f, properties).setRegistryName("stone_knife"),
				
				// Tools
				//Items.DIAMOND_PICKAXE
				ModItems.TITANIUM_PICKAXE = (PickaxeItem) new PickaxeItem(Essential_ItemTiers.TITANIUM, 0, 0.f, properties).setRegistryName("titanium_pickaxe"),
				
				// Pebbles
				ModItems.ANDESITE_PEBBLE = new EssentialGemstone(properties).setRegistryName("andesite_pebble"),
				ModItems.BASALT_PEBBLE = new EssentialGemstone(properties).setRegistryName("basalt_pebble"),
				ModItems.DIORITE_PEBBLE = new EssentialGemstone(properties).setRegistryName("diorite_pebble"),
				ModItems.GABBRO_PEBBLE = new EssentialGemstone(properties).setRegistryName("gabbro_pebble"),
				ModItems.GRANITE_PEBBLE = new EssentialGemstone(properties).setRegistryName("granite_pebble"),
				ModItems.GYPSUM_PEBBLE = new EssentialGemstone(properties).setRegistryName("gypsum_pebble"),
				ModItems.LIMESTONE_PEBBLE = new EssentialGemstone(properties).setRegistryName("limestone_pebble"),
				ModItems.MARBLE_PEBBLE = new EssentialGemstone(properties).setRegistryName("marble_pebble"),
				ModItems.PUMICE_PEBBLE = new EssentialGemstone(properties).setRegistryName("pumice_pebble"),
				ModItems.QUARTZITE_PEBBLE = new EssentialGemstone(properties).setRegistryName("quartzite_pebble"),
				ModItems.RHYOLITE_PEBBLE = new EssentialGemstone(properties).setRegistryName("rhyolite_pebble"),
				ModItems.SANDSTONE_PEBBLE = new EssentialGemstone(properties).setRegistryName("sandstone_pebble"),
				ModItems.SANDSTONE_RED_PEBBLE = new EssentialGemstone(properties).setRegistryName("sandstone_red_pebble"),
				ModItems.SCHIST_PEBBLE = new EssentialGemstone(properties).setRegistryName("schist_pebble"),
				ModItems.SHALE_PEBBLE = new EssentialGemstone(properties).setRegistryName("shale_pebble"),
				ModItems.SLATE_PEBBLE = new EssentialGemstone(properties).setRegistryName("slate_pebble"),
				ModItems.FOSSIL = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("fossil"),
				ModItems.ROCK = (EssentialGemstone) new EssentialGemstone(properties).setRegistryName("rock")
				
			);
		}
		
		@SubscribeEvent
		public static void registerTilEntities(final RegistryEvent.Register<TileEntityType<?>> event)
		{

		}
		 
		@SubscribeEvent
		public static void registerBiomes(final RegistryEvent.Register<Biome> event)
		{
			event.getRegistry().registerAll
			(
				EssentialBiomes.OutbackTestBiome = new OutbackTest().setRegistryName("outback_test")
			);
		}

		
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