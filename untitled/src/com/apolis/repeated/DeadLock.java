package com.apolis.repeated;

public class DeadLock {
    public static void main(String[] args) {
        final  String resource1= " resource 1";
        final  String resource2= " resource 2";

        Thread t1= new Thread(){

            public void run(){
                synchronized (resource1){
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(" Error ");
                    }
                }
                synchronized (resource2){
                    System.out.println("Thread 2: locked resource 2");
                }
            }
        };

        Thread t2= new Thread(){

            public void run(){
                synchronized (resource2){

                    System.out.println("Thread 2: locked resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(" Error ");
                    }
                }
                synchronized (resource1){
                    System.out.println("Thread 1: locked resource 1");
                }
            }
        };
        t1.start();
        t2.start();

    }
}
