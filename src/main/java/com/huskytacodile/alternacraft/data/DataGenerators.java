package com.huskytacodile.alternacraft.data;

import com.huskytacodile.alternacraft.Alternacraft;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Alternacraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();

        generator.addProvider(new ModRecipeProvider(generator));
        generator.addProvider(new ModLootTableProvider(generator));

    }

}
