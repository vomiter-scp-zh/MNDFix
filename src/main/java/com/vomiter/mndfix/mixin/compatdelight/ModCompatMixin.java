package com.vomiter.mndfix.mixin.compatdelight;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.vomiter.mndfix.compatdelight.CompatApotheosisModBlocks;
import com.vomiter.mndfix.compatdelight.CompatChaosModBlocks;
import net.fixerlink.compatdelight.compat.apotheosisdelight.block.ApotheosisModBlocks;
import net.fixerlink.compatdelight.compat.apotheosisdelight.item.ApotheosisModItems;
import net.fixerlink.compatdelight.compat.borninchaosdelight.item.ChaosModItems;
import net.fixerlink.compatdelight.register.ModCompat;
import net.minecraftforge.eventbus.api.IEventBus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Map;
import java.util.function.Consumer;

@Mixin(ModCompat.class)
public class ModCompatMixin {
    @WrapOperation(method = "<clinit>", at = @At(value = "INVOKE", target = "Ljava/util/Map;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"))
    private static Object replaceCertainCompat(Map instance, Object stringKey, Object value, Operation<Object> original){
        if("born_in_chaos_v1".equals(stringKey)){
            var replacedV = (Consumer<IEventBus>)(bus) -> {
                System.out.println("[Compat Delight] Born in Chaos detected — registering compat");
                ChaosModItems.register(bus);
                CompatChaosModBlocks.register(bus);
            };
            return original.call(instance, stringKey, replacedV);
        }
        if("apotheosis".equals(stringKey)){
            var replacedV = (Consumer<IEventBus>)(bus) -> {
                System.out.println("[Compat Delight] Apotheosis detected — registering compat");
                ApotheosisModItems.register(bus);
                CompatApotheosisModBlocks.register(bus);
            };
            return original.call(instance, stringKey, replacedV);
        }
        return original.call(instance, stringKey, value);
    }
}
