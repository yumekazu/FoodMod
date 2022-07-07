package com.yume.foodmod.item;

import com.yume.foodmod.FoodMod;
import com.yume.foodmod.block.ModBlocks;
import com.yume.foodmod.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MOD_ID);

    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> SALT_AND_PEPPER = ITEMS.register("salt_and_pepper", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> PASTA = ITEMS.register("pasta", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> RICE_NOODLES = ITEMS.register("rice_noodles", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> BLACK_PEPPER = ITEMS.register("black_pepper", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> SPICE_LEAF = ITEMS.register("spice_leaf", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> SOYBEAN = ITEMS.register("soybean", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds", () -> new ItemNameBlockItem(ModBlocks.ONION_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds", () -> new ItemNameBlockItem(ModBlocks.PEPPER_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds", () -> new ItemNameBlockItem(ModBlocks.RICE_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds", () -> new ItemNameBlockItem(ModBlocks.CABBAGE_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> SPICE_LEAF_SEEDS = ITEMS.register("spice_leaf_seeds", () -> new ItemNameBlockItem(ModBlocks.SPICE_LEAF_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));
    public static final RegistryObject<Item> SOYBEAN_SEEDS = ITEMS.register("soybean_seeds", () -> new ItemNameBlockItem(ModBlocks.SOYBEAN_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB)));

    public static final RegistryObject<Item> SOYMILK_BUCKET = ITEMS.register("soymilk_bucket", () -> new BucketItem(ModFluids.SOYMILK_FLUID, new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> ALCOHOL_BUCKET = ITEMS.register("alcohol_bucket", () -> new BucketItem(ModFluids.ALCOHOL_FLUID, new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> OIL_BUCKET = ITEMS.register("oil_bucket", () -> new BucketItem(ModFluids.OIL_FLUID, new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> JAM_BUCKET = ITEMS.register("jam_bucket", () -> new BucketItem(ModFluids.JAM_FLUID, new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SOYSAUCE_BUCKET = ITEMS.register("soysauce_bucket", () -> new BucketItem(ModFluids.SOYSAUCE_FLUID, new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).stacksTo(1)));


    //VANILLA
    public static final RegistryObject<Item> MELON_SORBET = ITEMS.register("melon_sorbet", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MELON_SORBET)));
    public static final RegistryObject<Item> BACON_EGGS = ITEMS.register("bacon_eggs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BACON_EGGS)));
    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("melon_juice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MELON_JUICE)));
    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.APPLE_JUICE)));
    public static final RegistryObject<Item> PUMPKIN_JUICE = ITEMS.register("pumpkin_juice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PUMPKIN_JUICE)));
    public static final RegistryObject<Item> SWEETBERRY_JUICE = ITEMS.register("sweetberry_juice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SWEETBERRY_JUICE)));
    public static final RegistryObject<Item> GLOWBERRY_JUICE = ITEMS.register("glowberry_juice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.GLOWBERRY_JUICE)));
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.APPLE_PIE)));
    public static final RegistryObject<Item> SWEETBERRY_PIE = ITEMS.register("sweetberry_pie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SWEETBERRY_PIE)));
    public static final RegistryObject<Item> GLOWBERRY_PIE = ITEMS.register("glowberry_pie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.GLOWBERRY_PIE)));
    public static final RegistryObject<Item> CHOCOLATE_MILKSHAKE = ITEMS.register("chocolate_milkshake", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHOCOLATE_MILKSHAKE)));
    public static final RegistryObject<Item> BERRY_MILKSHAKE = ITEMS.register("berry_milkshake", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BERRY_MILKSHAKE)));
    public static final RegistryObject<Item> VEGETABLES_SALAD = ITEMS.register("vegetables_salad", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.VEGETABLES_SALAD)));
    public static final RegistryObject<Item> FRUITS_SALAD = ITEMS.register("fruits_salad", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.FRUITS_SALAD)));
    public static final RegistryObject<Item> FLOWERS_SALAD = ITEMS.register("flowers_salad", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.FLOWERS_SALAD)));
    public static final RegistryObject<Item> BEETROOT_SALAD = ITEMS.register("beetroot_salad", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BEETROOT_SALAD)));
    public static final RegistryObject<Item> FISH_N_CHIPS = ITEMS.register("fish_n_chips", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.FISH_N_CHIPS)));
    public static final RegistryObject<Item> BERRY_COOKIE = ITEMS.register("berry_cookie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BERRY_COOKIE)));
    public static final RegistryObject<Item> WALNUT_COOKIE = ITEMS.register("walnut_cookie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.WALNUT_COOKIE)));
    public static final RegistryObject<Item> HONEY_GLAZED_CARROTS = ITEMS.register("honey_glazed_carrots", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.HONEY_GLAZED_CARROTS)));
    public static final RegistryObject<Item> HONEY_GLAZED_HAM = ITEMS.register("honey_glazed_ham", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.HONEY_GLAZED_HAM)));
    public static final RegistryObject<Item> HOT_CHOCOLATE = ITEMS.register("hot_chocolate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.HOT_CHOCOLATE)));
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.FRIED_EGG)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHOCOLATE_ICE_CREAM)));
    public static final RegistryObject<Item> BERRY_SORBET = ITEMS.register("berry_sorbet", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BERRY_SORBET)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BUTTER)));
    public static final RegistryObject<Item> CREAM = ITEMS.register("cream", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CREAM)));

    //MODDED
    public static final RegistryObject<Item> STOCK = ITEMS.register("stock", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.STOCK)));
    public static final RegistryObject<Item> TOMATO_SOUP = ITEMS.register("tomato_soup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.TOMATO_SOUP)));
    public static final RegistryObject<Item> FISH_SOUP = ITEMS.register("fish_soup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.FISH_SOUP)));
    public static final RegistryObject<Item> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PUMPKIN_SOUP)));
    public static final RegistryObject<Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.VEGETABLE_SOUP)));
    public static final RegistryObject<Item> CHICKEN_SOUP = ITEMS.register("chicken_soup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHICKEN_SOUP)));
    public static final RegistryObject<Item> BAMBOO_SOUP = ITEMS.register("bamboo_soup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BAMBOO_SOUP)));
    public static final RegistryObject<Item> ONION_SOUP = ITEMS.register("onion_soup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ONION_SOUP)));
    public static final RegistryObject<Item> NETHER_STEW = ITEMS.register("nether_stew", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.NETHER_STEW)));
    public static final RegistryObject<Item> END_STEW = ITEMS.register("end_stew", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.END_STEW)));

    public static final RegistryObject<Item> ROASTED_PEPPER = ITEMS.register("roasted_pepper", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROASTED_PEPPER)));
    public static final RegistryObject<Item> ROASTED_MUSHROOM = ITEMS.register("roasted_mushroom", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROASTED_MUSHROOM)));
    public static final RegistryObject<Item> ROASTED_BEETROOT = ITEMS.register("roasted_beetroot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROASTED_BEETROOT)));
    public static final RegistryObject<Item> ROASTED_CARROT = ITEMS.register("roasted_carrot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROASTED_CARROT)));
    public static final RegistryObject<Item> ROASTED_SEEDS = ITEMS.register("roasted_seeds", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROASTED_SEEDS)));
    public static final RegistryObject<Item> ROASTED_ONION = ITEMS.register("roasted_onion", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROASTED_ONION)));
    public static final RegistryObject<Item> ROASTED_WALNUT = ITEMS.register("roasted_walnut", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROASTED_WALNUT)));

    public static final RegistryObject<Item> STUFFED_POTATO = ITEMS.register("stuffed_potato", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.STUFFED_POTATO)));
    public static final RegistryObject<Item> STUFFED_PEPPER = ITEMS.register("stuffed_pepper", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.STUFFED_PEPPER)));
    public static final RegistryObject<Item> STUFFED_TOMATO = ITEMS.register("stuffed_tomato", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.STUFFED_TOMATO)));

    public static final RegistryObject<Item> MEAT_PIE = ITEMS.register("meat_pie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MEAT_PIE)));
    public static final RegistryObject<Item> TARTIFLETTE = ITEMS.register("tartiflette", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.TARTIFLETTE)));
    public static final RegistryObject<Item> SHRIMP_COCKTAIL = ITEMS.register("shrimp_cocktail", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SHRIMP_COCKTAIL)));
    public static final RegistryObject<Item> RISOTTO = ITEMS.register("risotto", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.RISOTTO)));
    public static final RegistryObject<Item> MUSHROOM_RISOTTO = ITEMS.register("mushroom_risotto", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MUSHROOM_RISOTTO)));
    public static final RegistryObject<Item> CHICKEN_CHORIZO_RISOTTO = ITEMS.register("chicken_chorizo_risotto", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHICKEN_CHORIZO_RISOTTO)));
    public static final RegistryObject<Item> CHILI_CON_CARNE = ITEMS.register("chili_con_carne", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHILI_CON_CARNE)));
    public static final RegistryObject<Item> CHORIZO = ITEMS.register("chorizo", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHORIZO)));
    public static final RegistryObject<Item> PAELLA = ITEMS.register("paella", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PAELLA)));
    public static final RegistryObject<Item> FISH_AND_CHORIZO = ITEMS.register("fish_and_chorizo", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.FISH_AND_CHORIZO)));
    public static final RegistryObject<Item> COUSCOUS = ITEMS.register("couscous", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.COUSCOUS)));
    public static final RegistryObject<Item> TUNA_BRICKS = ITEMS.register("tuna_bricks", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.TUNA_BRICKS)));
    public static final RegistryObject<Item> SLATA = ITEMS.register("slata", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SLATA)));
    public static final RegistryObject<Item> CHORBA = ITEMS.register("chorba", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHORBA)));
    public static final RegistryObject<Item> SANDWICH = ITEMS.register("sandwich", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SANDWICH)));
    public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHEESEBURGER)));
    public static final RegistryObject<Item> SPAGHETTI_BOLOGNESE = ITEMS.register("spaghetti_bolognese", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SPAGHETTI_BOLOGNESE)));
    public static final RegistryObject<Item> SPAGHETTI_CARBONARA = ITEMS.register("spaghetti_carbonara", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SPAGHETTI_CARBONARA)));
    public static final RegistryObject<Item> SALMON_PASTA = ITEMS.register("salmon_pasta", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SALMON_PASTA)));
    public static final RegistryObject<Item> MAC_N_CHEESE = ITEMS.register("mac_n_cheese", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MAC_N_CHEESE)));
    public static final RegistryObject<Item> PESTO_SAUCE_PASTA = ITEMS.register("pesto_sauce_pasta", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PESTO_SAUCE_PASTA)));
    public static final RegistryObject<Item> CHEESE_AND_HONEY_PIZZA = ITEMS.register("cheese_and_honey_pizza", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHEESE_AND_HONEY_PIZZA)));
    public static final RegistryObject<Item> MEAT_PIZZA = ITEMS.register("meat_pizza", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MEAT_PIZZA)));
    public static final RegistryObject<Item> VEGGIE_PIZZA = ITEMS.register("veggie_pizza", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.VEGGIE_PIZZA)));
    public static final RegistryObject<Item> SEA_PIZZA = ITEMS.register("sea_pizza", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SEA_PIZZA)));
    public static final RegistryObject<Item> SKEWER = ITEMS.register("skewer", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SKEWER)));
    public static final RegistryObject<Item> MOZZARELLA_TOMATO_SALAD = ITEMS.register("mozzarella_tomato_salad", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MOZZARELLA_TOMATO_SALAD)));

    public static final RegistryObject<Item> RAMEN = ITEMS.register("ramen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.RAMEN)));
    public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SUSHI)));
    public static final RegistryObject<Item> SHRIMP_SUSHI = ITEMS.register("shrimp_sushi", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SHRIMP_SUSHI)));
    public static final RegistryObject<Item> TAMAGO_SUSHI = ITEMS.register("tamago_sushi", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.TAMAGO_SUSHI)));
    public static final RegistryObject<Item> SUSHI_SET = ITEMS.register("sushi_set", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SUSHI_SET)));
    public static final RegistryObject<Item> MISO_SOUP = ITEMS.register("miso_soup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MISO_SOUP)));
    public static final RegistryObject<Item> TAMAGOYAKI = ITEMS.register("tamagoyaki", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.TAMAGOYAKI)));
    public static final RegistryObject<Item> OMURICE = ITEMS.register("omurice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.OMURICE)));
    public static final RegistryObject<Item> ONIGIRI = ITEMS.register("onigiri", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ONIGIRI)));
    public static final RegistryObject<Item> OYAKODON = ITEMS.register("oyakodon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.OYAKODON)));
    public static final RegistryObject<Item> KATSUDON = ITEMS.register("katsudon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.KATSUDON)));
    public static final RegistryObject<Item> BURGER_DINER = ITEMS.register("burger_diner", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BURGER_DINER)));
    public static final RegistryObject<Item> TOFU = ITEMS.register("tofu", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.TOFU)));

    public static final RegistryObject<Item> SALTED_CARAMEL = ITEMS.register("salted_caramel", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SALTED_CARAMEL)));
    public static final RegistryObject<Item> CARAMEL_ICE_CREAM = ITEMS.register("caramel_ice_cream", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CARAMEL_ICE_CREAM)));
    public static final RegistryObject<Item> CARAMEL_MILKSHAKE = ITEMS.register("caramel_milkshake", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CARAMEL_MILKSHAKE)));
    public static final RegistryObject<Item> CARAMEL_STUFFED_CHOCOLATE = ITEMS.register("caramel_stuffed_chocolate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CARAMEL_STUFFED_CHOCOLATE)));
    public static final RegistryObject<Item> MINT_STUFFED_CHOCOLATE = ITEMS.register("mint_stuffed_chocolate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MINT_STUFFED_CHOCOLATE)));
    public static final RegistryObject<Item> LEMON_STUFFED_CHOCOLATE = ITEMS.register("lemon_stuffed_chocolate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.LEMON_STUFFED_CHOCOLATE)));
    public static final RegistryObject<Item> ENERGY_BAR = ITEMS.register("energy_bar", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ENERGY_BAR)));
    public static final RegistryObject<Item> JAPANESE_BREAKFAST = ITEMS.register("japanese_breakfast", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.JAPANESE_BREAKFAST)));
    public static final RegistryObject<Item> OCCIDENTAL_BREAKFAST = ITEMS.register("occidental_breakfast", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.OCCIDENTAL_BREAKFAST)));
    public static final RegistryObject<Item> CORNFLAKES = ITEMS.register("cornflakes", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CORNFLAKES)));
    public static final RegistryObject<Item> ROSE_DES_SABLES = ITEMS.register("rose_des_sables", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROSE_DES_SABLES)));
    public static final RegistryObject<Item> MUESLI = ITEMS.register("muesli", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MUESLI)));
    public static final RegistryObject<Item> LEMON_PIE_MERINGUE = ITEMS.register("lemon_pie_meringue", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.LEMON_PIE_MERINGUE)));
    public static final RegistryObject<Item> MERINGUE = ITEMS.register("meringue", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MERINGUE)));
    public static final RegistryObject<Item> LAVENDER_CANDY = ITEMS.register("lavender_candy", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.LAVENDER_CANDY)));
    public static final RegistryObject<Item> LAVENDER_SYRUP = ITEMS.register("lavender_syrup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.LAVENDER_SYRUP)));
    public static final RegistryObject<Item> VIOLET_CANDY = ITEMS.register("violet_candy", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.VIOLET_CANDY)));
    public static final RegistryObject<Item> VIOLET_SYRUP = ITEMS.register("violet_syrup", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.VIOLET_SYRUP)));
    public static final RegistryObject<Item> CANDY = ITEMS.register("candy", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CANDY)));
    public static final RegistryObject<Item> HONEY_CANDY = ITEMS.register("honey_candy", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.HONEY_CANDY)));
    public static final RegistryObject<Item> POACHED_PEAR = ITEMS.register("poached_pear", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.POACHED_PEAR)));
    public static final RegistryObject<Item> PEAR_JUICE = ITEMS.register("pear_juice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PEAR_JUICE)));
    public static final RegistryObject<Item> PEAR_PIE = ITEMS.register("pear_pie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PEAR_PIE)));
    public static final RegistryObject<Item> TOMATO_JUICE = ITEMS.register("tomato_juice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.TOMATO_JUICE)));
    public static final RegistryObject<Item> LEMONADE = ITEMS.register("lemonade", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.LEMONADE)));
    public static final RegistryObject<Item> CARROT_CAKE = ITEMS.register("carrot_cake", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CARROT_CAKE)));
    public static final RegistryObject<Item> CHERRY_JUICE = ITEMS.register("cherry_juice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHERRY_JUICE)));
    public static final RegistryObject<Item> FORET_NOIRE = ITEMS.register("foret_noire", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.FORET_NOIRE)));
    public static final RegistryObject<Item> MERVEILLEUX = ITEMS.register("merveilleux", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MERVEILLEUX)));
    public static final RegistryObject<Item> BISCUIT = ITEMS.register("biscuit", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BISCUIT)));
    public static final RegistryObject<Item> UNICORN_BISCUIT = ITEMS.register("unicorn_biscuit", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.UNICORN_BISCUIT)));
    public static final RegistryObject<Item> LEMON_TIRAMISU = ITEMS.register("lemon_tiramisu", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.LEMON_TIRAMISU)));

    public static final RegistryObject<Item> SUMMER_COCKTAIL = ITEMS.register("summer_cocktail", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SUMMER_COCKTAIL)));
    public static final RegistryObject<Item> BLOODY_MARY = ITEMS.register("bloody_mary", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BLOODY_MARY)));
    public static final RegistryObject<Item> MOJITO = ITEMS.register("mojito", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MOJITO)));

    public static final RegistryObject<Item> LEMON_TEA = ITEMS.register("lemon_tea", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.LEMON_TEA)));
    public static final RegistryObject<Item> HONEY_TEA = ITEMS.register("honey_tea", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.HONEY_TEA)));
    public static final RegistryObject<Item> FRUIT_TEA = ITEMS.register("fruit_tea", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.FRUIT_TEA)));
    public static final RegistryObject<Item> HIBISCUS_TEA = ITEMS.register("hibiscus_tea", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.HIBISCUS_TEA)));
    public static final RegistryObject<Item> ROSE_TEA = ITEMS.register("rose_tea", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ROSE_TEA)));
    public static final RegistryObject<Item> MINT_TEA = ITEMS.register("mint_tea", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.MINT_TEA)));

    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PEPPER)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ONION)));
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CABBAGE)));
    public static final RegistryObject<Item> PEAR = ITEMS.register("pear", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PEAR)));
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.LEMON)));
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHERRY)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> SHRIMP = ITEMS.register("shrimp", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.SHRIMP)));
    public static final RegistryObject<Item> PUMPKIN_SLICE = ITEMS.register("pumpkin_slice", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.PUMPKIN_SLICE)));

    public static final RegistryObject<Item> CHOCOLATE_ROLL = ITEMS.register("chocolate_roll", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHOCOLATE_ROLL)));
    public static final RegistryObject<Item> HONEY_ROLL = ITEMS.register("honey_roll", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.HONEY_ROLL)));
    public static final RegistryObject<Item> JAM_ROLL = ITEMS.register("jam_roll", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.JAM_ROLL)));

    public static final RegistryObject<Item> STEWED_APPLES = ITEMS.register("stewed_apples", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.STEWED_APPLES)));
    public static final RegistryObject<Item> CHERRY_PIE = ITEMS.register("cherry_pie", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CHERRY_PIE)));
    public static final RegistryObject<Item> HACHIS_PARMENTIER = ITEMS.register("hachis_parmentier", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.HACHIS_PARMENTIER)));
    public static final RegistryObject<Item> BOEUF_BOURGUIGNON = ITEMS.register("boeuf_bourguignon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.BOEUF_BOURGUIGNON)));
    public static final RegistryObject<Item> QUICHE_LORRAINE = ITEMS.register("quiche_lorraine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.QUICHE_LORRAINE)));
    public static final RegistryObject<Item> GRATIN_DAUPHINOIS = ITEMS.register("gratin_dauphinois", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.GRATIN_DAUPHINOIS)));
    public static final RegistryObject<Item> CREPES = ITEMS.register("crepes", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.CREPES)));


    //EASTER EGGS
    public static final RegistryObject<Item> YUME_DELIGHT = ITEMS.register("yume_delight", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.YUME_DELIGHT)));
    public static final RegistryObject<Item> ALPZZ_DELIGHT = ITEMS.register("alpzz_delight", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOODMOD_TAB).food(ModFoods.ALPZZ_DELIGHT)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
