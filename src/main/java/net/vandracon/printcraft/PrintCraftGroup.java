package net.vandracon.printcraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.vandracon.printcraft.core.registry.ModBlocks;

public class PrintCraftGroup extends ItemGroup {

    public PrintCraftGroup(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.PRINTER_BLOCK.get());
    }
}