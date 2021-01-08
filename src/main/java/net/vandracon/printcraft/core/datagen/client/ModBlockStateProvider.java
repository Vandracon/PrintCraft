package net.vandracon.printcraft.core.datagen.client;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.Reference;
import net.vandracon.printcraft.core.registry.ModBlocks;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Reference.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        simpleBlock(BlockRegistry.PRINTER_BLOCK.get());
        registerPrinterBlock();
        makeBlockItemFromExistingModel(ModBlocks.PRINTER_BLOCK.get());
    }

    private void registerPrinterBlock() {
        ResourceLocation txt = new ResourceLocation(Reference.MOD_ID, "block/printer");
        BlockModelBuilder model = models().cube("printer", txt, txt, new ResourceLocation(Reference.MOD_ID, "block/printer_front"), txt, txt, txt);
        BlockModelBuilder modelPrinterPowered = models().cube("printer_powered", txt, txt, new ResourceLocation(Reference.MOD_ID, "block/printer_powered"), txt, txt, txt);
        orientedBlock(ModBlocks.PRINTER_BLOCK.get(), state -> {
            if (state.get(BlockStateProperties.POWERED)) {
                return modelPrinterPowered;
            } else {
                return model;
            }
        });
    }

    private void orientedBlock(Block block, Function<BlockState, ModelFile> modelFunc) {
        getVariantBuilder(block)
                .forAllStates(state -> {
                    Direction dir = state.get(BlockStateProperties.FACING);
                    return ConfiguredModel.builder()
                            .modelFile(modelFunc.apply(state))
                            .rotationX(dir.getAxis() == Direction.Axis.Y ?  dir.getAxisDirection().getOffset() * -90 : 0)
                            .rotationY(dir.getAxis() != Direction.Axis.Y ? ((dir.getHorizontalIndex() + 2) % 4) * 90 : 0)
                            .build();
                });
    }

    private void makeBlockItemFromExistingModel(Block block)
    {
        final ModelFile model = models().getExistingFile(block.getRegistryName());
        simpleBlockItem(block, model);
    }
}
