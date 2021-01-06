package net.vandracon.printcraft.client;

import net.minecraft.world.World;
import net.vandracon.printcraft.core.interfaces.IProxy;

public class ClientProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() { // todo: room for improvement? unnecessary interface forcing?
        throw new IllegalStateException("Only run this on the client!");
    }
}
