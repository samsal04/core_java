package com.apolis.stringmanipulation;
//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//Letters are case sensitive, for example,"Aa" is not considered a palindrome here.
//
//        Example 1:
//        Input: s = "abccccdd"
//        Output: 7
//        Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
//
//        Example 2:
//        Input: s = "a"
//        Output: 1
//        Explanation: The longest palindrome that can be built is "a", whose length is 1.

import java.util.Arrays;

public class LongestPalindrome409 {
    private static int longestPalindrome(String s) {

        int[] array = new int[256];
        int length = s.length();
        for (int i = 0; i < length; ++ i){
            array[s.charAt(i)] ++;

        }
        System.out.println(Arrays.toString(array));


        int count = 0;
        boolean flag = false;
        for (int i = 0; i < 256; ++ i){
            if (array[i] != 0 && (array[i]%2) == 0){
                count += array[i];
//                System.out.println(array[i]);
            }
            else if ((array[i]%2) != 0){
                flag = true;
                count += array[i] - 1;
            }
        }
        return flag?count+1:count;

    }
//    private static boolean isPalindrome(String sub) {
//
//        StringBuilder stringBuilder= new StringBuilder(sub);
////        System.out.println(stringBuilder);
//        stringBuilder=stringBuilder.reverse();
//
//        if(sub.equals(String.valueOf(stringBuilder))){
//            return true;
//        }
//        return false;
//    }

    public static void main(String[] args) {

        String s="abccccdd";
        System.out.println(longestPalindrome(s));

    }


}
