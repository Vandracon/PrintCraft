package net.vandracon.printcraft.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.vandracon.printcraft.PrintCraft;

public class ModItems {

    public static final RegistryObject<Item> FILAMENT_BLACK = Registration.ITEMS.register("filament_black", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_RED = Registration.ITEMS.register("filament_red", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_GREEN = Registration.ITEMS.register("filament_green", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_BROWN = Registration.ITEMS.register("filament_brown", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_BLUE = Registration.ITEMS.register("filament_blue", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_PURPLE = Registration.ITEMS.register("filament_purple", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_CYAN = Registration.ITEMS.register("filament_cyan", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_LIGHT_GRAY = Registration.ITEMS.register("filament_light_gray", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_GRAY = Registration.ITEMS.register("filament_gray", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_PINK = Registration.ITEMS.register("filament_pink", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_LIME = Registration.ITEMS.register("filament_lime", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_YELLOW = Registration.ITEMS.register("filament_yellow", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_LIGHT_BLUE = Registration.ITEMS.register("filament_light_blue", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_MAGENTA = Registration.ITEMS.register("filament_magenta", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_ORANGE = Registration.ITEMS.register("filament_orange", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    public static final RegistryObject<Item> FILAMENT_WHITE = Registration.ITEMS.register("filament_white", () ->
            new Item(new Item.Properties().group(PrintCraft.setup.itemGroup)));

    static void register() {}
}
