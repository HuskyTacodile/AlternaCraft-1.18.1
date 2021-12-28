package com.huskytacodile.alternacraft.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ALTERNACRAFT_GROUP = new CreativeModeTab("alternacraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FOSSIL.get());
        }
    };
    public static final CreativeModeTab WIP_TAB = new CreativeModeTab("wip_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMONG_US_RED.get());
        }
    };
}
