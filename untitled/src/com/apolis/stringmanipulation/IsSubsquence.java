package com.apolis.stringmanipulation;
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//A subsequence of a string is a new string that is formed from the original string by deleting
//some (can be none) of the characters without disturbing the relative positions of the remaining characters.
//(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//        Example 1:
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
//
//        Example 2:
//        Input: s = "axc", t = "ahbgdc"
//        Output: false


import java.util.Arrays;
import java.util.Objects;

public class IsSubsquence {
    private static boolean subString(String s, String t) {

//         int index=0;
//        int count=0;
//        if (Objects.equals(s, "") ||s.isEmpty()||s.isBlank()){
//            return true;
//
//        }
//
//        char[] original= t.toCharArray();
//        char[] sub= s.toCharArray();
//
//     for (int i=0;i<sub.length;i++){
//
//        if (!isPresent(original,sub[i],index)){
//            return false;
//        }
//
//     }
//
////        for(int i=0;i<t.length();i++)
////            if (t.charAt(i) == s.charAt(count)) {
////
////                if (count++ >= s.length()) return true;
////                count++;
////
////            } else if (t.charAt(i) != s.charAt(count)) continue;
////
////        return count == s.length();
//
//
//    return true;
//    }
//
//    private static boolean isPresent(char[] original, char c, int index ) {
//
//        for (int i=index;i<original.length;i++){
//
//            if (original[i]==c){
//                    index = i;
//                    System.out.println("index :"+ index + " value of i:"+ i);
//                    return true;
//                }
//            }
//
//        return false;
//    }

        int i=0;

        for(int j=0;j<s.length()&& i<t.length();j++){

            if (s.charAt(i)==t.charAt(j)){
                i++;
            }

        }

        return i==s.length();

    }


    public static void main(String[] args) {
        String s= "acb";
        String t="ahbgdc";

        System.out.println(subString(s,t));

    }


}
