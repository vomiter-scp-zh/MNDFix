//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vomiter.mndfix.sob;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CompatSOBCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS;
    public static final RegistryObject<CreativeModeTab> TAB_SOB;

    public static void init(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }

    static {
        CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "sob");
        TAB_SOB = CREATIVE_TABS.register("sob", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.sob")).icon(() -> new ItemStack((ItemLike)CompatSOBItems.GILDED_POTATO.get())).displayItems((parameters, output) -> {
            output.accept((ItemLike)CompatSOBItems.COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.METAL_COUNTER.get());
            if (ModList.get().isLoaded("mynethersdelight")) {
                output.accept((ItemLike)CompatSOBItems.NETHER_COUNTER.get());
            }

            output.accept((ItemLike)CompatSOBItems.OAK_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.SPRUCE_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.BIRCH_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.JUNGLE_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.ACACIA_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.DARK_OAK_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.MANGROVE_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.CHERRY_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.BAMBOO_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.CRIMSON_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.WARPED_COUNTER.get());
            if (ModList.get().isLoaded("mynethersdelight")) {
                output.accept((ItemLike)CompatSOBItems.POWDERY_COUNTER.get());
            }

            output.accept((ItemLike)CompatSOBItems.STONE_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.DEEPSLATE_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.BLACKSTONE_COUNTER.get());
            output.accept((ItemLike)CompatSOBItems.GILDED_POTATO.get());
            output.accept((ItemLike)CompatSOBItems.DRIPLEAVES.get());
            output.accept((ItemLike)CompatSOBItems.NOPAL.get());
            output.accept((ItemLike)CompatSOBItems.NOPAL_CRATE.get());
            output.accept((ItemLike)CompatSOBItems.PRICKLY_PEAR.get());
            output.accept((ItemLike)CompatSOBItems.GOLDEN_PRICKLY_PEAR.get());
            output.accept((ItemLike)CompatSOBItems.PRICKLY_PEAR_CRATE.get());
            output.accept((ItemLike)CompatSOBItems.ASPARAGUS_SEEDS.get());
            output.accept((ItemLike)CompatSOBItems.ASPARAGUS.get());
            output.accept((ItemLike)CompatSOBItems.ASPARAGUS_BUNDLE.get());
            output.accept((ItemLike)CompatSOBItems.WILD_ASPARAGUS.get());
            output.accept((ItemLike)CompatSOBItems.PEANUT.get());
            output.accept((ItemLike)CompatSOBItems.ROASTED_PEANUTS.get());
            output.accept((ItemLike)CompatSOBItems.PEANUT_BAG.get());
            output.accept((ItemLike)CompatSOBItems.WILD_PEANUTS.get());
            output.accept((ItemLike)CompatSOBItems.PITCHER_TUBER.get());
            output.accept((ItemLike)CompatSOBItems.PITCHER_TUBER_BUNDLE.get());
            output.accept((ItemLike)CompatSOBItems.TUBER_STICKS.get());
            output.accept((ItemLike)CompatSOBItems.DRIED_BERRIES.get());
            output.accept((ItemLike)CompatSOBItems.VEGGIE_WRAP.get());
            output.accept((ItemLike)CompatSOBItems.SCULK_TENDRIL.get());
            output.accept((ItemLike)CompatSOBItems.SCULK_ROLL.get());
            output.accept((ItemLike)CompatSOBItems.PBNJ.get());
            output.accept((ItemLike)CompatSOBItems.ANTS_LOG.get());
            output.accept((ItemLike)CompatSOBItems.EXP_CANDY.get());
            if (ModList.get().isLoaded("create")) {
                output.accept((ItemLike)CompatSOBItems.CINDER_DOUGH.get());
                output.accept((ItemLike)CompatSOBItems.CINDER_BREAD.get());
            }

            if (ModList.get().isLoaded("environmental") && ModList.get().isLoaded("upgrade_aquatic")) {
                output.accept((ItemLike)CompatSOBItems.DUCK_SANDWICH.get());
            }

            if (ModList.get().isLoaded("frycooks_delight") && ModList.get().isLoaded("autumnity")) {
                output.accept((ItemLike)CompatSOBItems.MAPLE_DONUT.get());
                output.accept((ItemLike)CompatSOBItems.FISH_STICK_STICK.get());
            }

            if (ModList.get().isLoaded("neapolitan")) {
                output.accept((ItemLike)NeapolitanCompatItems.PB_CHOCOLATE.get());
            }

            if (ModList.get().isLoaded("mynethersdelight")) {
                output.accept((ItemLike)MNDCompatItems.HONEY_BARBECUE_STICK.get());
            }

            output.accept((ItemLike)CompatSOBItems.ECHO_ROCK_CANDY.get());
            output.accept((ItemLike)CompatSOBItems.INK_SOUP.get());
            output.accept((ItemLike)CompatSOBItems.ASPARAGUS_SOUP.get());
            output.accept((ItemLike)CompatSOBItems.CANDIED_PEANUTS.get());
            if (ModList.get().isLoaded("environmental")) {
                output.accept((ItemLike)CompatSOBItems.EXQUISITE_MUSHROOM_SOUP.get());
            }

            if (ModList.get().isLoaded("autumnity")) {
                output.accept((ItemLike)AutumnityCompatItems.FOUL_SALAD.get());
            }

            if (ModList.get().isLoaded("atmospheric")) {
                output.accept((ItemLike)CompatSOBItems.SPIKY_SALAD.get());
            }

            if (ModList.get().isLoaded("miners_delight")) {
                output.accept((ItemLike)CompatSOBItems.ROOT_SALAD.get());
            }

            if (ModList.get().isLoaded("frycooks_delight")) {
                output.accept((ItemLike)CompatSOBItems.POUTINE.get());
            }

            if (ModList.get().isLoaded("neapolitan") && ModList.get().isLoaded("environmental")) {
                output.accept((ItemLike)NeapolitanCompatItems.BANANA_SUNDAE.get());
            }

            output.accept((ItemLike)CompatSOBItems.MANGROVE_STIR_FRY.get());
            output.accept((ItemLike)CompatSOBItems.GRILLED_VEGETABLES.get());
            output.accept((ItemLike)CompatSOBItems.ROOT_STEAK.get());
            output.accept((ItemLike)CompatSOBItems.CACTUS_PORKCHOP.get());
            if (ModList.get().isLoaded("environmental")) {
                output.accept((ItemLike)CompatSOBItems.TRUFFLE_PASTA.get());
            }

            if (ModList.get().isLoaded("atmospheric")) {
                output.accept((ItemLike)CompatSOBItems.SUGAR_CHICKEN.get());
            }

            if (ModList.get().isLoaded("frycooks_delight")) {
                output.accept((ItemLike)CompatSOBItems.FISH_FRY.get());
            }

            output.accept((ItemLike)CompatSOBItems.PEANUT_BUTTER.get());
            if (ModList.get().isLoaded("neapolitan")) {
                output.accept((ItemLike)CompatSOBItems.STRAWBERRY_JAM.get());
                output.accept((ItemLike)NeapolitanCompatItems.MINT_JELLY.get());
            }

            if (ModList.get().isLoaded("atmospheric")) {
                output.accept((ItemLike)CompatSOBItems.ORANGE_MARMALADE.get());
                output.accept((ItemLike)CompatSOBItems.CURRANT_JAM.get());
            }

            if (ModList.get().isLoaded("mynethersdelight")) {
                output.accept((ItemLike)MNDCompatItems.PEPPER_JELLY.get());
            }

            output.accept((ItemLike)CompatSOBItems.BIRCH_BEER.get());
            output.accept((ItemLike)CompatSOBItems.GLITTERING_GLOOP.get());
            output.accept((ItemLike)CompatSOBItems.CACTUS_JUICE.get());
            output.accept((ItemLike)CompatSOBItems.BUILDER_SMOOTHIE.get());
            if (ModList.get().isLoaded("farmersrespite")) {
                output.accept((ItemLike)CompatSOBItems.BITTER_TEA.get());
            }

            if (ModList.get().isLoaded("atmospheric")) {
                output.accept((ItemLike)AtmoCompatItems.ORANGE_JUICE.get());
                output.accept((ItemLike)CompatSOBItems.ALOE_TEA.get());
            }

            output.accept((ItemLike)CompatSOBItems.HARD_CIDER.get());
            output.accept((ItemLike)CompatSOBItems.PRICKLY_MELOMEL.get());
            if (ModList.get().isLoaded("atmospheric")) {
                output.accept((ItemLike)CompatSOBItems.TEQUILA.get());
                output.accept((ItemLike)AtmoCompatItems.SUNRISE_SELTZER.get());
            }

            if (ModList.get().isLoaded("savage_and_ravage")) {
                output.accept((ItemLike)CompatSOBItems.CREEPER_DRINK.get());
            }

            if (ModList.get().isLoaded("neapolitan")) {
                output.accept((ItemLike)CompatSOBItems.PALE_DAIQUIRI.get());
            }

            if (ModList.get().isLoaded("miners_delight")) {
                output.accept((ItemLike)CompatSOBItems.ROOT_BEER.get());
            }

            output.accept((ItemLike)CompatSOBItems.BUSTLING_BREW.get());
            output.accept((ItemLike)CompatSOBItems.DEATH_DRINK.get());
            if (ModList.get().isLoaded("spelunkery")) {
                output.accept((ItemLike)CompatSOBItems.PORTAL_DRINK.get());
            }

            if (ModList.get().isLoaded("endergetic")) {
                output.accept((ItemLike)CompatSOBItems.UNRIPE_EUMOZZ_CHEESE_WHEEL.get());
                output.accept((ItemLike)CompatSOBItems.EUMOZZ_CHEESE_WHEEL.get());
                output.accept((ItemLike)CompatSOBItems.EUMOZZ_CHEESE_WEDGE.get());
            }

            output.accept((ItemLike)CompatSOBItems.BIG_SOUP_BLOCK.get());
            output.accept((ItemLike)CompatSOBItems.BIG_SOUP.get());
            if (ModList.get().isLoaded("miners_delight") && ModList.get().isLoaded("buzzier_bees")) {
                output.accept((ItemLike)CompatSOBItems.SILVERFISH_PLATTER_BLOCK.get());
                output.accept((ItemLike)CompatSOBItems.SILVERFISH_TOAST.get());
            }

            if (ModList.get().isLoaded("autumnity") && ModList.get().isLoaded("environmental")) {
                output.accept((ItemLike)CompatSOBItems.ROAST_TURKEY_BLOCK.get());
                output.accept((ItemLike)CompatSOBItems.ROAST_TURKEY.get());
            }

            if (ModList.get().isLoaded("autumnity") && ModList.get().isLoaded("frycooks_delight")) {
                output.accept((ItemLike)CompatSOBItems.DONUT_BOX_BLOCK.get());
            }

            output.accept((ItemLike)CompatSOBItems.RED_RUM_SKULL.get());
            output.accept((ItemLike)CompatSOBItems.CAMEL_FEED.get());
        }).build());
    }
}
