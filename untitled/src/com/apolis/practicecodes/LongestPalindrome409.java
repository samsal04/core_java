package com.apolis.practicecodes;
//Given a string s which consists of lowercase or uppercase letters,
//return the length of the longest palindrome that can be built with those letters.
//Letters are case sensitive, for example,"Aa" is not considered a palindrome here.
//
//        Example 1:
//        Input: s = "abccccdd"
//        Output: 7
//        Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
//
//        Example 2:
//        Input: s = "a"
//        Output: 1
//        Explanation: The longest palindrome that can be built is "a", whose length is 1.

import java.util.Arrays;

public class LongestPalindrome409 {
    private static int lognestPalindrome(String s) {

        int[] array=new int[256];

        for (int i=0;i<s.length();i++){

            array[s.charAt(i)]++;
        }
        System.out.println(Arrays.toString(array));

        int count=0;
        boolean flag = false;
        for(int i=0;i<256;i++){

            if(array[i]>0 && array[i]%2==0){
                count=count+array[i];
            }
            else if(array[i]>0 && array[i]%2!=0){

                if (!flag){
                    count=count+array[i];
                    flag= true;
                }else if(array[i]>1){
                    count=count+(array[i]-1);
                }
            }

        }

        return count;

    }
    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(lognestPalindrome(s));
    }
}
