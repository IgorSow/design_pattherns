package com.sda.singleton.singletonExcample;

import java.util.LinkedList;

public class Queue {

    private static Queue instance ;

    public static Queue instanceOf() {
        if (instance == null){
            instance = new Queue();
        }
        return instance;
    }

    private LinkedList<String> linkedList = new LinkedList<>();

    private Queue(){

    }


    public void push(String massage){
        System.out.println("Receive massage");
        System.out.println("Current queue size: " + linkedList.size());
        linkedList.push(massage);
    }

    public String pop(){
        System.out.println("Receive consumed");
        System.out.println("Current queue size: " + linkedList.size());
        return linkedList.poll();
    }
}
