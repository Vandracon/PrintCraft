package net.vandracon.printcraft.core.registry;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.vandracon.printcraft.common.block.PrinterContainer;

public class ModContainers {

    public static final RegistryObject<ContainerType<PrinterContainer>> PRINTER_CONTAINER = ModRegistry.CONTAINERS.register("printer", () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntityWorld();
        return new PrinterContainer(windowId, world, pos, inv, inv.player);
    }));

    static void register() {}
}
