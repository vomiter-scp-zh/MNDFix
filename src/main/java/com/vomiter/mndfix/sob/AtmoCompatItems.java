//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vomiter.mndfix.sob;

import com.syndicatemc.sob.init.SOBFluids;
import com.syndicatemc.sob.init.SOBItems;
import com.syndicatemc.sob.item.FoodConstants;
import com.syndicatemc.sob.item.OrangeJuiceItem;
import com.syndicatemc.sob.item.SunriseSeltzerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.registry.ModItems;

public class AtmoCompatItems {
    public static final RegistryObject<Item> ORANGE_JUICE;
    public static final RegistryObject<Item> SUNRISE_SELTZER;

    public static void init() {
    }

    static {
        ORANGE_JUICE = CompatSOBItems.ITEMS.register("orange_juice", () -> new OrangeJuiceItem(ModItems.drinkItem().food(FoodConstants.ORANGE_JUICE)));
        SUNRISE_SELTZER = CompatSOBItems.ITEMS.register("sunrise_seltzer", () -> new SunriseSeltzerItem((Fluid)SOBFluids.SUNRISE_SELTZER.get(), (new Item.Properties()).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE).food(FoodConstants.SUNRISE_SELTZER)));
    }
}
