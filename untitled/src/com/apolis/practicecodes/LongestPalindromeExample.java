package com.apolis.practicecodes;

//Input: findnitianhere
//        Output: indni
//        Explanation: Substring from index 1 to index 5 is the longest substring.

public class LongestPalindromeExample {

    private static String longestPalindrome(String s1) {

        String longest_palindrome="";

        for(int i=0;i<s1.length();i++){

            for(int j=i+1;j<s1.length();j++){

                String sub= s1.substring(i,j);
                if(isPalindrome(sub) && sub.length()>longest_palindrome.length()){

                    longest_palindrome=sub;
                }
            }
        }
        return longest_palindrome;
    }

    private static boolean isPalindrome(String sub) {

        StringBuilder stringBuilder= new StringBuilder(sub);

        return sub.equals(stringBuilder.reverse().toString());
    }


    public static void main(String[] args) {

        String s1="findnitianhere";
        System.out.println(longestPalindrome(s1));

    }
}
