package com.apolis.javapractice;

import java.util.Arrays;
import java.util.OptionalInt;

//You are given an array arr[] of N integers including 0.
//The task is to find the smallest positive number missing from the array.
//
//        Example 1:
//
//        Input:
//        N = 5
//        arr[] = {1,2,3,4,5}
//        Output: 6
//        Explanation: Smallest positive missing
//        number is 6.
public class SmallestPositiveNum {
//    {5,6,7,8,2,3};
    private static int missingNum(int[] arr) {

                 Arrays.stream(arr).sorted();

                 int min= arr[0];
                 int max=arr[arr.length-1];


        int count=arr[0];

        if(arr[0]>=2){
            return arr[0]-1;
        }


        for (int i=0;i< arr.length;i++){

                if (arr[i]==count){
                    count++;
                }else{
                    return arr[i];
                }
        }

     return arr[arr.length-1]+1;

    }

    public static void main(String[] args) {
        int[] arr={5,6,7,8,2,3};

        System.out.println(missingNum(arr));
    }

}
