package com.huskytacodile.alternacraft.entities;

import com.huskytacodile.alternacraft.Alternacraft;

import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, Alternacraft.MOD_ID);

    public static final RegistryObject<EntityType<JWGAFemaleSpinoEntity>> JWGAFEMALESPINO =
            ENTITY_TYPES.register("jwgafemalespino",
                    () -> EntityType.Builder.of(JWGAFemaleSpinoEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "jwgafemalespino").toString()));

    public static final RegistryObject<EntityType<NotSoHollySpinoEntity>> NOT_SO_HOLLY_SPINO =
            ENTITY_TYPES.register("not_so_holly_spino",
                    () -> EntityType.Builder.of(NotSoHollySpinoEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "not_so_holly_spino").toString()));

    public static final RegistryObject<EntityType<MaleSpinoEntity>> MALESPINO =
            ENTITY_TYPES.register("male_spino",
                    () -> EntityType.Builder.of(MaleSpinoEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "male_spino").toString()));

    public static final RegistryObject<EntityType<FemaleSpinoEntity>> FEMALESPINO =
            ENTITY_TYPES.register("female_spino",
                    () -> EntityType.Builder.of(FemaleSpinoEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "female_spino").toString()));

    public static final RegistryObject<EntityType<JWGAMaleSpinoEntity>> JWGAMALESPINO =
            ENTITY_TYPES.register("jwgamalespino",
                    () -> EntityType.Builder.of(JWGAMaleSpinoEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "jwgamalespino").toString()));

    public static final RegistryObject<EntityType<MaleCeratosuchopsEntity>> CERATOSUCHOPS_MALE =
            ENTITY_TYPES.register("ceratosuchops_male",
                    () -> EntityType.Builder.of(MaleCeratosuchopsEntity::new,
                                    MobCategory.CREATURE).sized(3f, 3f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "ceratosuchops_male").toString()));

    public static final RegistryObject<EntityType<FemaleCeratosuchopsEntity>> CERATOSUCHOPS_FEMALE =
            ENTITY_TYPES.register("ceratosuchops_female",
                    () -> EntityType.Builder.of(FemaleCeratosuchopsEntity::new,
                                    MobCategory.CREATURE).sized(3f, 3f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "ceratosuchops_female").toString()));

    public static final RegistryObject<EntityType<IndominusMaleEntity>> INDOMINUS_MALE =
            ENTITY_TYPES.register("indominus_male",
                    () -> EntityType.Builder.of(IndominusMaleEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "indominus_male").toString()));

    public static final RegistryObject<EntityType<IndominusFemaleEntity>> INDOMINUS_FEMALE =
            ENTITY_TYPES.register("indominus_female",
                    () -> EntityType.Builder.of(IndominusFemaleEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "indominus_female").toString()));

    public static final RegistryObject<EntityType<IndominusElementalEntity>> INDOMINUS_ELEMENTAL =
            ENTITY_TYPES.register("indominus_elemental",
                    () -> EntityType.Builder.of(IndominusElementalEntity::new,
                                    MobCategory.CREATURE).sized(4f, 4f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "indominus_elemental").toString()));

    public static final RegistryObject<EntityType<IndoraptorMaleEntity>> INDORAPTOR_MALE =
            ENTITY_TYPES.register("indoraptor_male",
                    () -> EntityType.Builder.of(IndoraptorMaleEntity::new,
                                    MobCategory.CREATURE).sized(3f, 3f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "indoraptor_male").toString()));

    public static final RegistryObject<EntityType<IndoraptorFemaleEntity>> INDORAPTOR_FEMALE =
            ENTITY_TYPES.register("indoraptor_female",
                    () -> EntityType.Builder.of(IndoraptorFemaleEntity::new,
                                    MobCategory.CREATURE).sized(3f, 3f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "indoraptor_female").toString()));

    public static final RegistryObject<EntityType<IndoraptorChristmasEntity>> INDORAPTOR_CHRISTMAS =
            ENTITY_TYPES.register("indoraptor_christmas",
                    () -> EntityType.Builder.of(IndoraptorChristmasEntity::new,
                                    MobCategory.CREATURE).sized(3f, 3f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "indoraptor_christmas").toString()));

    public static final RegistryObject<EntityType<AcroMaleEntity>> ACRO_MALE =
            ENTITY_TYPES.register("acro_male",
                    () -> EntityType.Builder.of(AcroMaleEntity::new,
                                    MobCategory.CREATURE).sized(3.5f, 3.5f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "acro_male").toString()));

    public static final RegistryObject<EntityType<AcroFemaleEntity>> ACRO_FEMALE =
            ENTITY_TYPES.register("acro_female",
                    () -> EntityType.Builder.of(AcroFemaleEntity::new,
                                    MobCategory.CREATURE).sized(3.5f, 3.5f)
                            .build(new ResourceLocation(Alternacraft.MOD_ID, "acro_female").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
