package me.angeschossen.upgradeablehoppers.api.objects;

import me.angeschossen.upgradeablehoppers.api.enums.Status;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.HashMap;

public interface Link {
    boolean isBusy();

    boolean exists();

    @Nullable
    HashMap<Integer, ItemStack> addItem(ItemStack itemStack) throws NullPointerException;

    @Nullable
    HashMap<Integer, ItemStack> removeItem(ItemStack itemStack);

    Inventory getDestination();

    boolean isLoaded();

    boolean canTransfer(Material material);

    Coordinate getCoordinate();

    Material getType();

    int getID();

    Status getStatus();
}
