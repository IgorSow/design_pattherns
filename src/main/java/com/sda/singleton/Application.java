package com.sda.singleton;

public class Application {

    public static void main(String[] args) {

        Thread consumerThread1 = new Thread(new Consumer());
        Thread consumerThread2 = new Thread(new Consumer());

        Thread procucerThread = new Thread(new Producer());
        Thread procucerThread2 = new Thread(new Producer());

        consumerThread1.start();
        consumerThread2.start();

        procucerThread.start();
        procucerThread2.start();
    }
}
