package com.apolis.stringmanipulation;
//Given a string s, return the longest palindromic substring in s.
//
//        Example 1:
//        Input: s = "babad"
//        Output: "bab"
//        Explanation: "aba" is also a valid answer.
//
//        Example 2:
//        Input: s = "cbbd"
//        Output: "bb"

public class LongestPalindromSub {
        private static String palindrome(String s) {

            if(s.length()==1){
                return s;
            }

            String longest="";

            for (int i=0;i<s.length();i++){

                for (int j=i+1;j<=s.length();j++){
//                    System.out.println(s.charAt(j));
                  String sub=s.substring(i,j);
                    System.out.println(sub);
                  if (isPalindrome(sub) && sub.length()>longest.length()){
                      longest=sub;
                  }
                }
            }
            return longest;
        }

        private static boolean isPalindrome(String sub) {
//                System.out.println(sub);
            StringBuilder stringBuilder=new StringBuilder(sub);

            if (sub.equals(String.valueOf(stringBuilder.reverse()))){
//                System.out.println(stringBuilder.reverse());
                return true;
            }
            return false;
        }


        public static void main(String[] args) {
            String s= "aa";
            System.out.println(palindrome(s));
        }


    }
