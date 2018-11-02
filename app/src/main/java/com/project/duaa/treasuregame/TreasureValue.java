package com.project.duaa.treasuregame;

public class TreasureValue {
    private String name;
    private int imageResourceId;
    private int health;
    private String level;

    public static final TreasureValue[] treasuress = {
            new TreasureValue("David", R.drawable.daivd, 100, "simple"),
            new TreasureValue("Grege", R.drawable.greg,200,"master")
    };

    private TreasureValue(String name, int imageResourceId, int health,String level) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.health=health;
        this.level=level;
    }
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

}
