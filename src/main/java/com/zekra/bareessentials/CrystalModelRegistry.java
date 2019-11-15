package com.zekra.bareessentials;

import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.IUnbakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.model.BasicState;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJModel;

public class CrystalModelRegistry {

	public static void RegisterCrystalModels(ModelBakeEvent event) {
		//String[] scheeliteResourceLocations = { "bareessentials:block/crystal_one.obj", "bareessentials:block/crystal_two.obj", "bareessentials:block/crystal_three.obj", "bareessentials:block/crystal_four.obj", "bareessentials:block/crystal_five.obj" };
		//String[] scheeliteModelResourceLocations = { "bareessentials:crystal_one", "bareessentials:crystal_two", "bareessentials:crystal_three", "bareessentials:crystal_four", "bareessentials:crystal_five" };
		IUnbakedModel crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_one.obj"));
		IUnbakedModel crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_two.obj"));
		IUnbakedModel crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_three.obj"));
		IUnbakedModel crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_four.obj"));
		IUnbakedModel crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_five.obj"));
		
		
		// Bornite
		try {
			IUnbakedModel borniteCrystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/bornite_crystal_one.obj"));
			IUnbakedModel borniteCrystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/bornite_crystal_two.obj"));
			IUnbakedModel borniteCrystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/bornite_crystal_three.obj"));
			IUnbakedModel borniteCrystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/bornite_crystal_four.obj"));
			IUnbakedModel borniteCrystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/bornite_crystal_five.obj"));
			
			if (borniteCrystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = borniteCrystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(borniteCrystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/bornite_crystal_one", ""), crystalOneBakedModel);
			}
			if (borniteCrystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = borniteCrystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(borniteCrystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/bornite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (borniteCrystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = borniteCrystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(borniteCrystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/bornite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (borniteCrystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = borniteCrystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(borniteCrystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/bornite_crystal_four", ""), crystalFourBakedModel);
			}
			if (borniteCrystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = borniteCrystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(borniteCrystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/bornite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:bornite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Cassiterite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cassiterite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cassiterite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cassiterite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cassiterite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cassiterite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/cassiterite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/cassiterite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/cassiterite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/cassiterite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/cassiterite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:cassiterite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Cinnabar
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cinnabar_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cinnabar_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cinnabar_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cinnabar_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/cinnabar_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/cassiterite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/cassiterite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/cassiterite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/cassiterite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/cinnabar_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:cinnabar_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Dolomite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/dolomite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/dolomite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/dolomite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/dolomite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/dolomite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/dolomite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/dolomite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/dolomite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/dolomite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/dolomite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:dolomite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Dolomite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/galena_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/galena_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/galena_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/galena_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/galena_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/galena_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/galena_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/galena_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/galena_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/galena_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:galena_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Hematite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/hematite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/hematite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/hematite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/hematite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/hematite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/hematite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/hematite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/hematite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/hematite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/hematite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:hematite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Ilmenite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/ilmenite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/ilmenite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/ilmenite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/ilmenite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/ilmenite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/ilmenite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/ilmenite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/ilmenite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/ilmenite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/ilmenite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:ilmenite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Pentlandite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pentlandite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pentlandite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pentlandite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pentlandite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pentlandite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/pentlandite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/pentlandite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/pentlandite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/pentlandite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/pentlandite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:pentlandite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Pyrolusite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pyrolusite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pyrolusite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pyrolusite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pyrolusite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/pyrolusite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/pyrolusite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/pyrolusite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/pyrolusite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/pyrolusite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/pyrolusite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:pyrolusite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Scheelite
		try {
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:scheelite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Sperrylite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sperrylite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sperrylite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sperrylite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sperrylite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sperrylite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/sperrylite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/sperrylite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/sperrylite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/sperrylite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/sperrylite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:sperrylite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Sphalerite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sphalerite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sphalerite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sphalerite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sphalerite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/sphalerite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/sphalerite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/sphalerite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/sphalerite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/sphalerite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/sphalerite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:sphalerite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Uraninite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/uraninite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/uraninite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/uraninite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/uraninite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/uraninite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/uraninite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/uraninite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/uraninite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/uraninite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/uraninite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:uraninite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Wolframite
		try {
			crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/wolframite_crystal_one.obj"));
			crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/wolframite_crystal_two.obj"));
			crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/wolframite_crystal_three.obj"));
			crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/wolframite_crystal_four.obj"));
			crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystals/wolframite_crystal_five.obj"));
			
			if (crystalOne instanceof OBJModel) {
				IBakedModel crystalOneBakedModel = crystalOne.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalOne.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/wolframite_crystal_one", ""), crystalOneBakedModel);
			}
			if (crystalTwo instanceof OBJModel) {
				IBakedModel crystalTwoBakedModel = crystalTwo.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalTwo.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/wolframite_crystal_two", ""), crystalTwoBakedModel);
			}
			if (crystalThree instanceof OBJModel) {
				IBakedModel crystalThreeBakedModel = crystalThree.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalThree.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/wolframite_crystal_three", ""), crystalThreeBakedModel);
			}
			if (crystalFour instanceof OBJModel) {
				IBakedModel crystalFourBakedModel = crystalFour.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFour.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/wolframite_crystal_four", ""), crystalFourBakedModel);
			}
			if (crystalFive instanceof OBJModel) {
				IBakedModel crystalFiveBakedModel = crystalFive.bake(event.getModelLoader(), ModelLoader.defaultTextureGetter(), new BasicState(crystalFive.getDefaultState(), false), DefaultVertexFormats.BLOCK);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:block/crystals/wolframite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:wolframite_crystal", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
