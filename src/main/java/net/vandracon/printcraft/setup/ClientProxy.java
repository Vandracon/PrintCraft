package net.vandracon.printcraft.setup;

import net.minecraft.world.World;

public class ClientProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() { // todo: room for improvement? unnecessary interface forcing?
        throw new IllegalStateException("Only run this on the client!");
    }
}
