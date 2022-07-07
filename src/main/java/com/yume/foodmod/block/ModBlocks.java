package com.yume.foodmod.block;

import com.yume.foodmod.FoodMod;
import com.yume.foodmod.block.custom.*;
import com.yume.foodmod.item.ModCreativeModeTab;
import com.yume.foodmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FoodMod.MOD_ID);

    public static final RegistryObject<Block> COOKING_POT = registerBlock("cooking_pot", () -> new CookingPotBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()), ModCreativeModeTab.FOODMOD_TAB);

    //CROPS
    public static final RegistryObject<Block> TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop", () -> new TomatoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ONION_CROP = registerBlockWithoutBlockItem("onion_crop", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> PEPPER_CROP = registerBlockWithoutBlockItem("pepper_crop", () -> new PepperCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RICE_CROP = registerBlockWithoutBlockItem("rice_crop", () -> new RiceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CABBAGE_CROP = registerBlockWithoutBlockItem("cabbage_crop", () -> new CabbageCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SPICE_LEAF_CROP = registerBlockWithoutBlockItem("spice_leaf_crop", () -> new SpiceLeafCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SOYBEAN_CROP = registerBlockWithoutBlockItem("soybean_crop", () -> new SoybeanCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));




    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    //New block directly in item registry fonctions
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
