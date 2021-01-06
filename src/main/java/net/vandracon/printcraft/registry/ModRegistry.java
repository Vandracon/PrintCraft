package net.vandracon.printcraft.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.registry.BlockRegistry;
import net.vandracon.printcraft.registry.ItemRegistry;

public class ModRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PrintCraft.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PrintCraft.MOD_ID);

    public static ItemGroup itemGroup = new ItemGroup(PrintCraft.MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockRegistry.PRINTER_3D.get());
        }
    };

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        BlockRegistry.register();
        ItemRegistry.register();
    }
}
