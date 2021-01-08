package net.vandracon.printcraft.core.registry;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.vandracon.printcraft.common.block.PrinterTile;

public class ModTileEntities {

    public static final RegistryObject<TileEntityType<PrinterTile>> PRINTER_TILE = ModRegistry.TILES.register("printer",
            () -> TileEntityType.Builder.create(PrinterTile::new, ModBlocks.PRINTER_BLOCK.get()).build(null));

    static void register() {}
}
