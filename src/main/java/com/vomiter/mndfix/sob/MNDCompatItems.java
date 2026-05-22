//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vomiter.mndfix.sob;

import com.syndicatemc.sob.init.SOBItems;
import com.syndicatemc.sob.item.compat.mynethersdelight.MNDCompatFoodConstants;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegistryObject;
import umpaz.brewinandchewin.common.item.JamJarItem;
import vectorwing.farmersdelight.common.registry.ModItems;

public class MNDCompatItems {
    public static final RegistryObject<Item> HONEY_BARBECUE_STICK;
    public static final RegistryObject<Item> PEPPER_JELLY;

    public static void init() {
    }

    static {
        HONEY_BARBECUE_STICK = CompatSOBItems.ITEMS.register("honey_barbecue_stick", () -> new Item(ModItems.foodItem(MNDCompatFoodConstants.HONEY_BARBECUE_STICK)));
        PEPPER_JELLY = CompatSOBItems.ITEMS.register("pepper_jelly", () -> new JamJarItem(ModItems.foodItem(MNDCompatFoodConstants.PEPPER_JELLY).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
    }
}
