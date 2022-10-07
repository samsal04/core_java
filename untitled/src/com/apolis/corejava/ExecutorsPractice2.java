package com.apolis.corejava;

import java.util.concurrent.*;

public class ExecutorsPractice2 {
    public static void main(String[] args) {

        Practice practice=new Practice(" When would i get an answer for the question ?");

        ExecutorService executorService= Executors.newFixedThreadPool(5);
        Future<String> result= executorService.submit(practice);

        try {
            System.out.println(result.get());
        }catch (ExecutionException| InterruptedException e){
            e.printStackTrace();
        }

        executorService.shutdown();

    }
}


class Practice implements Callable<String>{

    String questions;

    public  Practice(String questions){
        this.questions=questions;
    }


    @Override
    public String call() throws Exception {
        return "The given questions are : "+ questions;
    }
}