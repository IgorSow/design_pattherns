package com.sda.singletonExcample;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class MyClock {
    private static MyClock instance = new MyClock();

    public static MyClock instanceOf(){
        return instance;
    }

    public String getCurrentTimeAsString (){
        return String.valueOf(Instant.now());

    }
}
