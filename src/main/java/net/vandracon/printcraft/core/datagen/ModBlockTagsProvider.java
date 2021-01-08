package net.vandracon.printcraft.core.datagen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.Reference;
import net.vandracon.printcraft.core.registry.ModBlocks;
import net.vandracon.printcraft.core.registry.tags.ModBlockTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModBlockTags.Blocks.STORAGE_BLOCKS_PRINTER).add(ModBlocks.PRINTER_BLOCK.get());
    }
}
