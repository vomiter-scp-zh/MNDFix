package com.vomiter.mndfix.mixin.compatdelight;

import com.vomiter.mndfix.compatdelight.CompatApotheosisModBlocks;
import net.fixerlink.compatdelight.compat.apotheosisdelight.item.ApotheosisModItems;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ApotheosisModItems.class)
public class ApotheosisModItemMixin {
    @Redirect(method = "addCreative", at = @At(value = "FIELD", target = "Lnet/fixerlink/compatdelight/compat/apotheosisdelight/block/ApotheosisModBlocks;INFUSED_PUMPKIN_BLOCK:Lnet/minecraftforge/registries/RegistryObject;", opcode = Opcodes.GETSTATIC), remap = false)
    private static RegistryObject<Block> replaceShepherdsRef(){
        return CompatApotheosisModBlocks.INFUSED_PUMPKIN_BLOCK;
    }

}
