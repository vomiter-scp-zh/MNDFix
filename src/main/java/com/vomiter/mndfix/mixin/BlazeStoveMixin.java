package com.vomiter.mndfix.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.items.IItemHandler;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import plus.dragons.createcentralkitchen.content.contraptions.blazeStove.BlazeStoveBlockEntity;
import vectorwing.farmersdelight.common.tag.ModTags;
import vectorwing.farmersdelight.common.utility.ItemUtils;

@Mixin(value = BlazeStoveBlockEntity.class, remap = false)
public class BlazeStoveMixin {
    @WrapOperation(method = "dropAll", at = @At(value = "INVOKE", target = "Lvectorwing/farmersdelight/common/utility/ItemUtils;isInventoryEmpty(Lnet/minecraftforge/items/IItemHandler;)Z"), require = 0)
    private static boolean wrapIventoryEmpty(IItemHandler iItemHandler, Operation<Boolean> original){
        return !ItemUtils.doesInventoryHaveItems(iItemHandler);
    }

    @Redirect(method = "boostCooking", at = @At(value = "FIELD", target = "Lvectorwing/farmersdelight/common/tag/ModTags;HEAT_CONDUCTORS:Lnet/minecraft/tags/TagKey;", opcode = Opcodes.GETSTATIC))
    private TagKey<Block> redirectTag(){
        return ModTags.Blocks.HEAT_CONDUCTORS;
    }

}
