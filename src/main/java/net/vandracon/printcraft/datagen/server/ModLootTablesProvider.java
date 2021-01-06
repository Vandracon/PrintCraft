package net.vandracon.printcraft.datagen.server;

import net.minecraft.data.DataGenerator;
import net.vandracon.printcraft.registry.BlockRegistry;

public class ModLootTablesProvider extends BaseLootTableProvider {

    public ModLootTablesProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    public void addTables() {
        lootTables.put(BlockRegistry.GENERATOR.get(), createSimpleTable("generator", BlockRegistry.GENERATOR.get()));
        lootTables.put(BlockRegistry.PRINTER_3D.get(), createSimpleTable("printer_3d", BlockRegistry.PRINTER_3D.get()));
    }
}
