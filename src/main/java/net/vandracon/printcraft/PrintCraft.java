package net.vandracon.printcraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.vandracon.printcraft.setup.Registration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PrintCraft.MOD_ID)
public class PrintCraft {
    public static final String MOD_ID = "printcraft";

    private static final Logger LOGGER = LogManager.getLogger();

    public PrintCraft() {
        Registration.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
