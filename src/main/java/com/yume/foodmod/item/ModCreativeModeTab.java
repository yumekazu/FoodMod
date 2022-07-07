package com.yume.foodmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FOODMOD_TAB = new CreativeModeTab("foodmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MELON_SORBET.get());
        }
    };
}
