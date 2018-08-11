package com.sda.factory;

import com.sda.factory.model.BaseUnit;
import com.sda.factory.model.Level;

public class BaseUnitFactory {

    private Level level;
    private Integer multiplayer;

    public BaseUnitFactory(Level level) {
        this.level = level;
        this.multiplayer = level.getMultiplayer();
    }

    public BaseUnit createNewBaseUnit(String name) {
        BaseUnit unit = null;


        if ("Knight".equalsIgnoreCase(name)) {
            unit = new BaseUnit("Knight", 100, 10 * multiplayer, 10, null);

        } else if ("Archer".equalsIgnoreCase(name)) {
            unit = new BaseUnit("Archer", 50, 25* multiplayer, 5, null);

        } else if ("Superman".equalsIgnoreCase(name)) {
            unit = new BaseUnit("Superman", 70, 15 * multiplayer, 5, null);
        }
        return unit;
    }

    public BaseUnit createRangeUnit(String generation) {
        BaseUnit unit = null;
        if ("modern".equalsIgnoreCase(generation)) {
            unit = new BaseUnit("RifelMan", 150, 50, 20, null);
        } else if ("no-modern".equalsIgnoreCase(generation)) {
            unit = new BaseUnit("Archer", 50, 25, 5, null);
        }
        return unit;
    }
}
