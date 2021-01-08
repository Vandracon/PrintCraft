package net.vandracon.printcraft.core.datagen.server;

import net.minecraft.data.DataGenerator;
import net.vandracon.printcraft.core.registry.ModBlocks;

public class ModLootTablesProvider extends BaseLootTableProvider {

    public ModLootTablesProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    public void addTables() {
        lootTables.put(ModBlocks.PRINTER_BLOCK.get(), createSimpleTable("printer", ModBlocks.PRINTER_BLOCK.get()));
    }
}
