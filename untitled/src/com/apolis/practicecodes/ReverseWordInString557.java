package com.apolis.practicecodes;
//Given a string s, reverse the order of characters in each word within a sentence
//while still preserving whitespace and initial word order.
//
//        Example 1:
//        Input: s = "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
//
//        Example 2:
//        Input: s = "God Ding"
//        Output: "doG gniD"

import java.util.Arrays;

public class ReverseWordInString557 {
    private static String reverseWords(String s) {

        String[] strings= s.split(" ");
//        System.out.println(Arrays.toString(strings));

        for(int i=0;i< strings.length;i++){

            strings[i]=reverseString(strings[i]);

        }
//        System.out.println(Arrays.toString(strings));

        s=Arrays.toString(strings);

        return s;
    }

    private static String reverseString(String string) {
        StringBuilder stringBuilder= new StringBuilder(string);

        return String.valueOf(stringBuilder.reverse());
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
