package com.apolis.enjoyalgorithm;

//Given an unsorted array of n integers, write a program to sort the array into a wave array.
//An array is sorted in wave arrangment if A[0]>= A[1]<=A[2]>=A[3]......
//
//Example:
//
//Input: array={1,2,3,4}          Output:array={2,1,4,3} or array={4,1,3,2}
//Input: array={20,10,8,6,4,2}    Output:array={20,8,10,4,6,2} or array={10,8,20,2,6,4}


import java.util.Arrays;

public class ArrayInWave {
    private static int[] wave(int[] array) {

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        for(int i=1;i< array.length;i=i+2){

            int temp=array[i-1];
            array[i-1]=array[i];
            array[i]=temp;

        }
        return array;
    }
    public static void main(String[] args) {
        int[] array={3,6,1,4,8,10,9};
        System.out.println(Arrays.toString(wave(array)));
    }
}
