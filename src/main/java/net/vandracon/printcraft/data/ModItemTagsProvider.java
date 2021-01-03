package net.vandracon.printcraft.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.setup.ModTags;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, PrintCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(ModTags.Blocks.STORAGE_BLOCKS_PRINTER_3D, ModTags.Items.STORAGE_BLOCKS_PRINTER_3D);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
    }
}
