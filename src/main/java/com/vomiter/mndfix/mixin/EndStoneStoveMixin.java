package com.vomiter.mndfix.mixin;

import com.axedgaming.endersdelight.block.entity.EndstoneStoveBlockEntity;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraftforge.items.IItemHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import vectorwing.farmersdelight.common.utility.ItemUtils;

@Mixin(value = EndstoneStoveBlockEntity.class, remap = false)
public class EndStoneStoveMixin {
    @WrapOperation(method = "cookingTick", at = @At(value = "INVOKE", target = "Lvectorwing/farmersdelight/common/utility/ItemUtils;isInventoryEmpty(Lnet/minecraftforge/items/IItemHandler;)Z"), require = 0)
    private static boolean wrapIventoryEmpty(IItemHandler iItemHandler, Operation<Boolean> original){
        return !ItemUtils.doesInventoryHaveItems(iItemHandler);
    }

}
