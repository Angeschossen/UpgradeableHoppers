package me.angeschossen.upgradeablehoppers.api.objects;

import me.angeschossen.upgradeablehoppers.api.enums.Action;

import java.util.Collection;
import java.util.UUID;

public interface HopperPlayer {
    Action getPendingAction();

    UUID getUID();

    Collection<OfflineCoordinate> getHoppers();

    void save();
}
