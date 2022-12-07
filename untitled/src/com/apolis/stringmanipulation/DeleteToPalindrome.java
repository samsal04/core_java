package com.apolis.stringmanipulation;

import java.util.Arrays;

//Given a string of size ‘n’. The task is to remove or delete the minimum number of characters from the string so that the resultant string is a palindrome.
//
//        Note: The order of characters should be maintained.
//
//        Examples :
//
//        Input : aebcbda
//        Output : 2
//        Remove characters 'e' and 'd'
//        Resultant string will be 'abcba'
//        which is a palindromic string
//
//        Input : geeksforgeeks
//        Output : 8
public class DeleteToPalindrome {
    private static int string(String s) {

        char[] chars= s.toCharArray();
        String reverse=isPalindrome(s);
        char[] reverseChars=reverse.toCharArray();

        int first=0;
        int last=chars.length-1;





        return 0;
    }

    private static String isPalindrome(String chars) {

        StringBuilder stringBuilder= new StringBuilder(chars);
//        System.out.println("real: "+ chars+ " reversed: "+stringBuilder.reverse());
       return String.valueOf(stringBuilder.reverse());
    }

    public static void main(String[] args) {
        String s="aebcbda";

        System.out.println(string(s));
    }


}
