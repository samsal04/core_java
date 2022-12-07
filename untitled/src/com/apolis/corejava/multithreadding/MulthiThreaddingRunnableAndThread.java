package com.apolis.corejava.multithreadding;

public class MulthiThreaddingRunnableAndThread {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            MulthiThreading multhiThreading = new MulthiThreading();
            multhiThreading.run();

            Thread multiThreadingWithRunnable= new Thread(new MultiThreadingRunnable());
            multiThreadingWithRunnable.start();
        }
    }
}

class MulthiThreading extends Thread {
    public void run() {
        try {
            System.out.println("Current Thread is " + Thread.currentThread().threadId() + " is running");
        } catch (Exception e) {
            System.out.println("There was an exception.");
        }
    }
}
class MultiThreadingRunnable implements  Runnable{
    @Override
    public void run() {
        try {
            System.out.println("The thread is running "+ Thread.currentThread().threadId());
        }catch (Exception e){
            System.out.println("Exception is caught.");
        }
    }
}