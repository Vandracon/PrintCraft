package net.vandracon.printcraft.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
