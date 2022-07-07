package com.yume.foodmod.container;

import com.yume.foodmod.FoodMod;
import com.yume.foodmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, FoodMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<CookingPotContainer>> COOKING_POT_CONTAINER =
            BLOCK_ENTITIES.register("cooking_pot_container", () ->
                    BlockEntityType.Builder.of(CookingPotContainer::new,
                            ModBlocks.COOKING_POT.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
