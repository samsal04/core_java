package com.apolis.stringmanipulation;
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

public class ReverseWord557 {
    private static String reverseWord(String s) {

        String[] array= s.split(" ");
        StringBuilder stringBuilder= new StringBuilder();

       for (int i=0;i<array.length;i++){

           stringBuilder.append( reverseString(array[i]));
           if (i!=array.length-1){
               stringBuilder.append(" ");
           }else{
               continue;
           }
       }
        return String.valueOf(stringBuilder);
    }

    private static String reverseString(String s) {

        StringBuilder stringBuilder= new StringBuilder(s);

        return String.valueOf(stringBuilder.reverse());
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWord(s));
    }


}
