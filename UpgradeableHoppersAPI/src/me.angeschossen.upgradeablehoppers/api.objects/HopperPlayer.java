package me.angeschossen.upgradeablehoppers.api.objects;

import me.angeschossen.upgradeablehoppers.database.objects.OfflineCoordinate;

import java.util.Collection;
import java.util.UUID;

public interface HopperPlayer {
    UUID getUID();

    Collection<OfflineCoordinate> getHoppers();

    void save();
}
