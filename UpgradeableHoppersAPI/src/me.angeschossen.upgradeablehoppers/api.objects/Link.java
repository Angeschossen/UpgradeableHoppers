package me.angeschossen.upgradeablehoppers.api.objects;

import org.bukkit.Material;

public interface Link {
    Coordinate getCoordinate();

    Material getType();

    int getID();

    void setID(int iD);
}
