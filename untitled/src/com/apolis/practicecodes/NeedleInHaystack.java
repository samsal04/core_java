package com.apolis.practicecodes;
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//        Example 1:
//
//        Input: haystack = "sadbutsad", needle = "sad"
//        Output: 0
//        Explanation: "sad" occurs at index 0 and 6.
//        The first occurrence is at index 0, so we return 0.
//        Example 2:
//
//        Input: haystack = "leetcode", needle = "leeto"
//        Output: -1
//        Explanation: "leeto" did not occur in "leetcode", so we return -1.
public class NeedleInHaystack {

    public static void main(String[] args) {

        String hayStack="sadbutsad";
        String needle="sad";

        System.out.println(needleInHaystack(hayStack,needle));

    }

    private static int needleInHaystack(String hayStack, String needle) {
        int index=0;


        for (int i=0;i<hayStack.length();i++){

            if(hayStack.charAt(i)==needle.charAt(0)){
                int count=0;
                int traverse=i;
               while(count<needle.length())

                    if (hayStack.charAt(i)==needle.charAt(count)){



                }

            }


        }
        return index;
    }
}
