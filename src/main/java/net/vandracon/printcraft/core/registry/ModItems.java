package net.vandracon.printcraft.core.registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.vandracon.printcraft.PrintCraft;

public class ModItems {

    public static final RegistryObject<Item> FILAMENT_BLACK = ModRegistry.ITEMS.register("filament_black", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_RED = ModRegistry.ITEMS.register("filament_red", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_GREEN = ModRegistry.ITEMS.register("filament_green", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_BROWN = ModRegistry.ITEMS.register("filament_brown", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_BLUE = ModRegistry.ITEMS.register("filament_blue", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_PURPLE = ModRegistry.ITEMS.register("filament_purple", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_CYAN = ModRegistry.ITEMS.register("filament_cyan", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_LIGHT_GRAY = ModRegistry.ITEMS.register("filament_light_gray", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_GRAY = ModRegistry.ITEMS.register("filament_gray", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_PINK = ModRegistry.ITEMS.register("filament_pink", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_LIME = ModRegistry.ITEMS.register("filament_lime", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_YELLOW = ModRegistry.ITEMS.register("filament_yellow", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_LIGHT_BLUE = ModRegistry.ITEMS.register("filament_light_blue", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_MAGENTA = ModRegistry.ITEMS.register("filament_magenta", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_ORANGE = ModRegistry.ITEMS.register("filament_orange", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    public static final RegistryObject<Item> FILAMENT_WHITE = ModRegistry.ITEMS.register("filament_white", () ->
            new Item(new Item.Properties().group(PrintCraft.GROUP)));

    static void register() {}
}
