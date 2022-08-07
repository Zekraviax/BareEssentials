package com.zekra.bareessentials.blocks.trees;

import com.zekra.bareessentials.world.WattleTreeFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;

public class WattleTree extends Tree {

	@Override
	protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
		return new WattleTreeFeature(NoFeatureConfig::deserialize, true);
	}
}