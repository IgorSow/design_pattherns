package com.sda.singletonExcample;

import com.sda.singleton.Queue;

public class Consumer implements Runnable {


    @Override
    public void run() {
        System.out.println(MyClock.instanceOf().getCurrentTimeAsString());
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("consumer " + Queue.instanceOf().pop());
        }
    }
}
