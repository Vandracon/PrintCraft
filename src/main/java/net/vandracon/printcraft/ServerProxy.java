package net.vandracon.printcraft;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.vandracon.printcraft.core.interfaces.IProxy;

public class ServerProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
