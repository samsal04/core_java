package com.apolis.javapractice;
//Given an array arr[] of integers and a number x, the task is to find the smallest subarray with a sum greater than the given value.
//
//        Examples:
//        arr[] = {1, 4, 45, 6, 0, 19}
//        x  =  51
//        Output: 3
//        Minimum length subarray is {4, 45, 6}
//
//        arr[] = {1, 10, 5, 2, 7}
//        x  = 9
//        Output: 1
//        Minimum length subarray is {10}
//
//        arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}
//        x = 280
//        Output: 4
//        Minimum length subarray is {100, 1, 0, 200}
//
//        arr[] = {1, 2, 4}
//        x = 8
//        Output : Not Possible
//        Whole array sum is smaller than 8.

public class SmallestSubGreaterThanN {
    private static int getSmallestArray(int[] arr,int n, int x) {

        int curr_sum = 0, min_len = n + 1;

        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum <= x && end < n)
                curr_sum += arr[end++];

            // If current sum becomes greater than x.
            while (curr_sum > x && start < n) {
                // Update minimum length if needed
                if (end - start < min_len)
                    min_len = end - start;

                // remove starting elements
                curr_sum -= arr[start++];


            }
        }
        return min_len;

    }
    public static void main(String[] args) {
        int[] arr= {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int n=280;
        int length=arr.length;

        System.out.println(getSmallestArray(arr,length,n));
    }
}
