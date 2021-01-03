package net.vandracon.printcraft.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.setup.ModBlocks;
import net.vandracon.printcraft.setup.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, PrintCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_PRINTER_3D).add(ModBlocks.PRINTER_3D.get());
    }
}
