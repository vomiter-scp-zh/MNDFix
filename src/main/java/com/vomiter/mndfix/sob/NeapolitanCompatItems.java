//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vomiter.mndfix.sob;

import com.syndicatemc.sob.item.BananaSundaeItem;
import com.syndicatemc.sob.item.compat.neapolitan.NeapolitanCompatFoodConstants;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegistryObject;
import umpaz.brewinandchewin.common.item.JamJarItem;
import vectorwing.farmersdelight.common.registry.ModItems;

public class NeapolitanCompatItems {
    public static final RegistryObject<Item> PB_CHOCOLATE;
    public static final RegistryObject<Item> MINT_JELLY;
    public static final RegistryObject<Item> BANANA_SUNDAE;

    public static void init() {
    }

    static {
        PB_CHOCOLATE = CompatSOBItems.ITEMS.register("pb_chocolate", () -> new Item(ModItems.foodItem(NeapolitanCompatFoodConstants.PB_CHOCOLATE)));
        MINT_JELLY = CompatSOBItems.ITEMS.register("mint_jelly", () -> new JamJarItem(ModItems.foodItem(NeapolitanCompatFoodConstants.MINT_JELLY).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
        BANANA_SUNDAE = CompatSOBItems.ITEMS.register("banana_sundae", () -> new BananaSundaeItem(ModItems.bowlFoodItem(NeapolitanCompatFoodConstants.BANANA_SUNDAE)));
    }
}
