package com.apolis.javapractice;
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

public class MoveZeroes283 {
    private static void moveZeroes(int[] nums) {

//        int[] array= new int[nums.length];
//        int right=nums.length-1;
//        int left=0;
//        for (int i=0;i<nums.length;i++){
//
//            if(nums[i]==0){
//                array[right]=nums[i];
//                right--;
//            }
//            else {
//                array[left]=nums[i];
//                left++;
//            }
//
//        }
//        System.out.println(Arrays.toString(array));
        int temp=0;
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                if (nums[i]==0 && nums[j]!=0){
                   temp=nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;

                }else if(nums[i]==0 && nums[j]==0){
                    continue;
                }

            }

        }

        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};


       moveZeroes(nums);

    }
}
