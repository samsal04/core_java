package com.apolis.stringmanipulation;
//Input: S = "aaaabbaa" Output: aabbaa Explanation:
//        The longest Palindromic substring is "aabbaa".
//        Example 2: Input: S = "abc" Output: a
//        Explanation: "a", "b" and "c" are the longest palindromes with same length
public class LongestPalindrome {

    public static String palindrome(String s){

        String palindrome="";

        for(int i=0;i<s.length()-1;i++){

            for (int j=i+1;j<=s.length();j++){
                String subString= s.substring(i,j);

                if(isPalindrome(subString) && subString.length()>palindrome.length()){

                    palindrome=subString;
                }
            }

        }

        return  palindrome;
    }

    public static boolean isPalindrome(String s){

        StringBuilder string= new StringBuilder(s);
      if( s.equals(string.reverse().toString())){
          return  true;
      }

      return false;
    }


    public static void main(String[] args) {

       String s = "aaaabbaa";

       System.out.println(palindrome(s));
    }
}
