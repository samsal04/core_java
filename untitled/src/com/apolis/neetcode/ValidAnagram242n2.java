package com.apolis.neetcode;
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
public class ValidAnagram242n2 {
    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] mapper= new int[26];

        for (int i=0;i<s.length();i++){
            mapper[s.charAt(i)-'a']++;
            mapper[t.charAt(i)-'a']--;
        }

        for (int map:mapper){
            if(map!=0){
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
