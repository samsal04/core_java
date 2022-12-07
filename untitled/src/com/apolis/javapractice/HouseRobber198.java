package com.apolis.javapractice;
//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
//the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected
//and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house,
//return the maximum amount of money you can rob tonight without alerting the police.
//
//        Example 1:
//        Input: nums = [1,2,3,1]
//        Output: 4
//        Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//        Total amount you can rob = 1 + 3 = 4.
//
//        Example 2:
//        Input: nums = [2,7,9,3,1]
//        Output: 12
//        Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//        Total amount you can rob = 2 + 9 + 1 = 12.


import java.util.Arrays;

public class HouseRobber198 {
    private static int rob(int[] nums) {
//
//        int sum=0;
//        int max=Arrays.stream(nums).max().getAsInt();
//        int maxIndex= getMaxIndex(max,nums);
//
//        if(maxIndex%2==0){
//            sum=getSum(nums,0);
//        }else if(maxIndex%2==1){
//            sum=getSum(nums,1);
//        }
//
//        return sum;
//    }
//

//
//    private static int getMaxIndex(int max, int[] nums) {
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==max){
//                return i;
//            }
//        }
//        return 0;

//    int evenSum=getSum(nums,0);
//    int oddSum=getSum(nums,1);
////    int largestSum=0;
//    return Math.max(evenSum,oddSum);
//
////    for(int i=0;i<nums.length;i++){
////        int sum=nums[i];
////        for(int j=i+1;j<nums.length;j=j+2){
////            sum=sum+nums[j];
////        }
////        if(sum>largestSum){
////            largestSum=sum;
////        }
////    }
////
////    return largestSum;
//    }
//    private static int getSum(int[] nums, int j) {
//        int sum=0;
//        for(int i=j;i<nums.length;i=i+2){
//            sum=sum+nums[i];
//        }
//        return sum;

        int n = nums.length;
        if( n==1 ){
            return nums[0];
        }else if(n == 0){
            return 0;
        }else if(n == 2){
            return Math.max(nums[0],nums[1]);
        }

        int maxSum[] = new int[n];
        maxSum[0] = nums[0];
        maxSum[1] = nums[1];
        maxSum[2] = nums[2] + nums[0];
        for(int i=3;i<n;i++){
            maxSum[i] = Math.max(maxSum[i-2],maxSum[i-3]) + nums[i];
        }

        return Math.max(maxSum[n-1],maxSum[n-2]);
    }

    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};

        System.out.println(rob(nums));
    }
}
