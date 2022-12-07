package com.apolis.practicecodes;
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//A subsequence of a string is a new string that is formed from the original string by deleting some
//(can be none) of the characters without disturbing the relative positions of the remaining characters.
//(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//        Example 1:
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
//
//        Example 2:
//        Input: s = "axc", t = "ahbgdc"
//        Output: false

import java.util.HashMap;

public class IsSubSequence392 {

    private static boolean isSubsequence(String s, String t) {

//        HashMap<Character,Integer> map=new HashMap<>();
//
//        for (int i=0;i<t.length();i++){
//
//            map.compute(t.charAt(i),(key,value)->(value==null)?1:value+1);
//
//        }
//        int count=0;
//        for(int i=0;i<s.length();i++){
//
//            if(map.containsKey(s.charAt(i))){
//                count=map.get(s.charAt(i));
//
//                if(count<0){
//                    return false;
//                }
//                map.put(s.charAt(i),count-1);
//            }
//            else{
//                return false;
//            }
//        }
//        System.out.println(map);
//
//        return true;
        int count=0;

        for(int i=0;i<s.length() && i<t.length();i++){

            if (s.charAt(count)==t.charAt(i)){
                count++;
            }
        }

        return count==s.length();
    }

    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";

        System.out.println(isSubsequence(s,t));
    }
}
