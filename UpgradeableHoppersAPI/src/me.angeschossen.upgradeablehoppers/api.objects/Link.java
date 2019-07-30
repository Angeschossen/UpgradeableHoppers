package me.angeschossen.upgradeablehoppers.api.objects;

import me.angeschossen.upgradeablehoppers.database.objects.Coordinate;
import org.bukkit.Material;

public interface Link {
    Coordinate getCoordinate();

    Material getType();
}
