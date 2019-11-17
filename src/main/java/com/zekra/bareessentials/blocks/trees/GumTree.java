package com.zekra.bareessentials.blocks.trees;

import java.util.Random;

import com.zekra.bareessentials.world.GumTreeFeature;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class GumTree extends Tree {

	@Override
	protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
		return new GumTreeFeature(NoFeatureConfig::deserialize, true);
	}
}