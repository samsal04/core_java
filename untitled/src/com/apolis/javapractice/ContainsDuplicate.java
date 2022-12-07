package com.apolis.javapractice;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
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
import java.util.List;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    private static boolean duplicate(int[] nums) {

        HashMap<Integer,Integer> map= new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        List<Integer> list= map.values().stream().collect(Collectors.toList());

//         list.stream().filter(l->l>1).collect(Collectors.toList());
//
//         System.out.println(list);
//
//         return list.isEmpty();

        System.out.println(list);
        for(int i=0;i<list.size();i++){

            if (list.get(i)>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        System.out.println(duplicate(nums));
     }


}
