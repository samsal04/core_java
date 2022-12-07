package com.apolis.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeDemo2 {
    private static String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return "Please enter a String";
        }

        if (s.length() == 1) {
            return s;
        }
        List<String> list= new ArrayList<>();
        String longest="";
        for(int i=0;i<s.length();i++){

            for (int j=i+1;j<s.length()+1;j++){
                String sub= s.substring(i,j);
                list.add(sub);
                if (isPalindrome(sub) && sub.length()>longest.length()){
                    longest=sub;
//                    System.out.println(longest);
                }
            }
        }
        System.out.println(list.toString());
//        System.out.println(longest);
        return longest;
    }

    private static boolean isPalindrome(String sub) {

        StringBuilder stringBuilder= new StringBuilder(sub);
        return sub.contentEquals(stringBuilder.reverse());

    }

    public static void main(String[] args) {
        String s="ABCDEF";
        System.out.println(longestPalindrome(s));
    }
}
