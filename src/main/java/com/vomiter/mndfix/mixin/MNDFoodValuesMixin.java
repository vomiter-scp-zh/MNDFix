package com.vomiter.mndfix.mixin;

import com.soytutta.mynethersdelight.common.utility.MNDFoodValues;
import com.vomiter.mndfix.MNDFix;
import net.minecraft.world.food.FoodProperties;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MNDFoodValues.class, remap = false)
public abstract class MNDFoodValuesMixin {

    @Shadow
    @Final
    public static FoodProperties EGG_SOUP;

    @Shadow
    @Final
    public static FoodProperties STRIDER_STEW;

    @Shadow
    @Final
    public static FoodProperties CRIMSON_STROGANOFF;

    @Shadow
    @Final
    public static FoodProperties SPICY_NOODLE_SOUP;

    @Shadow
    @Final
    public static FoodProperties SPICY_HOGLIN_STEW;

    @Shadow
    @Final
    public static FoodProperties ROCK_SOUP;

    @Shadow
    @Final
    public static FoodProperties STRIDER_STEW_CUP;

    @Shadow
    @Final
    public static FoodProperties SPICY_NOODLE_SOUP_CUP;

    @Shadow
    @Final
    public static FoodProperties SPICY_HOGLIN_STEW_CUP;

    @Shadow
    @Final
    public static FoodProperties ROCK_SOUP_CUP;

    @Shadow
    @Final
    public static FoodProperties EGG_SOUP_CUP;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void mndfix$replaceComfortEffects(CallbackInfo ci) {
        MNDFix.replaceComfort(EGG_SOUP);
        MNDFix.replaceComfort(STRIDER_STEW);
        MNDFix.replaceComfort(CRIMSON_STROGANOFF);
        MNDFix.replaceComfort(SPICY_NOODLE_SOUP);
        MNDFix.replaceComfort(SPICY_HOGLIN_STEW);
        MNDFix.replaceComfort(ROCK_SOUP);

        MNDFix.replaceComfort(STRIDER_STEW_CUP);
        MNDFix.replaceComfort(SPICY_NOODLE_SOUP_CUP);
        MNDFix.replaceComfort(SPICY_HOGLIN_STEW_CUP);
        MNDFix.replaceComfort(ROCK_SOUP_CUP);
        MNDFix.replaceComfort(EGG_SOUP_CUP);
    }

}