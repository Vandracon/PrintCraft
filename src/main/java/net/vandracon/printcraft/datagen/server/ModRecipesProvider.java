package net.vandracon.printcraft.datagen.server;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.registry.BlockRegistry;
import net.vandracon.printcraft.registry.ItemRegistry;

import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider {
    public ModRecipesProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(BlockRegistry.PRINTER_3D.get())
                .patternLine("III")
                .patternLine("# #")
                .patternLine("III")
                .key('I', Tags.Items.INGOTS_IRON)
                .key('#', Tags.Items.DUSTS_REDSTONE)
                .setGroup(PrintCraft.MOD_ID)
                .addCriterion("cobblestone", InventoryChangeTrigger.Instance.forItems(Blocks.COBBLESTONE))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(BlockRegistry.GENERATOR.get())
                .patternLine("III")
                .patternLine("# #")
                .patternLine("III")
                .key('I', Tags.Items.INGOTS_IRON)
                .key('#', Tags.Items.DUSTS_GLOWSTONE)
                .setGroup(PrintCraft.MOD_ID)
                .addCriterion("cobblestone", InventoryChangeTrigger.Instance.forItems(Blocks.COBBLESTONE))
                .build(consumer);

        registerFilament(consumer, ItemRegistry.FILAMENT_BLACK.get(), Tags.Items.DYES_BLACK);
        registerFilament(consumer, ItemRegistry.FILAMENT_BLUE.get(), Tags.Items.DYES_BLUE);
        registerFilament(consumer, ItemRegistry.FILAMENT_BROWN.get(), Tags.Items.DYES_BROWN);
        registerFilament(consumer, ItemRegistry.FILAMENT_CYAN.get(), Tags.Items.DYES_CYAN);
        registerFilament(consumer, ItemRegistry.FILAMENT_GRAY.get(), Tags.Items.DYES_GRAY);
        registerFilament(consumer, ItemRegistry.FILAMENT_GREEN.get(), Tags.Items.DYES_GREEN);
        registerFilament(consumer, ItemRegistry.FILAMENT_LIGHT_BLUE.get(), Tags.Items.DYES_LIGHT_BLUE);
        registerFilament(consumer, ItemRegistry.FILAMENT_LIGHT_GRAY.get(), Tags.Items.DYES_LIGHT_GRAY);
        registerFilament(consumer, ItemRegistry.FILAMENT_LIME.get(), Tags.Items.DYES_LIME);
        registerFilament(consumer, ItemRegistry.FILAMENT_MAGENTA.get(), Tags.Items.DYES_MAGENTA);
        registerFilament(consumer, ItemRegistry.FILAMENT_ORANGE.get(), Tags.Items.DYES_ORANGE);
        registerFilament(consumer, ItemRegistry.FILAMENT_PINK.get(), Tags.Items.DYES_PINK);
        registerFilament(consumer, ItemRegistry.FILAMENT_PURPLE.get(), Tags.Items.DYES_PURPLE);
        registerFilament(consumer, ItemRegistry.FILAMENT_RED.get(), Tags.Items.DYES_RED);
        registerFilament(consumer, ItemRegistry.FILAMENT_WHITE.get(), Tags.Items.DYES_WHITE);
        registerFilament(consumer, ItemRegistry.FILAMENT_YELLOW.get(), Tags.Items.DYES_YELLOW);
    }

    private void registerFilament(Consumer<IFinishedRecipe> consumer, Item item, Tags.IOptionalNamedTag<Item> dyeReq) {
        ShapedRecipeBuilder.shapedRecipe(item)
                .patternLine("CDC")
                .patternLine("DSD")
                .patternLine("CDC")
                .key('C', Items.CLAY_BALL)
                .key('D', dyeReq)
                .key('S', Items.SUGAR_CANE)
                .setGroup(PrintCraft.MOD_ID)
                .addCriterion("cobblestone", InventoryChangeTrigger.Instance.forItems(Blocks.COBBLESTONE))
                .build(consumer);
    }
}
