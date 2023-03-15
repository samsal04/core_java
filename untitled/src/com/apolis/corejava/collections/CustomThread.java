package com.apolis.corejava.collections;

import java.util.HashMap;
import java.util.Map;

// In the given example, one thread is trying to run the iteration while other thread is
// trying to modify the map. This will cause ConcurrentModificationException since we are using hashmap.
// If we change it to ConcurrentHashMap, there will be no exception since there is no lock on entire hashmap.

public class CustomThread extends Thread{

    static Map<Integer,String> map= new HashMap<>();

    public void run(){

        try {
            Thread.sleep(1000);
            map.put(103,"p");
        } catch (InterruptedException e) {

            System.out.println("Child Thread going to add element");
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(100,"A");
        map.put(101,"B");
        map.put(102,"C");

        CustomThread customThread= new CustomThread();
        customThread.start();

        for (Object o: map.entrySet()){

            Object s= o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }
}
