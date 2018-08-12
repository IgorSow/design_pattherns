package com.sda.singleton.singletonExcample;

import com.sda.singleton.Queue;

public class Producer implements Runnable {


    @Override
    public void run() {
        System.out.println(MyClock.instanceOf().getCurrentTimeAsString());
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Queue.instanceOf().push("TEST");
        }

    }
}
