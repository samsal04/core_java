package com.apolis.javapractice;
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

public class MaximumSubArray53 {
    private static int maxSubArray(int[] nums) {
//        int largestSum=nums[0];
//        for(int i=0;i<nums.length;i++){
//            int sum=nums[i];
//
//            for (int j=i+1;j<nums.length;j++){
//
//                sum= sum+ nums[j];
//                System.out.println(sum);
//                if (sum>=largestSum){
//                    largestSum=sum;
//                }
//            }
//        }
//
//
//        return largestSum;
        int res = Integer.MIN_VALUE, curSum = 0;
        for (int num : nums) {
            curSum = Math.max(curSum + num, num);
            res = Math.max(res, curSum);
        }
        return res;



    }
    public static void main(String[] args) {
        int[] nums={-2,1};
        System.out.println(maxSubArray(nums));
    }
}
