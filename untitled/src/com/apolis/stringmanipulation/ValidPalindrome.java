package com.apolis.stringmanipulation;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
//it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//        Example 1:
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//
//        Example 2:
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//
//        Example 3:
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.

public class ValidPalindrome {
    private static boolean palindrome(String s){

       s=s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "").replace(" ","");  ;
//        for(int i=0;i<s.length();i++) {
//
//            if (isSymbol(s.charAt(i))) {
//
//            }
//        }

        StringBuilder stringBuilder=new StringBuilder(s);
        if (s.equals(String.valueOf(stringBuilder.reverse()) )){
            return true;
        }

//        System.out.println(s);
        return false;
    }

//    private static boolean isSymbol(char a) {
//        if(a>='a'|| a<='z'){
//            return false;
//        }
//        return true;
//    }

    public static void main(String[] args) {

        String s="A man, a plan, a canal: Panama ";
        System.out.println(palindrome(s));

    }
}
