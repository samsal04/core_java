package com.apolis.stringmanipulation;
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//typically using all the original letters exactly once.
//
//        Example 1:
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//
//        Example 2:
//        Input: s = "rat", t = "car"
//        Output: false

/* Logic
    1) convert both string to arrays
    2) Sort both the arrays
    3) check whether the arrays are equal, if yes return true else false.
 */

import java.util.Arrays;

public class ValidAnagram242 {
    private static boolean isAnagram(String s, String t) {
        char[] chars=s.toCharArray();
        char[] chart=t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        return Arrays.equals(chars,chart);
    }
    public static void main(String[] args) {
        String s="anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
