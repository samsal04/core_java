package com.apolis.corejava.multithreadding;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) {

        Task task=new Task("Important message");

        ExecutorService executorService= Executors.newFixedThreadPool(4);
        Future<String> result= executorService.submit(task);

        try {
            System.out.println(result.get());
        }catch (InterruptedException| ExecutionException e){
            e.printStackTrace();
        }
        executorService.shutdown();

    }
}


class Task implements Callable<String>{

    private final String message;

    public Task(String message){
        this.message=message;
    }


    @Override
    public String call() throws Exception {
        return "Retuning the "+message;
    }
}