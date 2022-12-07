package com.apolis.corejava.multithreadding;

public class MultiThreadingDemo0 {
    public static void main(String[] args) {

        for (int i=0;i<3;i++){

            MultiThreadingWithThread thread1= new MultiThreadingWithThread();
            thread1.run();
           Thread thread2= new Thread(new MultiThreadingRunnable());
           thread2.start();
        }

    }
}

class MultiThreadingWithThread extends  Thread{

    @Override
    public void run() {
        try{
            System.out.println("Thread is running "+ Thread.currentThread().threadId());
        }catch(Exception e){
            System.out.println("Exception was caught");
        }
    }
}

class MulthiThreadingWithRunnable implements Runnable{


    @Override
    public void run() {
        try {
            System.out.println("The thread is running " + Thread.currentThread().threadId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}