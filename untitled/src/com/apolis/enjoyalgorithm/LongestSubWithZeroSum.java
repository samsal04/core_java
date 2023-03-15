package com.apolis.enjoyalgorithm;

//Given an array of n integers, write a program to find the length of longest subarray wtih sum equal to 0.
//
//Example:
//Input: array={14,-1,1,-6,1,5,12,17}         Output=5;

import java.util.HashMap;

public class LongestSubWithZeroSum {
    private static int longestSub(int[] array) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int subArraySum=0;
        int maxLength=0;

        for (int i=0;i<array.length;i++){
            subArraySum+=array[i];
            if(subArraySum==0){
                maxLength=Math.max(maxLength,i+1);
            } else if (!map.containsKey(subArraySum)) {
                map.put(subArraySum,i);
            }
            else {
                maxLength=Math.max(maxLength,i-map.get(subArraySum));
            }
        }
        System.out.println(map);
        return maxLength;
    }
    public static void main(String[] args) {
        int[] array={14,-1,1,-6,1,5,12,17};
        System.out.println(longestSub(array));
    }
}
