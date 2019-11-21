package me.angeschossen.upgradeablehoppers.api.objects;

public interface HopperChunk {
    boolean isHopper(int x, int y, int z);

    boolean isLoaded();

    boolean isChunkLoaded();

    boolean isBusy();

    Hopper getHopper(int x, int y, int z);

    int getX();

    int getZ();
}
