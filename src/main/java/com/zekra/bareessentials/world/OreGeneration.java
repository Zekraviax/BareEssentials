package com.zekra.bareessentials.world;

import com.zekra.bareessentials.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	
	// Parameters: Ore Veins Per Chunk, Minimum Height, Maximum Height Base, Maximum Height
	//CountRangeConfig test_ore_placement = new CountRangeConfig(64, 1, 1, 64);
	// Remember to account for the 8 block offset
	
	// Snowy Biomes (length = 7)
	static Block[] SnowyBiomeOres = new Block[] {Blocks.LAVA, ModBlocks.GNEISS, ModBlocks.SLATE, ModBlocks.SHALE, ModBlocks.BASALT, ModBlocks.GABBRO, Blocks.ANDESITE};
	// Cold Biomes (length = 8)
	static Block[] ColdBiomeOres = new Block[] {Blocks.LAVA, ModBlocks.GNEISS, ModBlocks.SLATE, ModBlocks.SHALE, Blocks.ANDESITE, Blocks.DIORITE, ModBlocks.BASALT, ModBlocks.GABBRO};
	// Dry Biomes (length = 8)
	static Block[] DryBiomeOres = new Block[] {Blocks.LAVA, ModBlocks.SLATE, ModBlocks.BASALT, Blocks.DIORITE, ModBlocks.MARBLE, ModBlocks.LIMESTONE, ModBlocks.QUARTZITE, Blocks.SANDSTONE};
	// Temperate Biomes (length = 7)
	static Block[] TemperateBiomeOres = new Block[] {Blocks.LAVA, ModBlocks.GNEISS, ModBlocks.SCHIST, ModBlocks.BASALT, ModBlocks.PUMICE, ModBlocks.LIMESTONE, ModBlocks.CONGLOMERATE};
	// Aquatic Biomes (length = 6)
	static Block[] AquaticBiomeOres = new Block[] {ModBlocks.GNEISS, ModBlocks.SLATE, ModBlocks.SHALE, ModBlocks.BRECCIA, ModBlocks.BASALT, ModBlocks.QUARTZITE};
	
	
	public static void SetupOreGeneration() {
	    //BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).forEach((BiomeManager.BiomeEntry biomeEntry) -> 
		
//		for(int i = 0; i < BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).size(); i++)
//		{
//			Biome biome = BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).get(i).biome;
//			Bare_Essentials.LOGGER.info("Logger: Warm biome!");
//
//			if (i == TemperateBiomeOres.length - 1 || i == TemperateBiomeOres.length - 2) {
//            biome.addFeature(
//            		Decoration.UNDERGROUND_ORES,
//            		Biome.createDecoratedFeature(
//            				Feature.ORE, 
//            				new OreFeatureConfig(
//            						FillerBlockType.NATURAL_STONE, 
//            						TemperateBiomeOres[i].getDefaultState(),
//            						(TemperateBiomeOres.length * 32)), 
//            				Placement.COUNT_RANGE, 
//            				new CountRangeConfig(64, (i * TemperateBiomeOres.length), (i * TemperateBiomeOres.length), 256)));
//            Bare_Essentials.LOGGER.info("Logger: Add feature to warm biome: " + TemperateBiomeOres[i].toString());
//			}
//			else {
//            biome.addFeature(
//            		Decoration.UNDERGROUND_ORES,
//            		Biome.createDecoratedFeature(
//            				Feature.ORE, 
//            				new OreFeatureConfig(
//            						FillerBlockType.NATURAL_STONE, 
//            						TemperateBiomeOres[i].getDefaultState(),
//            						(TemperateBiomeOres.length * 32)), 
//            				Placement.COUNT_RANGE, 
//            				new CountRangeConfig(64, (i * TemperateBiomeOres.length), 0, ((i + 1) * TemperateBiomeOres.length))));
//            Bare_Essentials.LOGGER.info("Logger: Add feature to warm biome: " + TemperateBiomeOres[i].toString());
//			}
//		};
//		
//		for(int j = 0; j < BiomeManager.getBiomes(BiomeManager.BiomeType.COOL).size(); j++)
//		{
//			Biome biome = BiomeManager.getBiomes(BiomeManager.BiomeType.COOL).get(j).biome;
//			Bare_Essentials.LOGGER.info("Logger: Cool biome!");
//
//			if (j == ColdBiomeOres.length - 1 || j == ColdBiomeOres.length - 2)
//            biome.addFeature(
//            		Decoration.UNDERGROUND_ORES,
//            		Biome.createDecoratedFeature(
//            				Feature.ORE, 
//            				new OreFeatureConfig(
//            						FillerBlockType.NATURAL_STONE, 
//            						ColdBiomeOres[j].getDefaultState(),
//            						(ColdBiomeOres.length * 16)), 
//            				Placement.COUNT_RANGE, 
//            				new CountRangeConfig(64, (j * ColdBiomeOres.length), (j * ColdBiomeOres.length), 256)));
//		else
//            biome.addFeature(
//            		Decoration.UNDERGROUND_ORES,
//            		Biome.createDecoratedFeature(
//            				Feature.ORE, 
//            				new OreFeatureConfig(
//            						FillerBlockType.NATURAL_STONE, 
//            						ColdBiomeOres[j].getDefaultState(),
//            						(ColdBiomeOres.length * 16)), 
//            				Placement.COUNT_RANGE, 
//            				new CountRangeConfig(64, (j * ColdBiomeOres.length), 0, ((j + 1) * ColdBiomeOres.length))));
//		};
//		
//		for(int k = 0; k < BiomeManager.getBiomes(BiomeManager.BiomeType.DESERT).size(); k++)
//		{
//			Biome biome = BiomeManager.getBiomes(BiomeManager.BiomeType.DESERT).get(k).biome;
//			Bare_Essentials.LOGGER.info("Logger: Desert biome!");
//
//			if (k == DryBiomeOres.length - 1 || k == DryBiomeOres.length - 2)
//            biome.addFeature(
//            		Decoration.UNDERGROUND_ORES,
//            		Biome.createDecoratedFeature(
//            				Feature.ORE, 
//            				new OreFeatureConfig(
//            						FillerBlockType.NATURAL_STONE, 
//            						DryBiomeOres[k].getDefaultState(),
//            						(DryBiomeOres.length * 16)), 
//            				Placement.COUNT_RANGE, 
//            				new CountRangeConfig(64, (k * DryBiomeOres.length), (k * DryBiomeOres.length), 256)));
//		else
//            biome.addFeature(
//            		Decoration.UNDERGROUND_ORES,
//            		Biome.createDecoratedFeature(
//            				Feature.ORE, 
//            				new OreFeatureConfig(
//            						FillerBlockType.NATURAL_STONE, 
//            						DryBiomeOres[k].getDefaultState(),
//            						(DryBiomeOres.length * 16)), 
//            				Placement.COUNT_RANGE, 
//            				new CountRangeConfig(64, (k * DryBiomeOres.length), 0, ((k + 1) * DryBiomeOres.length))));
//		};
//		
//		for(int l = 0; l < BiomeManager.getBiomes(BiomeManager.BiomeType.ICY).size(); l++)
//		{
//			Biome biome = BiomeManager.getBiomes(BiomeManager.BiomeType.ICY).get(l).biome;
//			Bare_Essentials.LOGGER.info("Logger: Icy biome!");
//
//			if (l == SnowyBiomeOres.length - 1 || l == SnowyBiomeOres.length - 2)
//            biome.addFeature(
//            		Decoration.UNDERGROUND_ORES,
//            		Biome.createDecoratedFeature(
//            				Feature.ORE, 
//            				new OreFeatureConfig(
//            						FillerBlockType.NATURAL_STONE, 
//            						SnowyBiomeOres[l].getDefaultState(),
//            						(SnowyBiomeOres.length * 16)), 
//            				Placement.COUNT_RANGE, 
//            				new CountRangeConfig(64, (l * SnowyBiomeOres.length), (l * SnowyBiomeOres.length), 256)));
//		else
//            biome.addFeature(
//            		Decoration.UNDERGROUND_ORES,
//            		Biome.createDecoratedFeature(
//            				Feature.ORE, 
//            				new OreFeatureConfig(
//            						FillerBlockType.NATURAL_STONE, 
//            						SnowyBiomeOres[l].getDefaultState(),
//            						(SnowyBiomeOres.length * 16)), 
//            				Placement.COUNT_RANGE, 
//            				new CountRangeConfig(64, (l * SnowyBiomeOres.length), 0, ((l + 1) * SnowyBiomeOres.length))));
//		};
//		
//	};
	

		

	
		for (Biome biome : ForgeRegistries.BIOMES) {

			//Snowy Biomes
			if (biome == Biomes.SNOWY_TUNDRA || biome == Biomes.ICE_SPIKES || biome == Biomes.SNOWY_TAIGA || biome == Biomes.SNOWY_TAIGA_MOUNTAINS 
					|| biome == Biomes.FROZEN_RIVER || biome == Biomes.SNOWY_BEACH) {
				
				for(int i = 0; i < SnowyBiomeOres.length; i++) {
					if (i == SnowyBiomeOres.length - 1 || i == SnowyBiomeOres.length - 2)
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						SnowyBiomeOres[i].getDefaultState(),
			            						(SnowyBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(2, (i * SnowyBiomeOres.length), 0, 256)));
					else
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						SnowyBiomeOres[i].getDefaultState(),
			            						(SnowyBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(2, (i * SnowyBiomeOres.length), 0, ((i + 1) * SnowyBiomeOres.length))));
				}
			}
			
			
			// Cold Biomes
			else if (biome == Biomes.MOUNTAINS  || biome == Biomes.GRAVELLY_MOUNTAINS || biome == Biomes.WOODED_MOUNTAINS || biome == Biomes.MODIFIED_GRAVELLY_MOUNTAINS 
					|| biome == Biomes.TAIGA  || biome == Biomes.TAIGA_MOUNTAINS || biome == Biomes.GIANT_TREE_TAIGA || biome == Biomes.GIANT_SPRUCE_TAIGA || biome == Biomes.STONE_SHORE) {
				
				for(int i = 0; i < ColdBiomeOres.length; i++) {
					if (i == ColdBiomeOres.length - 1 || i == ColdBiomeOres.length - 2)
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						ColdBiomeOres[i].getDefaultState(),
			            						(ColdBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(2, (i * ColdBiomeOres.length), 0, 256)));
					else
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						ColdBiomeOres[i].getDefaultState(),
			            						(ColdBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(2, (i * ColdBiomeOres.length), 0, ((i + 1) * ColdBiomeOres.length))));
				}
			}
			
			// 'Dry' biomes
			else if (biome == Biomes.DESERT || biome == Biomes.DESERT_LAKES  || biome == Biomes.SAVANNA  || biome == Biomes.SHATTERED_SAVANNA || biome == Biomes.BADLANDS  || biome == Biomes.ERODED_BADLANDS
					 || biome == Biomes.WOODED_BADLANDS_PLATEAU || biome == Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU || biome == Biomes.BADLANDS_PLATEAU  || biome == Biomes.SAVANNA_PLATEAU
					 || biome == Biomes.MODIFIED_BADLANDS_PLATEAU  || biome == Biomes.SHATTERED_SAVANNA_PLATEAU) {
				
				for(int i = 0; i < DryBiomeOres.length; i++) {
					if (i == DryBiomeOres.length - 1 || i == DryBiomeOres.length - 2)
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						DryBiomeOres[i].getDefaultState(),
			            						(DryBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(4, (i * DryBiomeOres.length), 0, 256)));
					else
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						DryBiomeOres[i].getDefaultState(),
			            						(DryBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(4, (i * DryBiomeOres.length), 0, ((i + 1) * DryBiomeOres.length))));
				}
			}
			
			// Temperate Biomes
			else if (biome == Biomes.PLAINS || biome == Biomes.SUNFLOWER_PLAINS || biome == Biomes.FOREST || biome == Biomes.FLOWER_FOREST || biome == Biomes.BIRCH_FOREST || biome == Biomes.TALL_BIRCH_FOREST
					 || biome == Biomes.DARK_FOREST || biome == Biomes.DARK_FOREST_HILLS || biome == Biomes.SWAMP || biome == Biomes.SWAMP_HILLS || biome == Biomes.JUNGLE || biome == Biomes.MODIFIED_JUNGLE
					 || biome == Biomes.JUNGLE_EDGE || biome == Biomes.MODIFIED_JUNGLE_EDGE || biome == Biomes.BAMBOO_JUNGLE || biome == Biomes.RIVER || biome == Biomes.BEACH
					 || biome == Biomes.MUSHROOM_FIELDS || biome == Biomes.MUSHROOM_FIELD_SHORE) {
				
				for(int i = 0; i < TemperateBiomeOres.length; i++) {
					if (i == TemperateBiomeOres.length - 1 || i == TemperateBiomeOres.length - 2)
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						TemperateBiomeOres[i].getDefaultState(),
			            						(TemperateBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(4, (i * TemperateBiomeOres.length), 0, 256)));
					else
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						TemperateBiomeOres[i].getDefaultState(),
			            						(TemperateBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(4, (i * TemperateBiomeOres.length), 0, ((i + 1) * TemperateBiomeOres.length))));
				}
			}
			
			// Acquatic Biomes
			else if (biome == Biomes.WARM_OCEAN || biome == Biomes.LUKEWARM_OCEAN || biome == Biomes.DEEP_LUKEWARM_OCEAN || biome == Biomes.OCEAN || biome == Biomes.DEEP_OCEAN  || biome == Biomes.COLD_OCEAN
					 || biome == Biomes.DEEP_COLD_OCEAN || biome == Biomes.FROZEN_OCEAN || biome == Biomes.DEEP_FROZEN_OCEAN) {
				
				for(int i = 0; i < AquaticBiomeOres.length; i++) {
					if (i == AquaticBiomeOres.length - 1 || i == AquaticBiomeOres.length - 2)
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						AquaticBiomeOres[i].getDefaultState(),
			            						(AquaticBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(4, (i * AquaticBiomeOres.length), 0, 256)));
					else
			            biome.addFeature(
			            		Decoration.UNDERGROUND_ORES,
			            		Biome.createDecoratedFeature(
			            				Feature.ORE, 
			            				new OreFeatureConfig(
			            						FillerBlockType.NATURAL_STONE, 
			            						AquaticBiomeOres[i].getDefaultState(),
			            						(AquaticBiomeOres.length * 16)), 
			            				Placement.COUNT_RANGE, 
			            				new CountRangeConfig(4, (i * AquaticBiomeOres.length), 0, ((i + 1) * AquaticBiomeOres.length))));
				}
			}
		}
	}
}