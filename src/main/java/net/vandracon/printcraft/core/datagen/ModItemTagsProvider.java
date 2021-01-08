package net.vandracon.printcraft.core.datagen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.Reference;
import net.vandracon.printcraft.core.registry.ModItems;
import net.vandracon.printcraft.core.registry.tags.ModBlockTags;
import net.vandracon.printcraft.core.registry.tags.ModItemTags;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(ModBlockTags.Blocks.STORAGE_BLOCKS_PRINTER, ModItemTags.Items.STORAGE_BLOCKS_PRINTER);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        getOrCreateBuilder(ModItemTags.Items.FILAMENT_BLACK).add(ModItems.FILAMENT_BLACK.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_RED).add(ModItems.FILAMENT_RED.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_GREEN).add(ModItems.FILAMENT_GREEN.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_BROWN).add(ModItems.FILAMENT_BROWN.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_BLUE).add(ModItems.FILAMENT_BLUE.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_PURPLE).add(ModItems.FILAMENT_PURPLE.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_CYAN).add(ModItems.FILAMENT_CYAN.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_LIGHT_GRAY).add(ModItems.FILAMENT_LIGHT_GRAY.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_GRAY).add(ModItems.FILAMENT_GRAY.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_PINK).add(ModItems.FILAMENT_PINK.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_LIME).add(ModItems.FILAMENT_LIME.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_YELLOW).add(ModItems.FILAMENT_YELLOW.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_LIGHT_BLUE).add(ModItems.FILAMENT_LIGHT_BLUE.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_MAGENTA).add(ModItems.FILAMENT_MAGENTA.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_ORANGE).add(ModItems.FILAMENT_ORANGE.get());
        getOrCreateBuilder(ModItemTags.Items.FILAMENT_WHITE).add(ModItems.FILAMENT_WHITE.get());
    }
}
