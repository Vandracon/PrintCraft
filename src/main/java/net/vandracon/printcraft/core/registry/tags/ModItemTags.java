package net.vandracon.printcraft.core.registry.tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.vandracon.printcraft.Reference;

public class ModItemTags {
    public static final class Items {
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_PRINTER = forge("storage_blocks/printer");

        public static final ITag.INamedTag<Item> FILAMENT_BLACK = mod("filament/filament_black");
        public static final ITag.INamedTag<Item> FILAMENT_RED = mod("filament/filament_red");
        public static final ITag.INamedTag<Item> FILAMENT_GREEN = mod("filament/filament_green");
        public static final ITag.INamedTag<Item> FILAMENT_BROWN = mod("filament/filament_brown");
        public static final ITag.INamedTag<Item> FILAMENT_BLUE = mod("filament/filament_blue");
        public static final ITag.INamedTag<Item> FILAMENT_PURPLE = mod("filament/filament_purple");
        public static final ITag.INamedTag<Item> FILAMENT_CYAN = mod("filament/filament_cyan");
        public static final ITag.INamedTag<Item> FILAMENT_LIGHT_GRAY = mod("filament/filament_light_gray");
        public static final ITag.INamedTag<Item> FILAMENT_GRAY = mod("filament/filament_gray");
        public static final ITag.INamedTag<Item> FILAMENT_PINK = mod("filament/filament_pink");
        public static final ITag.INamedTag<Item> FILAMENT_LIME = mod("filament/filament_lime");
        public static final ITag.INamedTag<Item> FILAMENT_YELLOW = mod("filament/filament_yellow");
        public static final ITag.INamedTag<Item> FILAMENT_LIGHT_BLUE = mod("filament/filament_light_blue");
        public static final ITag.INamedTag<Item> FILAMENT_MAGENTA = mod("filament/filament_magenta");
        public static final ITag.INamedTag<Item> FILAMENT_ORANGE = mod("filament/filament_orange");
        public static final ITag.INamedTag<Item> FILAMENT_WHITE = mod("filament/filament_white");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(Reference.MOD_ID, path).toString());
        }
    }
}
