package com.sda.singleton.singletonExcample;

import java.time.Instant;

public class MyClock {
    private static MyClock instance = new MyClock();

    public static MyClock instanceOf(){
        return instance;
    }

    public String getCurrentTimeAsString (){
        return String.valueOf(Instant.now());

    }
}
