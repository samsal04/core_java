package com.apolis.corejava.multithreadding;

import java.util.concurrent.*;

public class ExecutorsPractice {
    public static void main(String[] args) {

        Exercise exercise= new Exercise("Jogging");
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        Future<String> result=executorService.submit(exercise);

        try {
            System.out.println(result.get());
        }catch (InterruptedException|ExecutionException e){
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}


class Exercise implements Callable<String>{

    String ExerciseType;

    public  Exercise(String ExerciseType){

        this.ExerciseType=ExerciseType;

    }


    @Override
    public String call() throws Exception {
        return "The Exercise you are doing is: "+ ExerciseType;
    }
}