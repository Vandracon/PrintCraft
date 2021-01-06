package net.vandracon.printcraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.vandracon.printcraft.registry.ModRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PrintCraft.MOD_ID)
public class PrintCraft {
    public static final String MOD_ID = "printcraft";
    private static final Logger LOGGER = LogManager.getLogger();

    public PrintCraft() {
        ModRegistry.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event) {}
}
