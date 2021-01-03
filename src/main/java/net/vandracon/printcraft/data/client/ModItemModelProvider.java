package net.vandracon.printcraft.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vandracon.printcraft.PrintCraft;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, PrintCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("printer_3d", modLoc("block/printer_3d"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

//      builder(itemGenerated, "printer_3d");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
