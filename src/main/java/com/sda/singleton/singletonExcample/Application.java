package com.sda.singleton.singletonExcample;

public class Application {
    public static void main(String[] args) throws InterruptedException {

//        MyClock instance = MyClock.instanceOf();
//
//        System.out.println(instance.getCurrentTimeAsString());

        Thread consumerThread1 = new Thread(new Consumer());
        Thread consumerThread2 = new Thread(new Consumer());

        Thread procucerThread = new Thread(new Producer());
        Thread procucerThread2 = new Thread(new Producer());

        consumerThread1.start();
        Thread.sleep(1500);
        consumerThread2.start();
        Thread.sleep(1500);
        procucerThread.start();
        Thread.sleep(1500);
        procucerThread2.start();
        Thread.sleep(1500);

    }


}
