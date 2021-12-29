package com.huskytacodile.alternacraft.item;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.entities.ModEntityTypes;
import com.huskytacodile.alternacraft.item.custom.PainiteBowItem;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Alternacraft.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> JWGAFEMALESPINO_SPAWN_EGG = ITEMS.register("jpfemalespino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.JPFEMALESPINO, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> JPMALESPINO_SPAWN_EGG = ITEMS.register("jpspino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.JPMALESPINO, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));


    public static final RegistryObject<ForgeSpawnEggItem> INDOMINUS_FEMALE_SPAWN_EGG = ITEMS.register("indominus_female_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INDOMINUS_FEMALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> INDOMINUS_MALE_SPAWN_EGG = ITEMS.register("indominus_male_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INDOMINUS_MALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> MALE_SPINOSAURUS_SPAWN_EGG = ITEMS.register("male_spino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MALESPINO, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> FEMALE_SPINOSAURUS_SPAWN_EGG = ITEMS.register("female_spino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FEMALESPINO, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> CERATOSUCHOPS_MALE_SPAWN_EGG = ITEMS.register("ceratosuchops_male_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CERATOSUCHOPS_MALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> CERATOSUCHOPS_FEMALE_SPAWN_EGG = ITEMS.register("ceratosuchops_female_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CERATOSUCHOPS_FEMALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> INDOMINUS_ELEMENTAL_SPAWN_EGG = ITEMS.register("indominus_elemental_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INDOMINUS_ELEMENTAL, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> INDORAPTOR_MALE_SPAWN_EGG = ITEMS.register("indoraptor_male_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INDORAPTOR_MALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> INDORAPTOR_FEMALE_SPAWN_EGG = ITEMS.register("indoraptor_female_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INDORAPTOR_FEMALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> INDORAPTOR_CHRISTMAS_SPAWN_EGG = ITEMS.register("indoraptor_christmas_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INDORAPTOR_CHRISTMAS, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> ACRO_MALE_SPAWN_EGG = ITEMS.register("acro_male_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ACRO_MALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> ACRO_FEMALE_SPAWN_EGG = ITEMS.register("acro_female_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ACRO_FEMALE, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE = ITEMS.register("painite",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> AMONG_US_RED = ITEMS.register("among_us_red",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_SWORD = ITEMS.register("painite_sword",
            ()-> new SwordItem(ModItemTier.PAINITE, 2,1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_PICKAXE = ITEMS.register("painite_pickaxe",
            ()-> new PickaxeItem(ModItemTier.PAINITE, 1,-2f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_AXE = ITEMS.register("painite_axe",
            ()-> new AxeItem(ModItemTier.PAINITE, 4,-1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_SHOVEL = ITEMS.register("painite_shovel",
            ()-> new ShovelItem(ModItemTier.PAINITE, 0,-1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_HOE = ITEMS.register("painite_hoe",
            ()-> new HoeItem(ModItemTier.PAINITE, 0,0f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<PainiteBowItem> PAINITE_BOW = ITEMS.register("painite_bow",
            () -> new PainiteBowItem(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
