package com.apolis.repeated;
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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContainsDuplicate217 {
    private static boolean duplicate(int[] nums) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){

            map.compute(nums[i],(key,value)-> (value==null)? 1: value+1);

        }
//
//        map.forEach(
//                (key,value)-> System.out.println(key +":"+ value)
//        );
//
//        Iterator<Map.Entry<Integer,Integer>> iterator= map.entrySet().iterator();

//        while(iterator.hasNext()){
//
//            Map.Entry<Integer,Integer> entry= iterator.next();
//
//            if(entry.getValue()<2){
//                return false;
//            }
//        }


        for (Integer value: map.values()){
            if (value<2){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {

        int[] nums={1,1,1,3,3,4,3,2,4,2};

        System.out.println(duplicate(nums));
    }
}
