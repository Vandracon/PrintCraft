package net.vandracon.printcraft.core.datagen.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.Reference;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "filament_black");
        builder(itemGenerated, "filament_blue");
        builder(itemGenerated, "filament_brown");
        builder(itemGenerated, "filament_cyan");
        builder(itemGenerated, "filament_gray");
        builder(itemGenerated, "filament_green");
        builder(itemGenerated, "filament_light_blue");
        builder(itemGenerated, "filament_light_gray");
        builder(itemGenerated, "filament_lime");
        builder(itemGenerated, "filament_magenta");
        builder(itemGenerated, "filament_orange");
        builder(itemGenerated, "filament_pink");
        builder(itemGenerated, "filament_purple");
        builder(itemGenerated, "filament_red");
        builder(itemGenerated, "filament_white");
        builder(itemGenerated, "filament_yellow");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
