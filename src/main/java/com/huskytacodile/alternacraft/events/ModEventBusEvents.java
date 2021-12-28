package com.huskytacodile.alternacraft.events;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.entities.*;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Alternacraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.JPFEMALESPINO.get(), JPFemaleSpinoEntity.attributes().build());
        event.put(ModEntityTypes.INDOMINUS_FEMALE.get(), IndominusFemaleEntity.attributes().build());
        event.put(ModEntityTypes.INDOMINUS_MALE.get(), IndominusMaleEntity.attributes().build());
        event.put(ModEntityTypes.INDOMINUS_ELEMENTAL.get(), IndominusElementalEntity.attributes().build());
        event.put(ModEntityTypes.ACRO_MALE.get(), AcroMaleEntity.attributes().build());
        event.put(ModEntityTypes.ACRO_FEMALE.get(), AcroFemaleEntity.attributes().build());
        event.put(ModEntityTypes.JPMALESPINO.get(), JPMaleSpinoEntity.attributes().build());
        event.put(ModEntityTypes.MALESPINO.get(), MaleSpinoEntity.attributes().build());
        event.put(ModEntityTypes.INDORAPTOR_MALE.get(), IndoraptorMaleEntity.attributes().build());
        event.put(ModEntityTypes.INDORAPTOR_FEMALE.get(), IndoraptorFemaleEntity.attributes().build());
        event.put(ModEntityTypes.INDORAPTOR_CHRISTMAS.get(), IndoraptorChristmasEntity.attributes().build());
        event.put(ModEntityTypes.CERATOSUCHOPS_MALE.get(), MaleCeratosuchopsEntity.attributes().build());
        event.put(ModEntityTypes.FEMALESPINO.get(), FemaleSpinoEntity.attributes().build());
        event.put(ModEntityTypes.CERATOSUCHOPS_FEMALE.get(), FemaleSpinoEntity.attributes().build());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        SpawnEggItem.eggs();
    }
}