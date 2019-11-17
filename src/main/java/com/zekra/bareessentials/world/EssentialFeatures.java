package com.zekra.bareessentials.world;

import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder("bareessentials")
public class EssentialFeatures {
	public static AbstractTreeFeature<NoFeatureConfig> GUM_TREE_FEATURE = new GumTreeFeature(NoFeatureConfig::deserialize, true);
}
