package com.apolis.corejava.cloning;

import java.util.Collections;
import java.util.LinkedList;

public class PollutionCodilityPractice2 {
    public static void main(String...args){
        int[] westFactories1 = {5, 19, 8, 1}; // 3
        int[] westFactories2 = {10,10};     // 2
        int[] westFactories3 = {3, 0, 5};   // 2
        int[] westFactories = {0, 0, 0};   // 0
        System.out.println("Filters: " + recommendedFilters(westFactories1));
        System.out.println("Filters: " + recommendedFilters(westFactories2));
        System.out.println("Filters: " + recommendedFilters(westFactories3));
        System.out.println("Filters: " + recommendedFilters(westFactories));
        int[] arr = {};
        System.out.println("Filters: " + recommendedFilters(arr)); //0
    }

    private static Integer recommendedFilters(int[] factories) {
        LinkedList<Double> pollutionOf = new LinkedList<>();
        for(int i = 0; i < factories.length; i++){
            pollutionOf.add((double) factories[i]);
        }

        Double currentRunSumPollution = pollutionOf.stream().mapToDouble(i -> i).sum();
        Double goalRunSumPollution = pollutionOf.stream().mapToDouble(i -> i).sum() * 0.50f;
        int filters = 0;
        int indexOf = 0;
        double mostPolluted = 0;
        while(currentRunSumPollution > goalRunSumPollution){

            mostPolluted = Collections.max(pollutionOf); // O(N);
            indexOf = pollutionOf.indexOf(mostPolluted);
            filters++;
            pollutionOf.set(indexOf, mostPolluted * 0.50f);
            currentRunSumPollution = pollutionOf.stream().mapToDouble(i -> i).sum();

            if(currentRunSumPollution.equals(goalRunSumPollution)){
                break;
            }
        }

        return filters;


    }
}
