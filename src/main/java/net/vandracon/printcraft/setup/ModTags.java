package net.vandracon.printcraft.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.vandracon.printcraft.PrintCraft;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_PRINTER_3D = forge("storage_blocks/printer_3d");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(PrintCraft.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_PRINTER_3D = forge("storage_blocks/printer_3d");

        public static final ITag.INamedTag<Item> FILAMENT_BLACK = forge("ingots/filament_black");
        public static final ITag.INamedTag<Item> FILAMENT_RED = forge("ingots/filament_red");
        public static final ITag.INamedTag<Item> FILAMENT_GREEN = forge("ingots/filament_green");
        public static final ITag.INamedTag<Item> FILAMENT_BROWN = forge("ingots/filament_brown");
        public static final ITag.INamedTag<Item> FILAMENT_BLUE = forge("ingots/filament_blue");
        public static final ITag.INamedTag<Item> FILAMENT_PURPLE = forge("ingots/filament_purple");
        public static final ITag.INamedTag<Item> FILAMENT_CYAN = forge("ingots/filament_cyan");
        public static final ITag.INamedTag<Item> FILAMENT_LIGHT_GRAY = forge("ingots/filament_light_gray");
        public static final ITag.INamedTag<Item> FILAMENT_GRAY = forge("ingots/filament_gray");
        public static final ITag.INamedTag<Item> FILAMENT_PINK = forge("ingots/filament_pink");
        public static final ITag.INamedTag<Item> FILAMENT_LIME = forge("ingots/filament_lime");
        public static final ITag.INamedTag<Item> FILAMENT_YELLOW = forge("ingots/filament_yellow");
        public static final ITag.INamedTag<Item> FILAMENT_LIGHT_BLUE = forge("ingots/filament_light_blue");
        public static final ITag.INamedTag<Item> FILAMENT_MAGENTA = forge("ingots/filament_magenta");
        public static final ITag.INamedTag<Item> FILAMENT_ORANGE = forge("ingots/filament_orange");
        public static final ITag.INamedTag<Item> FILAMENT_WHITE = forge("ingots/filament_white");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(PrintCraft.MOD_ID, path).toString());
        }
    }
}
