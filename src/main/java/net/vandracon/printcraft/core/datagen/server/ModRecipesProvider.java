package net.vandracon.printcraft.core.datagen.server;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;
import net.vandracon.printcraft.Reference;
import net.vandracon.printcraft.core.registry.ModBlocks;
import net.vandracon.printcraft.core.registry.ModItems;

import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider {
    public ModRecipesProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PRINTER_BLOCK.get())
                .patternLine("III")
                .patternLine("# #")
                .patternLine("III")
                .key('I', Tags.Items.INGOTS_IRON)
                .key('#', Tags.Items.DUSTS_REDSTONE)
                .setGroup(Reference.MOD_ID)
                .addCriterion("cobblestone", InventoryChangeTrigger.Instance.forItems(Blocks.COBBLESTONE))
                .build(consumer);

        registerFilament(consumer, ModItems.FILAMENT_BLACK.get(), Tags.Items.DYES_BLACK);
        registerFilament(consumer, ModItems.FILAMENT_BLUE.get(), Tags.Items.DYES_BLUE);
        registerFilament(consumer, ModItems.FILAMENT_BROWN.get(), Tags.Items.DYES_BROWN);
        registerFilament(consumer, ModItems.FILAMENT_CYAN.get(), Tags.Items.DYES_CYAN);
        registerFilament(consumer, ModItems.FILAMENT_GRAY.get(), Tags.Items.DYES_GRAY);
        registerFilament(consumer, ModItems.FILAMENT_GREEN.get(), Tags.Items.DYES_GREEN);
        registerFilament(consumer, ModItems.FILAMENT_LIGHT_BLUE.get(), Tags.Items.DYES_LIGHT_BLUE);
        registerFilament(consumer, ModItems.FILAMENT_LIGHT_GRAY.get(), Tags.Items.DYES_LIGHT_GRAY);
        registerFilament(consumer, ModItems.FILAMENT_LIME.get(), Tags.Items.DYES_LIME);
        registerFilament(consumer, ModItems.FILAMENT_MAGENTA.get(), Tags.Items.DYES_MAGENTA);
        registerFilament(consumer, ModItems.FILAMENT_ORANGE.get(), Tags.Items.DYES_ORANGE);
        registerFilament(consumer, ModItems.FILAMENT_PINK.get(), Tags.Items.DYES_PINK);
        registerFilament(consumer, ModItems.FILAMENT_PURPLE.get(), Tags.Items.DYES_PURPLE);
        registerFilament(consumer, ModItems.FILAMENT_RED.get(), Tags.Items.DYES_RED);
        registerFilament(consumer, ModItems.FILAMENT_WHITE.get(), Tags.Items.DYES_WHITE);
        registerFilament(consumer, ModItems.FILAMENT_YELLOW.get(), Tags.Items.DYES_YELLOW);
    }

    private void registerFilament(Consumer<IFinishedRecipe> consumer, Item item, Tags.IOptionalNamedTag<Item> dyeReq) {
        ShapedRecipeBuilder.shapedRecipe(item)
                .patternLine("CDC")
                .patternLine("DSD")
                .patternLine("CDC")
                .key('C', Items.CLAY_BALL)
                .key('D', dyeReq)
                .key('S', Items.SUGAR_CANE)
                .setGroup(Reference.MOD_ID)
                .addCriterion("cobblestone", InventoryChangeTrigger.Instance.forItems(Blocks.COBBLESTONE))
                .build(consumer);
    }
}
