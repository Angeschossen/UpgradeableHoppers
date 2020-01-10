package me.angeschossen.upgradeablehoppers.api.enums;

public enum Setting {

    SUCTION_ENABLED(0), FILTER_DELETE(1), FILTER_BLACKLIST(2);

    private final int id;

    Setting(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Setting getById(int id) {
        for (Setting setting : values()) {
            if (setting.getId() == id) {
                return setting;
            }
        }

        throw new IllegalArgumentException("Enum constant does not exist with this id: " + id);
    }
}
