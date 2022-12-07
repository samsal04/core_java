package com.apolis.practicecodes;
//Given an integer array nums sorted in non-decreasing order,
//remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
//        Example 2:
//
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NonDuplicateSort {
    public static int merge(int[] nums){

//        HashMap<Integer,Integer> map= new HashMap<>();
//        int count=0;
//        int result=0;
//        for(int i=0;i<array.length;i++){
//
//            if(map.containsKey(array[i])){
//                count=map.get(array[i]);
//                map.put(array[i],count+1 );
//            }
//            else {
//                map.put(array[i],1);
//                result++;
//            }
//
//        }
//        List<Integer> list= map.keySet().stream().toList();
//        System.out.println("Result: "+ result);
//       return list.stream().mapToInt(Integer::intValue).toArray();

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            nums[count] = nums[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array= {0,0,1,1,1,2,2,3,3,4};

        System.out.println(merge(array));

    }
}
