package com.apolis.javapractice;
//Given an unsorted integer array nums, return the smallest missing positive integer.
//You must implement an algorithm that runs in O(n) time and uses constant extra space.
//
//        Example 1:
//        Input: nums = [1,2,0]
//        Output: 3
//        Explanation: The numbers in the range [1,2] are all in the array.
//
//        Example 2:
//        Input: nums = [3,4,-1,1]   => [-1,1,3,4]
//        Output: 2
//        Explanation: 1 is in the array but 2 is missing.
//
//        Example 3:
//        Input: nums = [7,8,9,11,12]
//        Output: 1
//        Explanation: The smallest positive integer 1 is missing.

import java.util.Arrays;

public class SmallestMissing {
    private static int missingNum(int[] array) {
        Arrays.stream(array).sorted();
        int min= array[0];
        int max=array[array.length-1];
//        System.out.println(Arrays.toString(array));
//        int counter= 1;
          int smallest= 0;
//        for(int i=0;i<array.length;i++){
//           if(array[i]<1){
//               smallest=1;
//               continue;
//           }else if (array[i]==1){
//               smallest=1;
//               continue;
//           }
//            if(array[i+1]==array[i]+1){
//                continue;
//            }else if(array[i+1]!=array[i]+1){
//                return  array[i]+1;
//            }
//
//        }

//        for(int i=0;i<array.length;i++){
//
//            if(array[i+1]==array[i]+1){
//                continue;
//            }else if(array[i+1]!=array[i]+1){
//                return  array[i]+1;
//            }
//        }
//        return 1;

        for(int i=0;i<array.length;i++){


            if (min<1 && array[i]!=1){
                smallest=1;
            }
            else if (min>1){


            }

        }

        return smallest;
    }
    public static void main(String[] args) {
        int[] array= {7,8,9,11,12};
        System.out.println(missingNum(array));

    }


}
