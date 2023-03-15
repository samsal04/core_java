package com.apolis.javapractice;
//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//        Example 1:
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
//
//        Example 2:
//        Input: nums = [-1,-100,3,99], k = 2
//        Output: [3,99,-1,-100]
//        Explanation:
//        rotate 1 steps to the right: [99,-1,-100,3]
//        rotate 2 steps to the right: [3,99,-1,-100]

import java.util.Arrays;

public class RotateArray189 {
    private static int[] rotate(int[] nums, int k) {

        int[] a= new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }

         k=k%nums.length;
        while(k>0){
            int temp=0;
            for(int i=0;i<nums.length;i++) {
//                int tempIndexOne=0;
//                int temp=0;
//                if(i==0){
//                    tempIndexOne=nums[i];
//                    nums[i]=nums[nums.length-1];
//                }
//
//                else {
//                   temp= nums[i];
//                   nums[i]=nums[i+1];
//                   nums[i+1]=temp;
//                }


//                int tempOther=0;
//                if (i == 0) {
//                    temp=nums[i];
//                    nums[i]=nums[nums.length-1];
//                    nums[nums.length-1]=temp;
//                }else{
//                    tempOther=nums[i];
//                    nums[i]=nums[nums.length-1];
//                    nums[nums.length-1]=tempOther;
//                }

                    temp=nums[i];
                    nums[i]=nums[nums.length-1];
                    nums[nums.length-1]=temp;

            }


            k--;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;

        System.out.println(Arrays.toString(rotate(nums,k)));
    }
}
