package com.apolis.javapractice;
//Given an array of integers nums which is sorted in ascending order, and an integer target, \
//write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.
//
//        Example 1:
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
//
//        Example 2:
//        Input: nums = [-1,0,3,5,9,12], target = 2
//        Output: -1
//        Explanation: 2 does not exist in nums so return -1



public class BinarySearch704 {
    private static int binarySearch(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;
        int mid=0;

        while(start<=end){
             mid= (end+start)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target){

                end=mid-1;
            }
            else if (nums[mid]<target){
                start=mid+1;

            }


        }


        return -1;


    }


    public static void main(String[] args) {
        int target=2;
        int[] nums={-1,0,3,5,9,12};

        System.out.println(binarySearch(nums,target));

    }


}
