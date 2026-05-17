package com.vomiter.mndfix.mixin;

import com.sammy.minersdelight.setup.MDItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = MDItems.class, remap = false)
public abstract class MDItems_ModTagsCompatMixin {

    private static final TagKey<Item> MND_FIX_CABBAGE_ROLL_INGREDIENTS =
            TagKey.create(
                    Registries.ITEM,
                    new ResourceLocation("farmersdelight", "cabbage_roll_ingredients")
            );

    @Redirect(
            method = "<clinit>",
            at = @At(
                    value = "FIELD",
                    target = "Lvectorwing/farmersdelight/common/tag/ModTags;CABBAGE_ROLL_INGREDIENTS:Lnet/minecraft/tags/TagKey;"
            ),
            require = 0
    )
    private static TagKey<Item> mndfix$redirectCabbageRollIngredients() {
        return MND_FIX_CABBAGE_ROLL_INGREDIENTS;
    }
}