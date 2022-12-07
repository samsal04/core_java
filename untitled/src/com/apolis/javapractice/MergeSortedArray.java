package com.apolis.javapractice;
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
//representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
//and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
//        Example 1:
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
//        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//
//        Example 2:
//        Input: nums1 = [1], m = 1, nums2 = [], n = 0
//        Output: [1]
//        Explanation: The arrays we are merging are [1] and [].
//        The result of the merge is [1].
//
//        Example 3:
//        Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//        Output: [1]
//        Explanation: The arrays we are merging are [] and [1].
//        The result of the merge is [1].
//        Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.


import java.util.Arrays;

public class MergeSortedArray {

    private static int[] merge(int[] nums1, int m,int[] nums2,int n){
//        int[] result= new int[num1.length+num2.length];
//        boolean num1End= false;
//        for(int i=0;i<result.length;i++){
//            if (i==num1.length-1){
//                num1End=true;
//            }
//
//            if ( num1End==false ){
//                result[i]=num1[i];
//            }else if (num1End==true){
//                result[i]=num2[i-num1.length-1];
//            }
//        }
//        return result;

        int[] result= new int[m+n];
        boolean num1End=false;
        for(int i=0;i<result.length;i++){

            if (i==m){
                num1End=true;
            }

            if (num1End==false){
                result[i]=nums1[i];
            }
            else if(num1End==true){
                result[i]=nums2[i-m];
            }

        }

      result= Arrays.stream(result).sorted().toArray();
        return result;

    }
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        int m=3;
        int n=3;
        int[] result= new int[m+n];
        result=merge(num1,3,num2,3);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
