package com.apolis.practicecodes;
//Input: S = "aaaabbaa" Output: aabbaa Explanation:
//        The longest Palindromic substring is "aabbaa".
//        Example 2: Input: S = "abc" Output: a
//        Explanation: "a", "b" and "c" are the longest palindromes with same length

public class LongestPalindromeSub {

    public static String subString(String s){

//        StringBuilder stringBuilder= new StringBuilder(s);
//
//        if(s.equals(stringBuilder.reverse())){
//            return s;
//        }
            String palindrome="";
            for(int i=0;i<s.length()-1;i++){

                for (int j=i+1;j<=s.length();j++){

                    String subString= s.substring(i,j);
                    if(isPalindrome(subString) && subString.length()>palindrome.length()){

                        palindrome=subString;

                    }

                }

            }

        return palindrome;
    }

    public static boolean isPalindrome(String s){

        StringBuilder stringBuilder= new StringBuilder(s);
        stringBuilder.reverse();

        return stringBuilder.toString().equals(s);
    }

    public static void main(String[] args) {
        String s="aaaabbaa";

        System.out.println(subString(s));

    }
}
