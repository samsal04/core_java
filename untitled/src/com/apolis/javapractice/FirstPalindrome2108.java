package com.apolis.javapractice;
//Given an array of strings words, return the first palindromic string in the array.
//If there is no such string, return an empty string "".
//A string is palindromic if it reads the same forward and backward.
//
//        Example 1:
//        Input: words = ["abc","car","ada","racecar","cool"]
//        Output: "ada"
//        Explanation: The first string that is palindromic is "ada".
//        Note that "racecar" is also palindromic, but it is not the first.
//
//        Example 2:
//        Input: words = ["notapalindrome","racecar"]
//        Output: "racecar"
//        Explanation: The first and only string that is palindromic is "racecar".
//
//        Example 3:
//        Input: words = ["def","ghi"]
//        Output: ""
//        Explanation: There are no palindromic strings, so the empty string is returned.

public class FirstPalindrome2108 {
    private static String firstPalindrome(String[] words) {

        for(String word: words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String word) {

        StringBuilder stringBuilder= new StringBuilder(word);
        if(stringBuilder.reverse().toString().equals(word)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words= {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}
