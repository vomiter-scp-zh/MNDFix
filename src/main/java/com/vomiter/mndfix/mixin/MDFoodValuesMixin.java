package com.vomiter.mndfix.mixin;

import com.sammy.minersdelight.setup.MDFoodValues;
import com.vomiter.mndfix.MNDFix;
import net.minecraft.world.food.FoodProperties;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MDFoodValues.class)
public class MDFoodValuesMixin {
    @Shadow
    @Final
    public static FoodProperties BEETROOT_SOUP;

    @Shadow
    @Final
    public static FoodProperties MUSHROOM_STEW;

    @Shadow
    @Final
    public static FoodProperties RABBIT_STEW;

    @Shadow
    @Final
    public static FoodProperties CAVE_SOUP;

    @Shadow
    @Final
    public static FoodProperties MOSS;

    @Shadow
    @Final
    public static FoodProperties BAT_SOUP;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void mndfix$replaceComfortEffects(CallbackInfo ci) {
        MNDFix.replaceComfort(BEETROOT_SOUP);
        MNDFix.replaceComfort(MUSHROOM_STEW);
        MNDFix.replaceComfort(RABBIT_STEW);
        MNDFix.replaceComfort(CAVE_SOUP);
        MNDFix.replaceComfort(MOSS);
        MNDFix.replaceComfort(BAT_SOUP);
    }
}
