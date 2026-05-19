package com.vomiter.mndfix.mixin;

import com.vomiter.mndfix.MNDFix;
import net.minecraft.world.food.FoodProperties;
import net.yirmiri.dungeonsdelight.common.util.DDProperties;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DDProperties.FoodP.class)
public class DDFoodValuesMixin {
    @Shadow
    @Final
    public static FoodProperties CHLOROPASTA;

    @Shadow
    @Final
    public static FoodProperties GLOWBERRY_GELATIN;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void mndfix$replaceComfortEffects(CallbackInfo ci) {
        MNDFix.replaceComfort(CHLOROPASTA);
        MNDFix.replaceComfort(GLOWBERRY_GELATIN);
    }

}
