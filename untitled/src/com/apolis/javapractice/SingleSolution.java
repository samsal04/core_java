package com.apolis.javapractice;

import java.util.HashMap;
import java.util.Map;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//  You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//        Example 1:
//        Input: nums = [2,2,1]
//        Output: 1
//
//        Example 2:
//        Input: nums = [4,1,2,1,2]
//        Output: 4
//
//        Example 3:
//        Input: nums = [1]
//        Output: 1
public class SingleSolution {
    private static int check(int[] nums) {

//        HashMap<Integer,Integer> map= new HashMap<>();
//        int result=0;
//
//        for(int i=0;i<nums.length;i++){
//
//            map.compute(nums[i],(key,value)-> (value==null)?1:value+1 );
//        }
//
////        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
////
////
////
////        }
//        System.out.println(map);
//
//        map.entrySet().stream().filter(i->i.getValue()==1).
//
//
//         result=map.values().stream().filter(i->i==1).findFirst().get();
//        System.out.println(result);
        int result=0;
        for(int num:nums){
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        int[] nums2={2,2,1};
        System.out.println(check(nums));
        System.out.println(check(nums2));

    }
}
