package com.apolis.enjoyalgorithm;

import java.util.Arrays;

//There are two sorted arrays of size n each, write a program to find the median of array obtained after merging
//both arrays i.e. merged array of size 2n.
//
//- The median of a sorted array of size n is defined as the middle element, when n is odd and average of two middle
//elements, when n is even.
//- After merging both arrays, the size of larger array will be 2n i.e an even value
//- For convenience of the solution, let's assume n is odd.
//
//Example:
//
//input: array1={1,3,6}  array2={2,8,12}
//output: 4.5
//
//input array1={1,3,4,6,9} array2={2,5,7,8,10}
//output: 5.5
public class MedianOfSortedArrays {
    private static long median(int[] array1, int[] array2) {
        int[] array=new int[array1.length+array2.length];
        int aPointer=0;
        int bPointer=0;
        long median=0;
        int pointer=0;

        while(aPointer<array1.length || bPointer<array2.length){

            if(aPointer==array1.length-1 && bPointer<=array2.length-1){
                array[pointer]=array2[bPointer];
                bPointer++;
            }
            else if(aPointer==array2.length-1 && aPointer<=array1.length-1){
                array[pointer]=array1[aPointer];
                aPointer++;
            }
            else if(array1[aPointer]>array2[bPointer]){
                array[pointer]=array2[bPointer];
                bPointer++;
            }
            else if(array1[aPointer]<array2[bPointer]) {
                array[pointer]=array1[aPointer];
                aPointer++;
            }

            pointer++;
        }

        System.out.println(Arrays.toString(array));
        int low= 0;
        int high= array.length-1;
        int mid=low+(high-low)/2;
        if(array.length%2==0){
            median=(array[mid]+array[mid+1])/2;
        }
        else {
            median=array[mid]/2;
        }
        return median;
    }
    public static void main(String[] args) {
        int[] array1={1,3,6};
        int[] array2={2,8,12};
        System.out.println(median(array1,array2));
    }
}
