package net.vandracon.printcraft.datagen.client;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.registry.BlockRegistry;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, PrintCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockRegistry.PRINTER_3D.get());
        makeBlockItemFromExistingModel(BlockRegistry.PRINTER_3D.get());

        simpleBlock(BlockRegistry.GENERATOR.get());
        makeBlockItemFromExistingModel(BlockRegistry.GENERATOR.get());
    }

    private void makeBlockItemFromExistingModel(Block block)
    {
        final ModelFile model = models().getExistingFile(block.getRegistryName());
        simpleBlockItem(block, model);
    }
}
