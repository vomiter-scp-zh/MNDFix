package com.vomiter.mndfix.mixin;

import com.mojang.datafixers.util.Pair;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;
import java.util.function.Supplier;

@Mixin(FoodProperties.class)
public interface FoodPropertiesAccessor {
    @Accessor("effects")
    List<Pair<Supplier<MobEffectInstance>, Float>> mndfix$getEffects();

    @Mutable
    @Accessor("effects")
    void mndfix$setEffects(List<Pair<Supplier<MobEffectInstance>, Float>> effects);
}