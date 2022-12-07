package com.apolis.javapractice;

public class ThreadSequence {
    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" This is thread 1");
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" This is thread 2");
            }
        });
        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" This is thread 3");
            }
        });

        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        t2.start();
        try{
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try{
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
