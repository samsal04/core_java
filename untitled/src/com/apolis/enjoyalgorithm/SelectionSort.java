package com.apolis.enjoyalgorithm;


import java.util.Arrays;

public class SelectionSort {
    private static int[] selectionSort(int[] array) {


        for(int i=0;i< array.length;i++){
            int minIndex = i;
            for (int j=i+1;j< array.length;j++){

                if(array[j]<array[minIndex]){
                    minIndex=j;
                }

            }
            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;

        }
        return array;
    }
    public static void main(String[] args) {
        int[] array={3,6,1,4,8,10,9};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
