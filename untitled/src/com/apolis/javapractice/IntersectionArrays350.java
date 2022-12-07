package com.apolis.javapractice;
//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must appear as many times as it shows in both arrays 
//and you may return the result in any order.
//
//        Example 1:
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]  ==> 
//        Output: [2,2]
//
//        Example 2:
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [4,9]
//        Explanation: [9,4] is also accepted.

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionArrays350 {

    private static int[] intersction(int[] nums1, int[] nums2) {


        List<Integer> list1=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){

            for(int j=0;j<nums2.length;j++){

                if (nums1[i]==nums2[j]){
                    list1.add(nums1[i]);
                }else{
                    continue;
                }

            }
        }
        return list1.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {
        int[] nums1= {1,2,2,1};
        int[] nums2= {2,2};
        
        System.out.println(Arrays.toString(intersction(nums1,nums2)));
    }


}
