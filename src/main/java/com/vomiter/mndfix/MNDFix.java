package com.vomiter.mndfix;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

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

}
