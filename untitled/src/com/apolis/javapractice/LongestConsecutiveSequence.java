package com.apolis.javapractice;

//Given an unsorted array of integers, find the length of the longest consecutive elements sequence? (solution)
//
//        Input: nums = [100,4,200,1,3,2]
//        Output: 4
//        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//
//        Input: nums = [0,3,7,2,5,8,4,6,0,1]
//        Output: 9

import java.util.Arrays;

public class LongestConsecutiveSequence {
    private static int longestSequence(int[] nums) {



        nums=Arrays.stream(nums).sorted().toArray();

//        System.out.println(Arrays.toString(nums));


        int start=nums[0];
        int count=0;
        int maxCount=0;

        for(int i=1;i<nums.length;i++){

                if(start+1==nums[i]){
                    start++;
                    count++;
                }
                else {
                    if(count>maxCount){
                        maxCount=count;
                        count=0;
                        start=nums[i];
                    }
                }

        }

        return maxCount;
    }

//    private static Integer sum(Integer[] ints){
//
//
//
//    }


    public static void main(String[] args) {

        int[] nums={0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestSequence(nums));

    }
}
