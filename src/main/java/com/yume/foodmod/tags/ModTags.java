package com.yume.foodmod.tags;

import com.yume.foodmod.FoodMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        // public static final TagKey<Block> DOWSING_ROD_VALUABLES = tag("dowsing_rod_valuables");

        private static TagKey<Block> tag(String name) {
            return net.minecraft.tags.BlockTags.create(new ResourceLocation(FoodMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return net.minecraft.tags.BlockTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Items {
        public static final TagKey<Item> FRIES = forgeTag("fries");
        public static final TagKey<Item> PUMPKIN_SLICE = forgeTag("pumpkin_slice");
        public static final TagKey<Item> SEAFOOD = forgeTag("seafood");
        public static final TagKey<Item> ROSE = forgeTag("rose");
        public static final TagKey<Item> CARAMEL = forgeTag("caramel");
        public static final TagKey<Item> CHORIZO = forgeTag("chorizo");
        public static final TagKey<Item> TEA = forgeTag("tea");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(FoodMod.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
