package com.vomiter.mndfix;

import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.vomiter.mndfix.mixin.FoodPropertiesAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod(MNDFix.MOD_ID)
public class MNDFix
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mndfix";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation modLoc(String path){
        return Helpers.id(MNDFix.MOD_ID, path);
    }

    public MNDFix(FMLJavaModLoadingContext context) {
        IEventBus modBus = context.getModEventBus();
        modBus.addListener(this::commonSetup);
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    public static void replaceComfort(FoodProperties food) {
        FoodPropertiesAccessor accessor = (FoodPropertiesAccessor) food;

        List<Pair<Supplier<MobEffectInstance>, Float>> oldEffects = accessor.mndfix$getEffects();
        List<Pair<Supplier<MobEffectInstance>, Float>> newEffects = new ArrayList<>(oldEffects.size());

        for (Pair<Supplier<MobEffectInstance>, Float> pair : oldEffects) {
            Supplier<MobEffectInstance> oldSupplier = pair.getFirst();
            float probability = pair.getSecond();

            newEffects.add(Pair.of(() -> {
                MobEffectInstance oldInstance = oldSupplier.get();

                if (oldInstance.getEffect() == ModEffects.COMFORT.get()) {
                    return new MobEffectInstance(
                            ModEffects.NOURISHMENT.get(),
                            oldInstance.getDuration(),
                            oldInstance.getAmplifier(),
                            oldInstance.isAmbient(),
                            oldInstance.isVisible(),
                            oldInstance.showIcon()
                    );
                }

                return oldInstance;
            }, probability));
        }

        accessor.mndfix$setEffects(newEffects);
    }

}
