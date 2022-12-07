package com.apolis.javapractice;
//Given a sorted array of distinct integers and a target value, return the index if the target is found.
//        If not, return the index where it would be if it were inserted in order.
//        You must write an algorithm with O(log n) runtime complexity.
//
//        Example 1:
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2
//
//        Example 2:
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1
//
//        Example 3:
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4

public class SearchInsertPosition {
    public static int index(int[] nums, int target){
//        int initial= 0;
//        int last = nums.length-1;
//        int result=0;
//        int mid = initial+ last/2;
//
//        while ( initial< last){
//
//            if (nums[mid]==target || nums[initial]>target && nums[last]<target ){
//                result= mid;
//            }
//            else if (nums[mid]>target){
//                last=mid-1;
//                initial=0;
//            } else if (nums[mid]<target){
//                initial=mid+1;
//                last= nums.length-1;
//            }
//        }
//        return result;
        int result=0;
        for(int i=0;i<nums.length;i++){

         if ( nums[i]<target){
                continue;
            }
            else if (nums[i] ==target){
                result=i;

            } else if (nums[i]>target || i==nums.length-1){
                if (i==nums.length-1){
                    result=i+1;
                }else {
                    result=i;
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums= {1,3,5,6};
        int target= 5;

        System.out.println(index(nums,target));
    }
}
