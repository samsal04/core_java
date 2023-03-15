package com.apolis.repeated;
//Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//        Example 1:
//        Input: s = "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
//
//        Example 2:
//        Input: s = "God Ding"
//        Output: "doG gniD"

import java.util.Arrays;

public class ReverseWordsInString557 {
    private static String reverseString(String s) {
        String[] stringArray= s.split(" ");
        System.out.println(Arrays.toString(stringArray));

        StringBuilder stringBuilder= new StringBuilder();

        for(int i=0;i<stringArray.length;i++){
                StringBuilder stringBuilder1= new StringBuilder(stringArray[i]);
            if(i==stringArray.length-1){

                stringBuilder.append(stringBuilder1.reverse());
            }else {
                stringBuilder.append(stringBuilder1.reverse());
                stringBuilder.append(" ");
            }


        }

        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseString(s));
    }
}
