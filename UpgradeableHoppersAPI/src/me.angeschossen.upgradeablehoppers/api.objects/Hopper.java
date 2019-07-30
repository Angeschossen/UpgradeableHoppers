package me.angeschossen.upgradeablehoppers.api.objects;

import me.angeschossen.upgradeablehoppers.database.objects.Coordinate;
import me.angeschossen.upgradeablehoppers.database.objects.LinkD;
import org.bukkit.Location;
import org.bukkit.inventory.Inventory;

import java.util.Collection;
import java.util.UUID;

public interface Hopper {

    boolean canAction(UUID playerUUID, HopperAction action);

    void enableAction(HopperRole role, HopperAction action);

    void disableAction(HopperRole role, HopperAction action);

    boolean toggleAction(HopperRole role, HopperAction action);

    int getTransferAmount();

    void setTransferAmount(int amount);

    int getSuctionRadius();

    int getLinksAmount();

    void setLinksAmount(int maxlinks);

    void setSuctionRadius(int radius);

    void addDestination(Inventory destination);

    boolean removeDestination(Location location);

    Collection<LinkD> getDestinations();

    Coordinate getCoordinate();

    Location getLocation();

    boolean load();

    void delete();

    void unload();

    int getID();

    UUID getOwner();

    Collection<UUID> getPlayers();
}
