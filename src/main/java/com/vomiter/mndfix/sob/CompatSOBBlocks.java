package com.vomiter.mndfix.sob;

import com.syndicatemc.sob.block.AsparagusCropBlock;
import com.syndicatemc.sob.block.CounterBlock;
import com.syndicatemc.sob.block.DonutBoxBlock;
import com.syndicatemc.sob.block.IchorfruitBlock;
import com.syndicatemc.sob.block.NopalCropBlock;
import com.syndicatemc.sob.block.PeanutCropBlock;
import com.syndicatemc.sob.block.PitcherTuberBlock;
import com.syndicatemc.sob.block.PitcherTuberBundleBlock;
import com.syndicatemc.sob.block.StarfruitCropBlock;
import java.util.function.ToIntFunction;

import com.syndicatemc.sob.init.SOBItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import umpaz.brewinandchewin.common.block.CheeseWheelBlock;
import umpaz.brewinandchewin.common.block.UnripeCheeseWheelBlock;
import vectorwing.farmersdelight.common.block.RiceBaleBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;

public class CompatSOBBlocks {
    public static final DeferredRegister<Block> BLOCKS;
    public static final RegistryObject<Block> COUNTER;
    public static final RegistryObject<Block> METAL_COUNTER;
    public static final RegistryObject<Block> NETHER_COUNTER;
    public static final RegistryObject<Block> STONE_COUNTER;
    public static final RegistryObject<Block> DEEPSLATE_COUNTER;
    public static final RegistryObject<Block> BLACKSTONE_COUNTER;
    public static final RegistryObject<Block> ACACIA_COUNTER;
    public static final RegistryObject<Block> BAMBOO_COUNTER;
    public static final RegistryObject<Block> BIRCH_COUNTER;
    public static final RegistryObject<Block> CHERRY_COUNTER;
    public static final RegistryObject<Block> CRIMSON_COUNTER;
    public static final RegistryObject<Block> DARK_OAK_COUNTER;
    public static final RegistryObject<Block> JUNGLE_COUNTER;
    public static final RegistryObject<Block> MANGROVE_COUNTER;
    public static final RegistryObject<Block> OAK_COUNTER;
    public static final RegistryObject<Block> SPRUCE_COUNTER;
    public static final RegistryObject<Block> WARPED_COUNTER;
    public static final RegistryObject<Block> POWDERY_COUNTER;
    public static final RegistryObject<Block> SILVERFISH_PLATTER_BLOCK;
    public static final RegistryObject<Block> ROAST_TURKEY_BLOCK;
    public static final RegistryObject<Block> DONUT_BOX_BLOCK;
    public static final RegistryObject<Block> PITCHER_TUBER;
    public static final RegistryObject<Block> BIG_SOUP_BLOCK;
    public static final RegistryObject<Block> UNRIPE_EUMOZZ_CHEESE_WHEEL;
    public static final RegistryObject<Block> EUMOZZ_CHEESE_WHEEL;
    public static final RegistryObject<Block> RED_RUM_SKULL;
    public static final RegistryObject<Block> NOPAL_CROP;
    public static final RegistryObject<Block> ASPARAGUS;
    public static final RegistryObject<Block> ICHORFRUIT;
    public static final RegistryObject<Block> PEANUTS;
    public static final RegistryObject<Block> STARFRUIT;
    public static final RegistryObject<Block> WILD_ASPARAGUS;
    public static final RegistryObject<Block> WILD_PEANUTS;
    public static final RegistryObject<Block> NOPAL_CRATE;
    public static final RegistryObject<Block> PRICKLY_PEAR_CRATE;
    public static final RegistryObject<Block> ASPARAGUS_BUNDLE;
    public static final RegistryObject<Block> PITCHER_TUBER_BUNDLE;
    public static final RegistryObject<Block> PEANUT_BAG;

    private static ToIntFunction<BlockState> ichorfruitLight() {
        return (state) -> (Integer)state.getValue(BlockStateProperties.AGE_5) != 0 && (Integer)state.getValue(BlockStateProperties.AGE_5) != 5 ? (Integer)state.getValue(BlockStateProperties.AGE_5) * 2 : 0;
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "sob");
        COUNTER = BLOCKS.register("counter", () -> new Block(Properties.copy(Blocks.BRICKS)));
        METAL_COUNTER = BLOCKS.register("metal_counter", () -> new Block(Properties.copy(Blocks.BRICKS)));
        NETHER_COUNTER = BLOCKS.register("nether_counter", () -> new Block(Properties.copy(Blocks.NETHER_BRICKS)));
        STONE_COUNTER = BLOCKS.register("stone_counter", () -> new Block(Properties.copy(Blocks.SMOOTH_STONE)));
        DEEPSLATE_COUNTER = BLOCKS.register("deepslate_counter", () -> new Block(Properties.copy(Blocks.POLISHED_DEEPSLATE)));
        BLACKSTONE_COUNTER = BLOCKS.register("blackstone_counter", () -> new Block(Properties.copy(Blocks.POLISHED_BLACKSTONE)));
        ACACIA_COUNTER = BLOCKS.register("acacia_counter", () -> new CounterBlock(Properties.copy(Blocks.ACACIA_PLANKS)));
        BAMBOO_COUNTER = BLOCKS.register("bamboo_counter", () -> new CounterBlock(Properties.copy(Blocks.BAMBOO_PLANKS)));
        BIRCH_COUNTER = BLOCKS.register("birch_counter", () -> new CounterBlock(Properties.copy(Blocks.BIRCH_PLANKS)));
        CHERRY_COUNTER = BLOCKS.register("cherry_counter", () -> new CounterBlock(Properties.copy(Blocks.CHERRY_PLANKS)));
        CRIMSON_COUNTER = BLOCKS.register("crimson_counter", () -> new CounterBlock(Properties.copy(Blocks.CRIMSON_PLANKS)));
        DARK_OAK_COUNTER = BLOCKS.register("dark_oak_counter", () -> new CounterBlock(Properties.copy(Blocks.DARK_OAK_PLANKS)));
        JUNGLE_COUNTER = BLOCKS.register("jungle_counter", () -> new CounterBlock(Properties.copy(Blocks.JUNGLE_PLANKS)));
        MANGROVE_COUNTER = BLOCKS.register("mangrove_counter", () -> new CounterBlock(Properties.copy(Blocks.MANGROVE_PLANKS)));
        OAK_COUNTER = BLOCKS.register("oak_counter", () -> new CounterBlock(Properties.copy(Blocks.OAK_PLANKS)));
        SPRUCE_COUNTER = BLOCKS.register("spruce_counter", () -> new CounterBlock(Properties.copy(Blocks.SPRUCE_PLANKS)));
        WARPED_COUNTER = BLOCKS.register("warped_counter", () -> new CounterBlock(Properties.copy(Blocks.WARPED_PLANKS)));
        POWDERY_COUNTER = BLOCKS.register("powdery_counter", () -> new CounterBlock(Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.BAMBOO_WOOD)));
        SILVERFISH_PLATTER_BLOCK = BLOCKS.register("silverfish_platter_block", () -> new SilverfishPlatterFeastBlock(Properties.copy(Blocks.CAKE).noOcclusion()));
        ROAST_TURKEY_BLOCK = BLOCKS.register("roast_turkey_block", () -> new RoastTurkeyFeastBlock(Properties.copy(Blocks.CAKE).noOcclusion()));
        DONUT_BOX_BLOCK = BLOCKS.register("donut_box_block", () -> new DonutBoxBlock(Properties.copy(Blocks.SCAFFOLDING).noOcclusion()));
        PITCHER_TUBER = BLOCKS.register("pitcher_tuber", () -> new PitcherTuberBlock(Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.STEM), SOBItems.TUBER_STICKS));
        BIG_SOUP_BLOCK = BLOCKS.register("big_soup_block", () -> new BigSoupFeastBlock(Properties.of().strength(0.5F, 6.0F).sound(SoundType.LANTERN).noOcclusion()));
        EUMOZZ_CHEESE_WHEEL = BLOCKS.register("eumozz_cheese_wheel", () -> new CheeseWheelBlock(SOBItems.EUMOZZ_CHEESE_WEDGE, Properties.copy(Blocks.CAKE)));
        UNRIPE_EUMOZZ_CHEESE_WHEEL = BLOCKS.register("unripe_eumozz_cheese_wheel", () -> new UnripeCheeseWheelBlock(EUMOZZ_CHEESE_WHEEL, Properties.copy(Blocks.CAKE)));
        RED_RUM_SKULL = BLOCKS.register("red_rum_skull", () -> new RedRumSkullBlock(Properties.copy(Blocks.SKELETON_SKULL).noOcclusion().sound(SoundType.BONE_BLOCK)));
        NOPAL_CROP = BLOCKS.register("nopal_crop", () -> new NopalCropBlock(Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion(), () -> (Item)SOBItems.NOPAL.get(), () -> (Item)SOBItems.PRICKLY_PEAR.get()));
        ASPARAGUS = BLOCKS.register("asparagus", () -> new AsparagusCropBlock(Properties.copy(Blocks.WHEAT).noOcclusion()));
        ICHORFRUIT = BLOCKS.register("ichorfruit", () -> new IchorfruitBlock(Properties.copy(Blocks.WHEAT).noOcclusion().sound(SoundType.NETHER_SPROUTS).lightLevel(ichorfruitLight())));
        PEANUTS = BLOCKS.register("peanuts", () -> new PeanutCropBlock(Properties.copy(Blocks.WHEAT).noOcclusion()));
        STARFRUIT = BLOCKS.register("starfruit", () -> new StarfruitCropBlock(Properties.copy(Blocks.WHEAT).sound(SoundType.NETHER_WART).noOcclusion()));
        WILD_ASPARAGUS = BLOCKS.register("wild_asparagus", () -> new WildCropBlock(MobEffects.CONFUSION, 6, Properties.copy(Blocks.TALL_GRASS)));
        WILD_PEANUTS = BLOCKS.register("wild_peanuts", () -> new WildCropBlock(MobEffects.DAMAGE_RESISTANCE, 6, Properties.copy(Blocks.TALL_GRASS)));
        NOPAL_CRATE = BLOCKS.register("nopal_crate", () -> new Block(Properties.copy(Blocks.JUNGLE_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        PRICKLY_PEAR_CRATE = BLOCKS.register("prickly_pear_crate", () -> new Block(Properties.copy(Blocks.JUNGLE_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        ASPARAGUS_BUNDLE = BLOCKS.register("asparagus_bundle", () -> new RiceBaleBlock(Properties.copy(Blocks.HAY_BLOCK)));
        PITCHER_TUBER_BUNDLE = BLOCKS.register("pitcher_tuber_bundle", () -> new PitcherTuberBundleBlock(Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.STEM)));
        PEANUT_BAG = BLOCKS.register("peanut_bag", () -> new Block(Properties.copy(Blocks.WHITE_WOOL)));
    }
}
