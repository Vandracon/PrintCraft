package net.vandracon.printcraft.core.registry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.common.block.PrinterBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<PrinterBlock> PRINTER_BLOCK = register("printer", PrinterBlock::new);

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return ModRegistry.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Item.Properties properties = new Item.Properties().group(PrintCraft.GROUP);
        ModRegistry.ITEMS.register(name, () -> new BlockItem(ret.get(), properties));
        return ret;
    }
}
