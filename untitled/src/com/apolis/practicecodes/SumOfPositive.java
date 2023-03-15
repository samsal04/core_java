package com.apolis.practicecodes;

import java.util.Arrays;

//You get an array of numbers, return the sum of all of the positives ones.
//
//        Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//        Note: if there is nothing to sum, the sum is default to 0
public class SumOfPositive {
    private static int sum(int[] array) {

        return Arrays.stream(array).filter(n->n>0).sum();
    }

    private static double find_average(int[] array) {

        return Arrays.stream(array).average().getAsDouble();
    }
    public static void main(String[] args) {
        int[] array={1,-4,7,12};
        System.out.println(sum(array));
        System.out.println(find_average(array));
    }
}
