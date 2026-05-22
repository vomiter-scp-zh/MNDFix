//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vomiter.mndfix.sob;

import com.syndicatemc.sob.init.SOBFluids;
import com.syndicatemc.sob.item.AloeTeaItem;
import com.syndicatemc.sob.item.BigSoupItem;
import com.syndicatemc.sob.item.BirchBeerItem;
import com.syndicatemc.sob.item.BuilderSmoothieItem;
import com.syndicatemc.sob.item.BustlingBrewItem;
import com.syndicatemc.sob.item.CamelFeedItem;
import com.syndicatemc.sob.item.CreeperDrinkItem;
import com.syndicatemc.sob.item.DeathDrinkItem;
import com.syndicatemc.sob.item.EchoRockCandyItem;
import com.syndicatemc.sob.item.ExpCandyItem;
import com.syndicatemc.sob.item.FoodConstants;
import com.syndicatemc.sob.item.GildedPotatoItem;
import com.syndicatemc.sob.item.IchorfruitItem;
import com.syndicatemc.sob.item.MangroveStirFryItem;
import com.syndicatemc.sob.item.NopalItem;
import com.syndicatemc.sob.item.PaleDaiquiriItem;
import com.syndicatemc.sob.item.PeanutButterItem;
import com.syndicatemc.sob.item.PortalDrinkItem;
import com.syndicatemc.sob.item.PricklyPearItem;
import com.syndicatemc.sob.item.RootBeerItem;
import com.syndicatemc.sob.item.SpikySaladItem;
import com.syndicatemc.sob.item.StarfruitItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import umpaz.brewinandchewin.common.item.BoozeItem;
import umpaz.brewinandchewin.common.item.JamJarItem;
import umpaz.brewinandchewin.common.registry.BnCItems;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.FuelBlockItem;
import vectorwing.farmersdelight.common.registry.ModItems;

public class CompatSOBItems {
    public static DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> COUNTER;
    public static final RegistryObject<Item> METAL_COUNTER;
    public static final RegistryObject<Item> NETHER_COUNTER;
    public static final RegistryObject<Item> STONE_COUNTER;
    public static final RegistryObject<Item> DEEPSLATE_COUNTER;
    public static final RegistryObject<Item> BLACKSTONE_COUNTER;
    public static final RegistryObject<Item> ACACIA_COUNTER;
    public static final RegistryObject<Item> BAMBOO_COUNTER;
    public static final RegistryObject<Item> BIRCH_COUNTER;
    public static final RegistryObject<Item> CHERRY_COUNTER;
    public static final RegistryObject<Item> CRIMSON_COUNTER;
    public static final RegistryObject<Item> DARK_OAK_COUNTER;
    public static final RegistryObject<Item> JUNGLE_COUNTER;
    public static final RegistryObject<Item> MANGROVE_COUNTER;
    public static final RegistryObject<Item> OAK_COUNTER;
    public static final RegistryObject<Item> SPRUCE_COUNTER;
    public static final RegistryObject<Item> WARPED_COUNTER;
    public static final RegistryObject<Item> POWDERY_COUNTER;
    public static final RegistryObject<Item> NOPAL_CRATE;
    public static final RegistryObject<Item> PRICKLY_PEAR_CRATE;
    public static final RegistryObject<Item> ASPARAGUS_BUNDLE;
    public static final RegistryObject<Item> PITCHER_TUBER_BUNDLE;
    public static final RegistryObject<Item> PEANUT_BAG;
    public static final RegistryObject<Item> WILD_ASPARAGUS;
    public static final RegistryObject<Item> WILD_PEANUTS;
    public static final RegistryObject<Item> PITCHER_TUBER;
    public static final RegistryObject<Item> UNRIPE_EUMOZZ_CHEESE_WHEEL;
    public static final RegistryObject<Item> EUMOZZ_CHEESE_WHEEL;
    public static final RegistryObject<Item> ICHOR_BUD;
    public static final RegistryObject<Item> ASPARAGUS_SEEDS;
    public static final RegistryObject<Item> CAMEL_FEED;
    public static final RegistryObject<Item> PEANUT;
    public static final RegistryObject<Item> STARFRUIT_SEED;
    public static final RegistryObject<Item> CINDER_DOUGH;
    public static final RegistryObject<Item> CINDER_BREAD;
    public static RegistryObject<Item> GILDED_POTATO;
    public static final RegistryObject<Item> DRIPLEAVES;
    public static final RegistryObject<Item> NOPAL;
    public static final RegistryObject<Item> PRICKLY_PEAR;
    public static final RegistryObject<Item> GOLDEN_PRICKLY_PEAR;
    public static final RegistryObject<Item> ASPARAGUS;
    public static final RegistryObject<Item> ROASTED_PEANUTS;
    public static final RegistryObject<Item> SCULK_TENDRIL;
    public static final RegistryObject<Item> SCULK_ROLL;
    public static final RegistryObject<Item> VEGGIE_WRAP;
    public static final RegistryObject<Item> TUBER_STICKS;
    public static final RegistryObject<Item> STARFRUIT;
    public static final RegistryObject<Item> ICHORFRUIT;
    public static final RegistryObject<Item> ECHO_ROCK_CANDY;
    public static final RegistryObject<Item> PBNJ;
    public static final RegistryObject<Item> DRIED_BERRIES;
    public static final RegistryObject<Item> ANTS_LOG;
    public static final RegistryObject<Item> EXP_CANDY;
    public static final RegistryObject<Item> EUMOZZ_CHEESE_WEDGE;
    public static final RegistryObject<Item> DUCK_SANDWICH;
    public static final RegistryObject<Item> MAPLE_DONUT;
    public static final RegistryObject<Item> FISH_STICK_STICK;
    public static final RegistryObject<Item> INK_SOUP;
    public static final RegistryObject<Item> MANGROVE_STIR_FRY;
    public static final RegistryObject<Item> GRILLED_VEGETABLES;
    public static final RegistryObject<Item> ASPARAGUS_SOUP;
    public static final RegistryObject<Item> ROOT_STEAK;
    public static final RegistryObject<Item> CACTUS_PORKCHOP;
    public static final RegistryObject<Item> CANDIED_PEANUTS;
    public static final RegistryObject<Item> TRUFFLE_PASTA;
    public static final RegistryObject<Item> EXQUISITE_MUSHROOM_SOUP;
    public static final RegistryObject<Item> SUGAR_CHICKEN;
    public static final RegistryObject<Item> SPIKY_SALAD;
    public static final RegistryObject<Item> POUTINE;
    public static final RegistryObject<Item> FISH_FRY;
    public static final RegistryObject<Item> ROOT_SALAD;
    public static final RegistryObject<Item> GLITTERING_GLOOP;
    public static final RegistryObject<Item> BIRCH_BEER;
    public static final RegistryObject<Item> CACTUS_JUICE;
    public static final RegistryObject<Item> BUILDER_SMOOTHIE;
    public static final RegistryObject<Item> BITTER_TEA;
    public static final RegistryObject<Item> ALOE_TEA;
    public static final RegistryObject<Item> BIG_SOUP;
    public static final RegistryObject<Item> BIG_SOUP_BLOCK;
    public static final RegistryObject<Item> RED_RUM_SKULL;
    public static final RegistryObject<Item> SILVERFISH_TOAST;
    public static final RegistryObject<Item> SILVERFISH_PLATTER_BLOCK;
    public static final RegistryObject<Item> ROAST_TURKEY;
    public static final RegistryObject<Item> ROAST_TURKEY_BLOCK;
    public static final RegistryObject<Item> DONUT_BOX_BLOCK;
    public static final RegistryObject<Item> PEANUT_BUTTER;
    public static final RegistryObject<Item> ORANGE_MARMALADE;
    public static final RegistryObject<Item> CURRANT_JAM;
    public static final RegistryObject<Item> STRAWBERRY_JAM;
    public static final RegistryObject<Item> HARD_CIDER;
    public static final RegistryObject<Item> DEATH_DRINK;
    public static final RegistryObject<Item> PRICKLY_MELOMEL;
    public static final RegistryObject<Item> BUSTLING_BREW;
    public static final RegistryObject<Item> TEQUILA;
    public static final RegistryObject<Item> CREEPER_DRINK;
    public static final RegistryObject<Item> PALE_DAIQUIRI;
    public static final RegistryObject<Item> PORTAL_DRINK;
    public static final RegistryObject<Item> ROOT_BEER;

    public static void init(IEventBus bus) {
        if (ModList.get().isLoaded("atmospheric")) {
            AtmoCompatItems.init();
        }

        if (ModList.get().isLoaded("autumnity")) {
            AutumnityCompatItems.init();
        }

        if (ModList.get().isLoaded("mynethersdelight")) {
            MNDCompatItems.init();
        }

        if (ModList.get().isLoaded("neapolitan")) {
            NeapolitanCompatItems.init();
        }

        ITEMS.register(bus);
    }

    static {
        ITEMS = DeferredRegister.create(Registries.ITEM, "sob");
        COUNTER = ITEMS.register("counter", () -> new BlockItem((Block)CompatSOBBlocks.COUNTER.get(), new Item.Properties()));
        METAL_COUNTER = ITEMS.register("metal_counter", () -> new BlockItem((Block)CompatSOBBlocks.METAL_COUNTER.get(), new Item.Properties()));
        NETHER_COUNTER = ITEMS.register("nether_counter", () -> new BlockItem((Block)CompatSOBBlocks.NETHER_COUNTER.get(), new Item.Properties()));
        STONE_COUNTER = ITEMS.register("stone_counter", () -> new BlockItem((Block)CompatSOBBlocks.STONE_COUNTER.get(), new Item.Properties()));
        DEEPSLATE_COUNTER = ITEMS.register("deepslate_counter", () -> new BlockItem((Block)CompatSOBBlocks.DEEPSLATE_COUNTER.get(), new Item.Properties()));
        BLACKSTONE_COUNTER = ITEMS.register("blackstone_counter", () -> new BlockItem((Block)CompatSOBBlocks.BLACKSTONE_COUNTER.get(), new Item.Properties()));
        ACACIA_COUNTER = ITEMS.register("acacia_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.ACACIA_COUNTER.get(), new Item.Properties(), 300));
        BAMBOO_COUNTER = ITEMS.register("bamboo_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.BAMBOO_COUNTER.get(), new Item.Properties(), 300));
        BIRCH_COUNTER = ITEMS.register("birch_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.BIRCH_COUNTER.get(), new Item.Properties(), 300));
        CHERRY_COUNTER = ITEMS.register("cherry_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.CHERRY_COUNTER.get(), new Item.Properties(), 300));
        CRIMSON_COUNTER = ITEMS.register("crimson_counter", () -> new BlockItem((Block)CompatSOBBlocks.CRIMSON_COUNTER.get(), new Item.Properties()));
        DARK_OAK_COUNTER = ITEMS.register("dark_oak_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.DARK_OAK_COUNTER.get(), new Item.Properties(), 300));
        JUNGLE_COUNTER = ITEMS.register("jungle_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.JUNGLE_COUNTER.get(), new Item.Properties(), 300));
        MANGROVE_COUNTER = ITEMS.register("mangrove_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.MANGROVE_COUNTER.get(), new Item.Properties(), 300));
        OAK_COUNTER = ITEMS.register("oak_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.OAK_COUNTER.get(), new Item.Properties(), 300));
        SPRUCE_COUNTER = ITEMS.register("spruce_counter", () -> new FuelBlockItem((Block)CompatSOBBlocks.SPRUCE_COUNTER.get(), new Item.Properties(), 300));
        WARPED_COUNTER = ITEMS.register("warped_counter", () -> new BlockItem((Block)CompatSOBBlocks.WARPED_COUNTER.get(), new Item.Properties()));
        POWDERY_COUNTER = ITEMS.register("powdery_counter", () -> new BlockItem((Block)CompatSOBBlocks.POWDERY_COUNTER.get(), new Item.Properties()));
        NOPAL_CRATE = ITEMS.register("nopal_crate", () -> new BlockItem((Block)CompatSOBBlocks.NOPAL_CRATE.get(), new Item.Properties()));
        PRICKLY_PEAR_CRATE = ITEMS.register("prickly_pear_crate", () -> new BlockItem((Block)CompatSOBBlocks.PRICKLY_PEAR_CRATE.get(), new Item.Properties()));
        ASPARAGUS_BUNDLE = ITEMS.register("asparagus_bundle", () -> new BlockItem((Block)CompatSOBBlocks.ASPARAGUS_BUNDLE.get(), new Item.Properties()));
        PITCHER_TUBER_BUNDLE = ITEMS.register("pitcher_tuber_bundle", () -> new BlockItem((Block)CompatSOBBlocks.PITCHER_TUBER_BUNDLE.get(), new Item.Properties()));
        PEANUT_BAG = ITEMS.register("peanut_bag", () -> new BlockItem((Block)CompatSOBBlocks.PEANUT_BAG.get(), new Item.Properties()));
        WILD_ASPARAGUS = ITEMS.register("wild_asparagus", () -> new BlockItem((Block)CompatSOBBlocks.WILD_ASPARAGUS.get(), new Item.Properties()));
        WILD_PEANUTS = ITEMS.register("wild_peanuts", () -> new BlockItem((Block)CompatSOBBlocks.WILD_PEANUTS.get(), new Item.Properties()));
        PITCHER_TUBER = ITEMS.register("pitcher_tuber", () -> new BlockItem((Block)CompatSOBBlocks.PITCHER_TUBER.get(), new Item.Properties()));
        UNRIPE_EUMOZZ_CHEESE_WHEEL = ITEMS.register("unripe_eumozz_cheese_wheel", () -> new BlockItem((Block)CompatSOBBlocks.UNRIPE_EUMOZZ_CHEESE_WHEEL.get(), (new Item.Properties()).stacksTo(16)));
        EUMOZZ_CHEESE_WHEEL = ITEMS.register("eumozz_cheese_wheel", () -> new BlockItem((Block)CompatSOBBlocks.EUMOZZ_CHEESE_WHEEL.get(), (new Item.Properties()).stacksTo(16)));
        ICHOR_BUD = ITEMS.register("ichor_bud", () -> new ItemNameBlockItem((Block)CompatSOBBlocks.ICHORFRUIT.get(), new Item.Properties()));
        ASPARAGUS_SEEDS = ITEMS.register("asparagus_seeds", () -> new ItemNameBlockItem((Block)CompatSOBBlocks.ASPARAGUS.get(), new Item.Properties()));
        CAMEL_FEED = ITEMS.register("camel_feed", () -> new CamelFeedItem(new Item.Properties()));
        PEANUT = ITEMS.register("peanut", () -> new ItemNameBlockItem((Block)CompatSOBBlocks.PEANUTS.get(), new Item.Properties()));
        STARFRUIT_SEED = ITEMS.register("starfruit_seed", () -> new ItemNameBlockItem((Block)CompatSOBBlocks.STARFRUIT.get(), new Item.Properties()));
        CINDER_DOUGH = ITEMS.register("cinder_dough", () -> new Item(new Item.Properties()));
        CINDER_BREAD = ITEMS.register("cinder_bread", () -> new Item(ModItems.foodItem(FoodConstants.CINDER_BREAD)));
        GILDED_POTATO = ITEMS.register("golden_potato", () -> new GildedPotatoItem(ModItems.foodItem(FoodConstants.GILDED_POTATO)));
        DRIPLEAVES = ITEMS.register("dripleaves", () -> new Item(ModItems.foodItem(FoodConstants.DRIPLEAVES)));
        NOPAL = ITEMS.register("nopal", () -> new NopalItem((Block)CompatSOBBlocks.NOPAL_CROP.get(), ModItems.foodItem(FoodConstants.NOPAL)));
        PRICKLY_PEAR = ITEMS.register("prickly_pear", () -> new PricklyPearItem(ModItems.foodItem(FoodConstants.PRICKLY_PEAR)));
        GOLDEN_PRICKLY_PEAR = ITEMS.register("golden_prickly_pear", () -> new PricklyPearItem(ModItems.foodItem(FoodConstants.GOLDEN_PRICKLY_PEAR)));
        ASPARAGUS = ITEMS.register("asparagus", () -> new Item(ModItems.foodItem(FoodConstants.ASPARAGUS)));
        ROASTED_PEANUTS = ITEMS.register("roasted_peanuts", () -> new Item(ModItems.foodItem(FoodConstants.ROASTED_PEANUTS)));
        SCULK_TENDRIL = ITEMS.register("sculk_tendril", () -> new Item(ModItems.foodItem(FoodConstants.SCULK_TENDRIL)));
        SCULK_ROLL = ITEMS.register("sculk_roll", () -> new Item(ModItems.foodItem(FoodConstants.SCULK_ROLL)));
        VEGGIE_WRAP = ITEMS.register("veggie_wrap", () -> new Item(ModItems.foodItem(FoodConstants.VEGGIE_WRAP)));
        TUBER_STICKS = ITEMS.register("tuber_sticks", () -> new Item(ModItems.foodItem(FoodConstants.TUBER_STICKS)));
        STARFRUIT = ITEMS.register("starfruit", () -> new StarfruitItem(ModItems.foodItem(FoodConstants.STARFRUIT)));
        ICHORFRUIT = ITEMS.register("ichorfruit", () -> new IchorfruitItem(ModItems.foodItem(FoodConstants.ICHORFRUIT)));
        ECHO_ROCK_CANDY = ITEMS.register("echo_rock_candy", () -> new EchoRockCandyItem(ModItems.foodItem(FoodConstants.ECHO_ROCK_CANDY)));
        PBNJ = ITEMS.register("pbnj", () -> new Item(ModItems.foodItem(FoodConstants.PBNJ)));
        DRIED_BERRIES = ITEMS.register("dried_berries", () -> new Item(ModItems.foodItem(FoodConstants.DRIED_BERRIES)));
        ANTS_LOG = ITEMS.register("ants_log", () -> new Item(ModItems.foodItem(FoodConstants.ANTS_LOG)));
        EXP_CANDY = ITEMS.register("exp_candy", () -> new ExpCandyItem(ModItems.foodItem(FoodConstants.EXP_CANDY)));
        EUMOZZ_CHEESE_WEDGE = ITEMS.register("eumozz_cheese_wedge", () -> new Item(ModItems.foodItem(FoodConstants.EUMOZZ_CHEESE_WEDGE)));
        DUCK_SANDWICH = ITEMS.register("duck_sandwich", () -> new Item(ModItems.foodItem(FoodConstants.DUCK_SANDWICH)));
        MAPLE_DONUT = ITEMS.register("maple_donut", () -> new Item(ModItems.foodItem(FoodConstants.MAPLE_DONUT)));
        FISH_STICK_STICK = ITEMS.register("fish_stick_stick", () -> new Item(ModItems.foodItem(FoodConstants.FISH_STICK_STICK)));
        INK_SOUP = ITEMS.register("ink_soup", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.INK_SOUP), true));
        MANGROVE_STIR_FRY = ITEMS.register("mangrove_stir_fry", () -> new MangroveStirFryItem(ModItems.bowlFoodItem(FoodConstants.MANGROVE_STIR_FRY)));
        GRILLED_VEGETABLES = ITEMS.register("grilled_vegetables", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.GRILLED_VEGETABLES), true));
        ASPARAGUS_SOUP = ITEMS.register("asparagus_soup", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.ASPARAGUS_SOUP), true));
        ROOT_STEAK = ITEMS.register("root_steak", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.ROOT_STEAK), true));
        CACTUS_PORKCHOP = ITEMS.register("cactus_porkchop", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.CACTUS_PORKCHOP), true));
        CANDIED_PEANUTS = ITEMS.register("candied_peanuts", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.CANDIED_PEANUTS), true));
        TRUFFLE_PASTA = ITEMS.register("truffle_pasta", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.TRUFFLE_PASTA), true));
        EXQUISITE_MUSHROOM_SOUP = ITEMS.register("exquisite_mushroom_soup", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.EXQUISITE_MUSHROOM_SOUP), true));
        SUGAR_CHICKEN = ITEMS.register("sugar_chicken", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.SUGAR_CHICKEN), true));
        SPIKY_SALAD = ITEMS.register("spiky_salad", () -> new SpikySaladItem(ModItems.bowlFoodItem(FoodConstants.SPIKY_SALAD)));
        POUTINE = ITEMS.register("poutine", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.POUTINE), true));
        FISH_FRY = ITEMS.register("fish_fry", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.FISH_FRY), true));
        ROOT_SALAD = ITEMS.register("root_salad", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.ROOT_SALAD), true));
        GLITTERING_GLOOP = ITEMS.register("glittering_gloop", () -> new DrinkableItem(ModItems.drinkItem().food(FoodConstants.GLITTERING_GLOOP), true, false));
        BIRCH_BEER = ITEMS.register("birch_beer", () -> new BirchBeerItem(ModItems.drinkItem().food(FoodConstants.BIRCH_BEER)));
        CACTUS_JUICE = ITEMS.register("cactus_juice", () -> new DrinkableItem(ModItems.drinkItem().food(FoodConstants.CACTUS_JUICE), true, false));
        BUILDER_SMOOTHIE = ITEMS.register("builder_smoothie", () -> new BuilderSmoothieItem(ModItems.drinkItem().food(FoodConstants.BUILDER_SMOOTHIE)));
        BITTER_TEA = ITEMS.register("bitter_tea", () -> new DrinkableItem(ModItems.drinkItem().food(FoodConstants.BITTER_TEA), true, false));
        ALOE_TEA = ITEMS.register("aloe_tea", () -> new AloeTeaItem(ModItems.drinkItem().food(FoodConstants.ALOE_TEA)));
        BIG_SOUP = ITEMS.register("big_soup", () -> new BigSoupItem(ModItems.bowlFoodItem(FoodConstants.BIG_SOUP)));
        BIG_SOUP_BLOCK = ITEMS.register("big_soup_block", () -> new BlockItem((Block)CompatSOBBlocks.BIG_SOUP_BLOCK.get(), (new Item.Properties()).stacksTo(1)));
        RED_RUM_SKULL = ITEMS.register("red_rum_skull", () -> new BlockItem((Block)CompatSOBBlocks.RED_RUM_SKULL.get(), (new Item.Properties()).stacksTo(1)));
        SILVERFISH_TOAST = ITEMS.register("silverfish_toast", () -> new Item(ModItems.foodItem(FoodConstants.SILVERFISH_TOAST)));
        SILVERFISH_PLATTER_BLOCK = ITEMS.register("silverfish_platter_block", () -> new BlockItem((Block)CompatSOBBlocks.SILVERFISH_PLATTER_BLOCK.get(), (new Item.Properties()).stacksTo(1)));
        ROAST_TURKEY = ITEMS.register("roast_turkey", () -> new ConsumableItem(ModItems.bowlFoodItem(FoodConstants.ROAST_TURKEY), true));
        ROAST_TURKEY_BLOCK = ITEMS.register("roast_turkey_block", () -> new BlockItem((Block)CompatSOBBlocks.ROAST_TURKEY_BLOCK.get(), (new Item.Properties()).stacksTo(1)));
        DONUT_BOX_BLOCK = ITEMS.register("donut_box_block", () -> new BlockItem((Block)CompatSOBBlocks.DONUT_BOX_BLOCK.get(), (new Item.Properties()).stacksTo(1)));
        PEANUT_BUTTER = ITEMS.register("peanut_butter", () -> new PeanutButterItem(ModItems.foodItem(FoodConstants.PEANUT_BUTTER).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
        ORANGE_MARMALADE = ITEMS.register("orange_marmalade", () -> new JamJarItem(ModItems.foodItem(FoodConstants.ORANGE_MARMALADE).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
        CURRANT_JAM = ITEMS.register("currant_jam", () -> new JamJarItem(ModItems.foodItem(FoodConstants.CURRANT_JAM).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
        STRAWBERRY_JAM = ITEMS.register("strawberry_jam", () -> new JamJarItem(ModItems.foodItem(FoodConstants.STRAWBERRY_JAM).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
        HARD_CIDER = ITEMS.register("hard_cider", () -> new BoozeItem((Fluid) SOBFluids.HARD_CIDER.get(), (new Item.Properties()).stacksTo(16).craftRemainder((Item)BnCItems.TANKARD.get()).food(FoodConstants.HARD_CIDER)));
        DEATH_DRINK = ITEMS.register("death_drink", () -> new DeathDrinkItem((Fluid)SOBFluids.DEATH_DRINK.get(), (new Item.Properties()).stacksTo(16).craftRemainder((Item)BnCItems.TANKARD.get()).food(FoodConstants.DEATH_DRINK)));
        PRICKLY_MELOMEL = ITEMS.register("prickly_melomel", () -> new BoozeItem((Fluid)SOBFluids.PRICKLY_MELOMEL.get(), (new Item.Properties()).stacksTo(16).craftRemainder((Item)BnCItems.TANKARD.get()).food(FoodConstants.PRICKLY_MELOMEL)));
        BUSTLING_BREW = ITEMS.register("bustling_brew", () -> new BustlingBrewItem((Fluid)SOBFluids.BUSTLING_BREW.get(), (new Item.Properties()).stacksTo(16).craftRemainder((Item)BnCItems.TANKARD.get()).food(FoodConstants.BUSTLING_BREW)));
        TEQUILA = ITEMS.register("tequila", () -> new BoozeItem((Fluid)SOBFluids.TEQUILA.get(), (new Item.Properties()).stacksTo(16).craftRemainder((Item)BnCItems.TANKARD.get()).food(FoodConstants.TEQUILA)));
        CREEPER_DRINK = ITEMS.register("creeper_drink", () -> new CreeperDrinkItem((Fluid)SOBFluids.CREEPER_DRINK.get(), (new Item.Properties()).stacksTo(16).craftRemainder((Item)BnCItems.TANKARD.get()).food(FoodConstants.CREEPER_DRINK)));
        PALE_DAIQUIRI = ITEMS.register("pale_daiquiri", () -> new PaleDaiquiriItem((Fluid)SOBFluids.PALE_DAIQUIRI.get(), (new Item.Properties()).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE).food(FoodConstants.PALE_DAIQUIRI)));
        PORTAL_DRINK = ITEMS.register("portal_drink", () -> new PortalDrinkItem((Fluid)SOBFluids.PORTAL_DRINK.get(), (new Item.Properties()).stacksTo(16).craftRemainder((Item)BnCItems.TANKARD.get()).food(FoodConstants.PORTAL_DRINK)));
        ROOT_BEER = ITEMS.register("root_beer", () -> new RootBeerItem((Fluid)SOBFluids.ROOT_BEER.get(), (new Item.Properties()).stacksTo(16).craftRemainder((Item)BnCItems.TANKARD.get()).food(FoodConstants.ROOT_BEER)));
    }
}
