package com.apolis.repeated;
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
    private static void reverseString(char[] s) {

//        StringBuilder stringBuilder= new StringBuilder(Arrays.toString(s));
//        stringBuilder.reverse();
//
//        s=stringBuilder.toString().toCharArray();
//
//        System.out.println(Arrays.toString(s));
//
//        System.out.println(s);

        int left=0;
        int right=s.length-1;


        while(left<right){

        char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;

        }

        System.out.println(Arrays.toString(s));

    }
    public static void main(String[] args) {
       char[] s={'h','e','l','l','o'};
       reverseString(s);
    }
}
