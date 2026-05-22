//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vomiter.mndfix.sob;

import com.syndicatemc.sob.init.SOBItems;
import com.syndicatemc.sob.item.compat.autumnity.AutumnityCompatFoodConstants;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.registry.ModItems;

public class AutumnityCompatItems {
    public static final RegistryObject<Item> FOUL_SALAD;

    public static void init() {
    }

    static {
        FOUL_SALAD = CompatSOBItems.ITEMS.register("foul_salad", () -> new ConsumableItem(ModItems.bowlFoodItem(AutumnityCompatFoodConstants.FOUL_SALAD), true));
    }
}
