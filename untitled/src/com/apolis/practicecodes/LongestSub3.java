package com.apolis.practicecodes;
//Given a string s, find the length of the longest substring without repeating characters.
//
//        Example 1:
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSub3 {
    private static int lengthOfLongestSubstring(String s) {
//
//        String longest="";
//
//        for(int i=0;i<s.length();i++){
//            for (int j=i+1;j<s.length();j++){
//                String sub= s.substring(i,j);
//                if(isUnique(sub) && sub.length()>longest.length()){
//                    longest=sub;
//                }
//            }
//        }
//    return longest.length();

        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }

    private static boolean isUnique(String sub) {


        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<sub.length();i++){
                map.compute(sub.charAt(i),(key,value)->(value==null)?1:value+1);
        }

        int[] array=map.values().stream().mapToInt(Integer::intValue).toArray();

        for(int i=0;i<array.length;i++){
            if(array[i]>1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s="abcabcbb";
        long start=0;
        long end=0;
        start=System.currentTimeMillis();
        System.out.println(lengthOfLongestSubstring(s));
        end=System.currentTimeMillis();

        System.out.println(end-start);

    }
}
