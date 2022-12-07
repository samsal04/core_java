package com.apolis.javapractice;
//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
//
//        Example 1:
//        Input: arr = [1,2,2,1,1,3]
//        Output: true
//        Explanation:The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//
//        Example 2:
//        Input: arr = [1,2]
//        Output: false
//
//        Example 3:
//        Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//        Output: true


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class UniqueOccurances1207 {
    private static boolean uniqueOccurrences(int[] nums) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){

                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);



       int[] array1=map.values().stream().mapToInt(Integer::intValue).toArray();

       System.out.println(Arrays.toString(array1));

       for(int i=0;i<array1.length;i++){
           if(!isUnique(array1,array1[i],i)){
               return false;
           }
       }

        return true;
    }

    private static boolean isUnique(int[] array1, int i, int i1) {

        for(int j=i1; j<array1.length;j++){

            if(array1[j]==i){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(uniqueOccurrences(nums));
    }
}
