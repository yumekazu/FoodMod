package com.yume.foodmod.block.custom;

import com.yume.foodmod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class SpiceLeafCropBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;
    public SpiceLeafCropBlock(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.SPICE_LEAF_SEEDS.get();
    }
}
