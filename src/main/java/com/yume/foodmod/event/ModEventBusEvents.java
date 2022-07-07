package com.yume.foodmod.event;

import com.yume.foodmod.FoodMod;
import com.yume.foodmod.event.loot.*;
import com.yume.foodmod.recipe.CookingPotRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = FoodMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
            new TomatoSeedsFromGrassAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"tomato_seeds_from_grass")),
            new OnionSeedsFromGrassAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"onion_seeds_from_grass")),
            new PepperSeedsFromGrassAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"pepper_seeds_from_grass")),
            new RiceSeedsFromGrassAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"rice_seeds_from_grass")),
            new CabbageSeedsFromGrassAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"cabbage_seeds_from_grass")),
            new SpiceLeafSeedsFromGrassAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"spice_leaf_seeds_from_grass")),
            new SoybeanSeedsFromGrassAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"soybean_seeds_from_grass")),
            new PearFromBirchLeavesAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"pear_from_birch_leaves")),
            new LemonFromJungleLeavesAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"lemon_from_jungle_leaves")),
            new BlackPepperFromAcaciaLeavesAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"black_pepper_from_acacia_leaves")),
            new CherryFromWCherryLeavesAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"cherry_from_wcherry_leaves")),
            new CherryFromPCherryLeavesAdditionModifier.Serializer().setRegistryName (new ResourceLocation(FoodMod.MOD_ID,"cherry_from_pcherry_leaves"))
        );
    }

    @SubscribeEvent
    public static void RegisterRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, CookingPotRecipe.Type.ID, CookingPotRecipe.Type.INSTANCE);
    }
}