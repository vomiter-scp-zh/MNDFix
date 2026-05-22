package com.vomiter.mndfix.mixin.sob;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.syndicatemc.sob.init.SOBRegistries;
import com.vomiter.mndfix.sob.CompatSOBBlocks;
import com.vomiter.mndfix.sob.CompatSOBCreativeTabs;
import com.vomiter.mndfix.sob.CompatSOBItems;
import net.minecraftforge.eventbus.api.IEventBus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = SOBRegistries.class, remap = false)
public class SOBRegistriesMixin {
    @WrapOperation(method = "init", at = @At(value = "INVOKE", target = "Lcom/syndicatemc/sob/init/SOBBlocks;init(Lnet/minecraftforge/eventbus/api/IEventBus;)V"))
    private static void replaceSOBBlocks(IEventBus bus, Operation<Void> original){
        CompatSOBBlocks.init(bus);
    }
    @WrapOperation(method = "init", at = @At(value = "INVOKE", target = "Lcom/syndicatemc/sob/init/SOBItems;init(Lnet/minecraftforge/eventbus/api/IEventBus;)V"))
    private static void replaceSOBItems(IEventBus bus, Operation<Void> original){
        CompatSOBItems.init(bus);
    }
    @WrapOperation(method = "init", at = @At(value = "INVOKE", target = "Lcom/syndicatemc/sob/init/SOBCreativeTabs;init(Lnet/minecraftforge/eventbus/api/IEventBus;)V"))
    private static void replaceSOBTabs(IEventBus bus, Operation<Void> original){
        CompatSOBCreativeTabs.init(bus);
    }
}
