package net.vandracon.printcraft.datagen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.registry.BlockRegistry;
import net.vandracon.printcraft.registry.BlockTagRegistry;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, PrintCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(BlockTagRegistry.Blocks.STORAGE_BLOCKS_PRINTER_3D).add(BlockRegistry.PRINTER_3D.get());
        getOrCreateBuilder(BlockTagRegistry.Blocks.STORAGE_BLOCKS_GENERATOR).add(BlockRegistry.GENERATOR.get());
    }
}
