package com.apolis.practicecodes;
//Write a function that reverses a string. The input string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory.
//
//        Example 1:
//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]
//
//        Example 2:
//        Input: s = ["H","a","n","n","a","h"]
//        Output: ["h","a","n","n","a","H"]

import java.util.Arrays;

public class ReverseString344 {
    private static char[] reverseString(char[] s) {

        String s1= String.valueOf(s);
//        System.out.println(s1);
        StringBuilder stringBuilder= new StringBuilder(s1);
        s1=String.valueOf(stringBuilder.reverse());
        s=s1.toCharArray();
        System.out.println(Arrays.toString(s));
        String[] s2=s1.split("");
        System.out.println(Arrays.toString(s2));
        return s1.toCharArray();

    }
    public static void main(String[] args) {

        char[] s={'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseString(s)));
    }
}
