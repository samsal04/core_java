package com.apolis.enjoyalgorithm;

//Given an array of n integers, where some elements are zero and some elements are non zero.
//Write a program to move all the zeroes to the end of the array.class
//
//Example:
//Input: array={4,8,6,0,2,0,1,15,12,0}            Output:array={4,8,6,2,1,15,12,0,0,0}
//Input: array={0,3,5,9,0,0,12,2}                 Output:array={3,5,9,23,2,0,0,0}

import java.util.Arrays;

public class MoveZeroToEnd {
    private static int[] zeroSort(int[] array) {

//        int[] arrayCopy= new int[array.length];
//        int right=array.length-1;
//        int index=0;
//        for (int j : array) {
//            if (j != 0 && index <= right) {
//                arrayCopy[index] = j;
//                index++;
//            } else if (j == 0 && arrayCopy[right] != 0) {
//                arrayCopy[right] = j;
//                right--;
//            }
//        }
//        return arrayCopy;

        int j = 0;
        for (int i : array) {
            if (i != 0) {
                array[j] = i;
                j++;
            }
        }

        while (j < array.length) {
            array[j] = 0;
            j++;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = {0, 3, 5, 9, 0, 0, 12, 2};
        System.out.println(Arrays.toString(zeroSort(array)));
    }
}
