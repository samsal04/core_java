package com.apolis.optimized;

import java.util.HashSet;

//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.
//
//        Example 1:
//        Input: nums = [1,2,3,1]
//        Output: true
//
//        Example 2:
//        Input: nums = [1,2,3,4]
//        Output: false
//
//        Example 3:
//        Input: nums = [1,1,1,3,3,4,3,2,4,2]
//        Output: true
public class ContainsDuplicate217 {
    private static boolean duplicate(int[] nums) {

        HashSet<Integer> set= new HashSet<>();

        for (int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {

        int[] nums={1,1,1,3,3,4,3,2,4,2};
        System.out.println(duplicate(nums));

    }
}
