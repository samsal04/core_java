package com.apolis.repeated;
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

import java.util.Arrays;

public class ValidAnagram242 {
    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
