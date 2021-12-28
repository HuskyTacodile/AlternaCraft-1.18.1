package com.huskytacodile.alternacraft.data;

import com.huskytacodile.alternacraft.block.ModBlocks;
import com.huskytacodile.alternacraft.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> p_176532_) {
        ShapedRecipeBuilder.shaped(ModBlocks.DNA_COMBINATOR.get())
                .define('T', ModItems.TITANIUM_INGOT.get())
                .pattern("TT")
                .pattern("TT")
                .pattern("TT")
                .unlockedBy("has_material", has(ModItems.TITANIUM_INGOT.get()))
                .save(p_176532_);
    }
}
