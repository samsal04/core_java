package com.apolis.practicecodes;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//
//        Example 1:
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//
//        Example 2:
//        Input: nums = [0]
//        Output: [0]

import java.util.Arrays;

public class MoveZeros283 {
    private static int[] moveZeros(int[] nums) {

        if(nums.length==0 || nums.length==1){
            return nums;
        }

        for(int i=0;i<nums.length;i++){

            if(nums[i]==0){
                int temp=0;
                int j=i+1;
               while(j<nums.length){
                   if(nums[j]!=0){
                       temp=nums[i];
                       nums[i]=nums[j];
                       nums[j]=temp;
                       break;
                   }
                   else{
                       j++;
                   }
               }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros(nums)));
    }
}
