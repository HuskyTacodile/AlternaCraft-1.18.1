package com.huskytacodile.alternacraft;

import com.huskytacodile.alternacraft.block.ModBlocks;
import com.huskytacodile.alternacraft.client.render.entity.*;
import com.huskytacodile.alternacraft.entities.ModEntityTypes;
import com.huskytacodile.alternacraft.item.ModItems;
import com.huskytacodile.alternacraft.util.ModItemProperties;
import com.huskytacodile.alternacraft.util.ModSoundEvents;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Alternacraft.MOD_ID)
public class Alternacraft {
    public static final String MOD_ID = "alternacraft";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Alternacraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModEntityTypes.register(eventBus);
        ModSoundEvents.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::registerRenderers);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        GeckoLib.initialize();

    }
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void registerRenderers(final EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(ModEntityTypes.JPFEMALESPINO.get(), manager -> new JPFemaleSpinoRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.JPMALESPINO.get(), manager -> new JPMaleSpinoRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.INDOMINUS_MALE.get(), manager -> new IndominusMaleRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.INDOMINUS_FEMALE.get(), manager -> new IndominusFemaleRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.INDOMINUS_ELEMENTAL.get(), manager -> new IndominusElementalRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.ACRO_FEMALE.get(), manager -> new AcroFemaleRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.ACRO_MALE.get(), manager -> new AcroMaleRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.MALESPINO.get(), manager -> new MaleSpinoRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.INDORAPTOR_MALE.get(), manager -> new IndoraptorMaleRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.INDORAPTOR_FEMALE.get(), manager -> new IndoraptorFemaleRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.INDORAPTOR_CHRISTMAS.get(), manager -> new IndoraptorChristmasRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.CERATOSUCHOPS_MALE.get(), manager -> new MaleCeratosuchopsRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.CERATOSUCHOPS_FEMALE.get(), manager -> new FemaleCeratosuchopsRenderer(manager));
        event.registerEntityRenderer(ModEntityTypes.FEMALESPINO.get(), manager -> new FemaleSpinoRenderer(manager));
        ModItemProperties.makeBow(ModItems.PAINITE_BOW.get());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DNA_SEQUENCER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DNA_COMBINATOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DNA_EXTRACTOR.get(), RenderType.cutout());

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
