package com.vomiter.mndfix.compatdelight;

import net.fixerlink.compatdelight.compat.apotheosisdelight.item.ApotheosisModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.BlockShapes;
import vectorwing.farmersdelight.common.block.RotatedFeastBlock;

import java.util.function.Supplier;

public class CompatApotheosisModBlocks {
    public static final DeferredRegister<Block> BLOCKS;
    public static final RegistryObject<Block> INFUSED_PUMPKIN_BLOCK;

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ApotheosisModItems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "compatdelight");
        INFUSED_PUMPKIN_BLOCK = registerBlock("infused_pumpkin_block", () -> new RotatedFeastBlock(BlockBehaviour.Properties.copy(Blocks.STONE), ApotheosisModItems.INFUSED_PUMPKIN, true, BlockShapes.SHEPHERDS_PIE_SHAPES, BlockShapes.TRAY_SHAPE));
    }

}
