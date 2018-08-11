package com.sda.factory.model;

public enum Level {

    NORMAL(1),
    NIGHTMARE(5),
    HELL(15);

    private Integer multiplayer;

    Level(Integer multiplayer) {
        this.multiplayer = multiplayer;
    }

    public Integer getMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(Integer multiplayer) {
        this.multiplayer = multiplayer;
    }
}
