package net.vandracon.printcraft.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.vandracon.printcraft.PrintCraft;

public class ModSetup {

    public static ItemGroup itemGroup = new ItemGroup(PrintCraft.MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.PRINTER_3D.get());
        }
    };

    public void init() {}
}
