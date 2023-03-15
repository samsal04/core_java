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

        int count=0;
        int[] array1= new int[Math.max(nums1.length,nums2.length)];
        int[] array2= new int[Math.min(nums1.length,nums2.length)];

        if(nums1.length>=nums2.length){
            array1=nums1;
            array2=nums2;
        }else {
            array1=nums2;
            array2=nums1;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        List<Integer> list= new ArrayList<>();
        for(int i=0;i<array1.length && count<array2.length;i++){

            if(array1[i]==array2[count]){
                list.add(array1[i]);
                count++;
            }
        }
        System.out.println(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] nums1= {4,9,5};
        int[] nums2= {9,4,9,8,4};

        System.out.println(Arrays.toString(intersction(nums1,nums2)));
    }


}
