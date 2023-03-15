package com.apolis.practicecodes;
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
    private static void rotate(int[] nums,int k) {
        int temp=0;
        int[] holdArray=new int[nums.length];

        while(k>0){

            for(int i=0;i<nums.length-1;i++){
                if(i==0){
                    temp= nums[i];
                    holdArray[i]=nums[nums.length-1];

                }else if (i==1){
                    holdArray[i]=temp;
                }
                {
                    holdArray[i+1]=nums[i];
                }

            }
            System.out.println(Arrays.toString(holdArray));
            nums= Arrays.stream(holdArray).toArray();
            k--;

        }

        System.out.println(Arrays.toString(holdArray));
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }
}
