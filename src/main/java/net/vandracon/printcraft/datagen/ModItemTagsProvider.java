package net.vandracon.printcraft.datagen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.registry.ItemRegistry;
import net.vandracon.printcraft.registry.BlockTagRegistry;
import net.vandracon.printcraft.registry.ItemTagRegistry;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, PrintCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(BlockTagRegistry.Blocks.STORAGE_BLOCKS_PRINTER_3D, ItemTagRegistry.Items.STORAGE_BLOCKS_PRINTER_3D);
        copy(BlockTagRegistry.Blocks.STORAGE_BLOCKS_GENERATOR, ItemTagRegistry.Items.STORAGE_BLOCKS_GENERATOR);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_BLACK).add(ItemRegistry.FILAMENT_BLACK.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_RED).add(ItemRegistry.FILAMENT_RED.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_GREEN).add(ItemRegistry.FILAMENT_GREEN.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_BROWN).add(ItemRegistry.FILAMENT_BROWN.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_BLUE).add(ItemRegistry.FILAMENT_BLUE.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_PURPLE).add(ItemRegistry.FILAMENT_PURPLE.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_CYAN).add(ItemRegistry.FILAMENT_CYAN.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_LIGHT_GRAY).add(ItemRegistry.FILAMENT_LIGHT_GRAY.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_GRAY).add(ItemRegistry.FILAMENT_GRAY.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_PINK).add(ItemRegistry.FILAMENT_PINK.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_LIME).add(ItemRegistry.FILAMENT_LIME.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_YELLOW).add(ItemRegistry.FILAMENT_YELLOW.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_LIGHT_BLUE).add(ItemRegistry.FILAMENT_LIGHT_BLUE.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_MAGENTA).add(ItemRegistry.FILAMENT_MAGENTA.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_ORANGE).add(ItemRegistry.FILAMENT_ORANGE.get());
        getOrCreateBuilder(ItemTagRegistry.Items.FILAMENT_WHITE).add(ItemRegistry.FILAMENT_WHITE.get());
    }
}
