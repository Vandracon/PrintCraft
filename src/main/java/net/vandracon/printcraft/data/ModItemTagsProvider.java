package net.vandracon.printcraft.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.setup.ModItems;
import net.vandracon.printcraft.setup.ModTags;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, PrintCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(ModTags.Blocks.STORAGE_BLOCKS_PRINTER_3D, ModTags.Items.STORAGE_BLOCKS_PRINTER_3D);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        getOrCreateBuilder(ModTags.Items.FILAMENT_BLACK).add(ModItems.FILAMENT_BLACK.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_RED).add(ModItems.FILAMENT_RED.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_GREEN).add(ModItems.FILAMENT_GREEN.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_BROWN).add(ModItems.FILAMENT_BROWN.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_BLUE).add(ModItems.FILAMENT_BLUE.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_PURPLE).add(ModItems.FILAMENT_PURPLE.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_CYAN).add(ModItems.FILAMENT_CYAN.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_LIGHT_GRAY).add(ModItems.FILAMENT_LIGHT_GRAY.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_GRAY).add(ModItems.FILAMENT_GRAY.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_PINK).add(ModItems.FILAMENT_PINK.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_LIME).add(ModItems.FILAMENT_LIME.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_YELLOW).add(ModItems.FILAMENT_YELLOW.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_LIGHT_BLUE).add(ModItems.FILAMENT_LIGHT_BLUE.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_MAGENTA).add(ModItems.FILAMENT_MAGENTA.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_ORANGE).add(ModItems.FILAMENT_ORANGE.get());
        getOrCreateBuilder(ModTags.Items.FILAMENT_WHITE).add(ModItems.FILAMENT_WHITE.get());

//        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.FILAMENT);
    }
}
