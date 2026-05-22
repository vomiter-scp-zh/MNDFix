package com.vomiter.mndfix.mixin.compatdelight;

import com.vomiter.mndfix.compatdelight.CompatChaosModBlocks;
import net.fixerlink.compatdelight.compat.borninchaosdelight.item.ChaosModItems;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ChaosModItems.class)
public class ChaosModItemMixin {
    @Redirect(method = "addCreative", at = @At(value = "FIELD", target = "Lnet/fixerlink/compatdelight/compat/borninchaosdelight/block/ChaosModBlocks;HONEY_GLAZED_MONSTER_FLESH:Lnet/minecraftforge/registries/RegistryObject;", opcode = Opcodes.GETSTATIC), remap = false)
    private static RegistryObject<Block> replaceShepherdsRef(){
        return CompatChaosModBlocks.HONEY_GLAZED_MONSTER_FLESH;
    }

}
