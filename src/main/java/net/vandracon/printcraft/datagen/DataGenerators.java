package net.vandracon.printcraft.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.datagen.client.ModBlockStateProvider;
import net.vandracon.printcraft.datagen.client.ModItemModelProvider;
import net.vandracon.printcraft.datagen.server.ModLootTablesProvider;
import net.vandracon.printcraft.datagen.server.ModRecipesProvider;

@Mod.EventBusSubscriber(modid = PrintCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            gen.addProvider(new ModRecipesProvider(gen));
            gen.addProvider(new ModLootTablesProvider(gen));

            ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
            gen.addProvider(blockTags);
            gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));
        }
        if (event.includeClient()) {
            gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
            gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
        }
    }
}