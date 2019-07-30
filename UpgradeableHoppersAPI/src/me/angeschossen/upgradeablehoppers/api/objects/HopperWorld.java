package me.angeschossen.upgradeablehoppers.api.objects;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.UUID;

public interface HopperWorld {
    World getWorld();

    String getName();

    UUID getUID();

    Hopper getHopper(int x, int y, int z);

    Hopper getHopper(Location location);

    boolean isHopper(Location location);
}
