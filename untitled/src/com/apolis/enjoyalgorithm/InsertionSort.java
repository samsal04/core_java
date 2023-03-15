package com.apolis.enjoyalgorithm;

import java.util.Arrays;

public class InsertionSort {
    private static int[] insertionSort(int[] array) {

        for (int i=1;i< array.length;i++){
            int currentValue=array[i];
            int j=i-1;

            while (j >= 0 && array[j] > currentValue){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=currentValue;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array={3,6,1,4,8,10,9};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
