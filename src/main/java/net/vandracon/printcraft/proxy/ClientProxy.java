package net.vandracon.printcraft.proxy;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.vandracon.printcraft.common.block.PrinterScreen;
import net.vandracon.printcraft.core.registry.ModContainers;

public class ClientProxy extends CommonProxy {

    @Override
    public void onSetupClient(FMLClientSetupEvent event) {
        super.onSetupClient(event);

        ScreenManager.registerFactory(ModContainers.PRINTER_CONTAINER.get(), PrinterScreen::new);
    }
}
