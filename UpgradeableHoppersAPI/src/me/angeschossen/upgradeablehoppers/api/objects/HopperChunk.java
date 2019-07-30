package me.angeschossen.upgradeablehoppers.api.objects;

public interface HopperChunk {
    boolean isHopper(int x, int y, int z);

    void load();

    void save();

    void unload();

    Hopper getHopper(int x, int y, int z);

    int getX();

    int getZ();
}
