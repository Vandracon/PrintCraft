package net.vandracon.printcraft.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> PRINTER_3D = register("printer_3d", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestLevel(2).sound(SoundType.STONE)));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Item.Properties properties = new Item.Properties().group(ModSetup.itemGroup);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), properties));
        return ret;
    }
}
