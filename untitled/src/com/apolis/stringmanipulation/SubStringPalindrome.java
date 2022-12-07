package com.apolis.stringmanipulation;

//2.	Get all the palindrome substrings in the string
public class SubStringPalindrome {
    public static void main(String[] args) {

        String string1=" addccaddasdgggssass";
//        String longest="";

        for(int i=0;i<string1.length();i++){

            for(int j=i+1;j<=string1.length();j++){
                String subString= string1.substring(i,j);

                if(isPalindrome(subString)){

                 System.out.println("Substring : "+ subString);

                }

            }


        }

    }

    private static boolean isPalindrome(String subString) {
        StringBuilder subStrinCheck= new StringBuilder(subString);
        subStrinCheck.reverse();
        return subStrinCheck.toString().equals(subString);
    }
}
