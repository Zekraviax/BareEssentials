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
	
		// Scheelite
		try {
			IUnbakedModel crystalOne = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_one.obj"));
			IUnbakedModel crystalTwo = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_two.obj"));
			IUnbakedModel crystalThree = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_three.obj"));
			IUnbakedModel crystalFour = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_four.obj"));
			IUnbakedModel crystalFive = ModelLoaderRegistry.getModelOrMissing(new ResourceLocation("bareessentials:block/crystal_five.obj"));
			
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
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystal_five", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/bornite_crystal_five", ""), crystalFiveBakedModel);
				event.getModelRegistry().put(new ModelResourceLocation("bareessentials:crystals/bornite_crystal_five", "inventory"), crystalFiveBakedModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
