package com.apolis.stringmanipulation;
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
    private static void revers(char[] s) {

        String string= Arrays.toString(s);
        StringBuilder stringBuilder= new StringBuilder(string);

        stringBuilder.reverse();
        System.out.println(String.valueOf(stringBuilder));
        char temp=' ';
        int count=0;
        char[] newArray= new char[s.length];
        for(int i=s.length-1;i>=0;i--){

            newArray[count]= s[i];
            count++;

        }
        System.out.println(string);
        System.out.println(Arrays.toString(newArray));
    }


    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
      revers(s);
    }


}
