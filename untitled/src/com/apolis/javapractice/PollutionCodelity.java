package com.apolis.javapractice;
import java.util.*;
import java.util.Collections;

/**
 * An industrial company has N factories,
 * each producing some pollution every month.
 * The company has decided to reduce its total fume emissions by equipping
 * some of the factories with one or more filters.
 *
 * Every such filter reduces the pollution of a factory by half.
 * When a second (or subsequent) filter is applied,
 * it again reduces by half the remaining pollution emitted after fitting the existing filter(s).
 * For example,
 * a factory that initially produces 6 units of pollution will generate 3 units with one filter,
 * 1.5 units with two filters and 0.75 units with three filters.
 *
 * You are given an array of N integers describing the amount of pollution produced by the factories.
 * Your task is to find the minimum number of filters needed to decrease
 * the total sum of pollution by at least half.
 *
 * Write a function:
 * which, given an array of integers A of length N,
 * returns the minimum number of filters needed to reduce the total pollution by at least half.
 *
 * Examples:
 * 1. Given A = [5, 19, 8, 1], your function should return 3.
 * The initial total pollution is 5 + 19 + 8 + 1 = 33.
 * We install two filters at the factory producing 19 units
 * and one filter at the factory producing 8 units.
 * Then the total pollution will be 5 + ((19/2) / 2) + (8 / 2) + 1 = 5 + 4.75 + 4 + 1 = 14.75
 * which is less than 33/2 = 16.5,
 * so we have achieved our goal.
 *
 * 2. Given A = [10, 10]. your function should return 2,
 * because we may install one filter at each factory.
 *
 * 3. Given A = [3, 0, 5],  your function should return 2,
 * because it Is sufficient to install one filter at each factory producing
 * a non-zero amount of pollution.
 */
public class PollutionCodelity {
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

    public static Integer recommendedFilters(int[] factories){
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

