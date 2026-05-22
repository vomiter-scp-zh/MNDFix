package com.vomiter.mndfix.compatdelight;

import java.util.function.Supplier;
import net.fixerlink.compatdelight.compat.borninchaosdelight.item.ChaosModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.BlockShapes;
import vectorwing.farmersdelight.common.block.RotatedFeastBlock;

public class CompatChaosModBlocks {
    public static final DeferredRegister<Block> BLOCKS;
    public static final RegistryObject<Block> HONEY_GLAZED_MONSTER_FLESH;

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ChaosModItems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "compatdelight");
        HONEY_GLAZED_MONSTER_FLESH = registerBlock("honey_glazed_monster_flesh_block", () -> new RotatedFeastBlock(Properties.copy(Blocks.STONE), ChaosModItems.HONEY_GLAZED_MONSTER_FLESH, false, BlockShapes.SHEPHERDS_PIE_SHAPES, BlockShapes.TRAY_SHAPE));
    }
}
