package com.apolis.practicecodes;
//Given an integer array nums, find the subarray
//which has the largest sum and return its sum.
//
//        Example 1:
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
//
//        Example 2:
//        Input: nums = [1]
//        Output: 1
//
//        Example 3:
//        Input: nums = [5,4,-1,7,8]
//        Output: 23


public class MaximumSub53 {

    private static int maxSum(int[] array) {

        int currentSum=0;
        int result=Integer.MIN_VALUE;

        for (int i=0;i<array.length;i++){
            currentSum= Math.max(currentSum+array[i],array[i]);
            result=Math.max(currentSum,result);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(array));

    }
}
