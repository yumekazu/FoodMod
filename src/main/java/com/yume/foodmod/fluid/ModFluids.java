package com.yume.foodmod.fluid;

import com.yume.foodmod.FoodMod;
import com.yume.foodmod.block.ModBlocks;
import com.yume.foodmod.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, FoodMod.MOD_ID);

    // Soymilk
    public static final RegistryObject<FlowingFluid> SOYMILK_FLUID
            = FLUIDS.register("soymilk_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.SOYMILK_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOYMILK_FLOWING
            = FLUIDS.register("soymilk_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.SOYMILK_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SOYMILK_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> SOYMILK_FLUID.get(), () -> SOYMILK_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xf2c2d2fa)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.SOYMILK_BLOCK.get()).bucket(() -> ModItems.SOYMILK_BUCKET.get());

    public static final RegistryObject<LiquidBlock> SOYMILK_BLOCK = ModBlocks.BLOCKS.register("soymilk",
            () -> new LiquidBlock(() -> ModFluids.SOYMILK_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    // Alcohol
    public static final RegistryObject<FlowingFluid> ALCOHOL_FLUID
            = FLUIDS.register("alcohol_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.ALCOHOL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ALCOHOL_FLOWING
            = FLUIDS.register("alcohol_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.ALCOHOL_PROPERTIES));


    public static final ForgeFlowingFluid.Properties ALCOHOL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> ALCOHOL_FLUID.get(), () -> ALCOHOL_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xfffac050)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.ALCOHOL_BLOCK.get()).bucket(() -> ModItems.ALCOHOL_BUCKET.get());

    public static final RegistryObject<LiquidBlock> ALCOHOL_BLOCK = ModBlocks.BLOCKS.register("alcohol",
            () -> new LiquidBlock(() -> ModFluids.ALCOHOL_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    // Oil
    public static final RegistryObject<FlowingFluid> OIL_FLUID
            = FLUIDS.register("oil_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.OIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> OIL_FLOWING
            = FLUIDS.register("oil_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.OIL_PROPERTIES));


    public static final ForgeFlowingFluid.Properties OIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> OIL_FLUID.get(), () -> OIL_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xfffeef00)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.OIL_BLOCK.get()).bucket(() -> ModItems.OIL_BUCKET.get());

    public static final RegistryObject<LiquidBlock> OIL_BLOCK = ModBlocks.BLOCKS.register("oil",
            () -> new LiquidBlock(() -> ModFluids.OIL_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    // Jam
    public static final RegistryObject<FlowingFluid> JAM_FLUID
            = FLUIDS.register("jam_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.JAM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> JAM_FLOWING
            = FLUIDS.register("jam_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.JAM_PROPERTIES));


    public static final ForgeFlowingFluid.Properties JAM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> JAM_FLUID.get(), () -> JAM_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(1400).luminosity(2).viscosity(2000).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xffac036a)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.JAM_BLOCK.get()).bucket(() -> ModItems.JAM_BUCKET.get());

    public static final RegistryObject<LiquidBlock> JAM_BLOCK = ModBlocks.BLOCKS.register("jam",
            () -> new LiquidBlock(() -> ModFluids.JAM_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    // Soysauce
    public static final RegistryObject<FlowingFluid> SOYSAUCE_FLUID
            = FLUIDS.register("soysauce_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.SOYSAUCE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOYSAUCE_FLOWING
            = FLUIDS.register("soysauce_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.SOYSAUCE_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SOYSAUCE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> SOYSAUCE_FLUID.get(), () -> SOYSAUCE_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xff291b01)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.SOYSAUCE_BLOCK.get()).bucket(() -> ModItems.SOYSAUCE_BUCKET.get());

    public static final RegistryObject<LiquidBlock> SOYSAUCE_BLOCK = ModBlocks.BLOCKS.register("soysauce",
            () -> new LiquidBlock(() -> ModFluids.SOYSAUCE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}