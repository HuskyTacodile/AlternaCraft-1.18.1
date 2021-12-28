package com.huskytacodile.alternacraft.util;

import com.huskytacodile.alternacraft.Alternacraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Alternacraft.MOD_ID);

    public static final RegistryObject<SoundEvent> SPINO_ROAR1 =
            registerSoundEvent("spino_roar1");
    public static final RegistryObject<SoundEvent> SPINO_ROAR2 =
            registerSoundEvent("spino_roar2");
    public static final RegistryObject<SoundEvent> SPINO_ROAR3 =
            registerSoundEvent("spino_roar3");
    public static final RegistryObject<SoundEvent> SATELLITE_SPINO =
            registerSoundEvent("satellite_spino");
    public static final RegistryObject<SoundEvent> INDOMINUS_REX_ROAR1 =
            registerSoundEvent("indominus_rex_roar1");
    public static final RegistryObject<SoundEvent> INDOMINUS_REX_ROAR2 =
            registerSoundEvent("indominus_rex_roar2");
    public static final RegistryObject<SoundEvent> INDOMINUS_REX_GROWL =
            registerSoundEvent("indominus_rex_growl");
    public static final RegistryObject<SoundEvent> ACRO_GROWL =
            registerSoundEvent("acro_growl");
    public static final RegistryObject<SoundEvent> ACRO_ROAR1 =
            registerSoundEvent("acro_roar1");
    public static final RegistryObject<SoundEvent> ACRO_ROAR2 =
            registerSoundEvent("acro_roar2");
    public static final RegistryObject<SoundEvent> INDORAPTOR_ROAR_1 =
            registerSoundEvent("indoraptor_roar_1");
    public static final RegistryObject<SoundEvent> INDORAPTOR_ROAR_2 =
            registerSoundEvent("indoraptor_roar_2");
    public static final RegistryObject<SoundEvent> INDORAPTOR_ROAR_3 =
            registerSoundEvent("indoraptor_roar_3");
    public static final RegistryObject<SoundEvent> SPINOSAURUS_IDLE_ROAR =
            registerSoundEvent("spinosaurus_idle_roar");
    public static final RegistryObject<SoundEvent> SPINOSAURUS_HURT =
            registerSoundEvent("spinosaurus_hurt");
    public static final RegistryObject<SoundEvent> SPINOSAURUS_DEATH =
            registerSoundEvent("spinosaurus_death");
    public static final RegistryObject<SoundEvent> CERATOSUCHOPS_IDLE_ROAR =
            registerSoundEvent("ceratosuchops_idle_roar");
    public static final RegistryObject<SoundEvent> CERATOSUCHOPS_HURT =
            registerSoundEvent("ceratosuchops_hurt");
    public static final RegistryObject<SoundEvent> CERATOSUCHOPS_DEATH =
            registerSoundEvent("ceratosuchops_death");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Alternacraft.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
