package net.vandracon.printcraft.core.interfaces;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
