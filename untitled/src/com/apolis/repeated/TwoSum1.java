package com.apolis.repeated;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//        Example 1:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//        Example 2:
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//
//        Example 3:
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

public class TwoSum1 {
    private static int[] twoSum(int[] nums, int n) {

        int[] result= new int[2];
        int first=0;
        int last= nums[nums.length-1];

        while(first<=last){
            if(nums[first]+nums[last]==n){
                result[0]=first;
                result[1]=last;
                return result;
            }
            else if(nums[last]>n ){
                last--;
            }else if(nums[last]<n &&nums[first]+nums[last]>n ){
                first++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int n=9;
        System.out.println(twoSum(nums,n));
    }
}
