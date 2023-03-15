package com.apolis.javapractice;
//Given an integer array nums, return all the different possible non-decreasing subsequences of the given array with at least two elements. You may return the answer in any order.
//
//         
//
//        Example 1:
//
//        Input: nums = [4,6,7,7]
//        Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]
//
//        Example 2:
//
//        Input: nums = [4,4,3,2,1]
//        Output: [[4,4]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDecreasingSub491 {
    private static List<List<Integer>> findSubsequence(int[] nums) {
        List<List<Integer>> arrayList= new ArrayList<>();
        String numString= Arrays.toString(nums);
        numString=numString.replaceAll("[],\\],\\[]","");
//        System.out.println(numString);
        List<Integer> list= new ArrayList<>();

//        for(int i=0;i< nums.length;i++){
//            int count=i;
//            List<Integer> list= new ArrayList<>();
//            list.add(nums[i]);
//
//            for(int j=i+1;j< nums.length;j++){
//                System.out.println(nums[i] +"  "+ nums[j]);
//                if (nums[count]<nums[j]){
//                    list.add(nums[j]);
//                    count++;
//                }
//
//                if(!arrayList.contains(list)){
//                    arrayList.add(list);
//                }
//            }
//
//            System.out.println(list);
//            System.out.println("====================");
//        }

        for (int i=0;i<numString.length();i++){

            for(int j=i+1;j<=numString.length();j++){
                String sub= numString.substring(i,j);
                System.out.println(sub);
                
                if(nums[i]<nums[j] && !arrayList.contains(list)){

                    list.add(Integer.valueOf(sub));
                }else {
                    break;
                }

            }
            arrayList.add(list);
            System.out.println("=============");
        }

        return arrayList;
    }
    public static void main(String[] args) {
        int[] nums={4,6,7,7};
        System.out.println(findSubsequence(nums));
    }
}
