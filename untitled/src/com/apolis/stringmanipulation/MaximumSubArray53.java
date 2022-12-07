package com.apolis.stringmanipulation;
//Given an integer array nums, find the subarray which has the largest sum and return its sum.
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

public class MaximumSubArray53 {

    private static int sum(int[] nums) {

        int largestSum=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for (int j=i+1;j<nums.length;j++){

                sum= sum+ nums[j];

                if (sum>largestSum){
                    largestSum=sum;
                }
            }
        }

        return largestSum;
    }
    public static void main(String[] args) {
        int[] nums= {5,4,-1,7,8};

        System.out.println(sum(nums));
    }


}
