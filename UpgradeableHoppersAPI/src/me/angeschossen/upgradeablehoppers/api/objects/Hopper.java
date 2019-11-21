package me.angeschossen.upgradeablehoppers.api.objects;

import me.angeschossen.upgradeablehoppers.api.enums.Status;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public interface Hopper {

    int getFreeSpace();

    int getMaxLinkDistance();

    boolean hasLinks();

    Collection<Material> getFilter();

    boolean addFilterItem(Material material);

    boolean removeFilterItem(Material material);

    boolean toggleFilterMode();

    Inventory getUpperContainer();

    boolean toggleSuction();

    boolean canTransfer(Material material);

    Inventory getInventory();

    boolean canAction(UUID playerUUID, HopperAction action);

    boolean canAction(Player player, HopperAction action);

    void enableAction(HopperRole role, HopperAction action);

    void disableAction(HopperRole role, HopperAction action);

    boolean toggleAction(HopperRole role, HopperAction action);

    int getTransferAmount();

    void setTransferAmount(int amount);

    int getSuctionRadius();

    int getLinksAmount();

    void setLinksAmount(int maxlinks);

    void setMaxLinkDistance(int maxLinkDistance);

    void setSuctionRadius(int radius);

    boolean addDestination(Inventory destination, Player player);

    boolean removeDestination(String worldName, int x, int y, int z);

    @Nullable
    HashMap<Integer, ItemStack> addItem(ItemStack itemStack);

    Status getStatus();

    @Nullable
    HashMap<Integer, ItemStack> removeItem(ItemStack itemStack);

    Coordinate getCoordinate();

    Location getLocation();

    Link getVanillaLink();

    boolean isBusy();

    boolean isChunkLoaded();

    boolean isLoaded();

    int getID();

    UUID getOwner();

    Collection<UUID> getPlayers();
}
