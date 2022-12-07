package com.apolis.stringmanipulation;

import java.util.Arrays;

//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//
//        Example 1:
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix amongst the input strings

/*  Logic:
    1) create prefix string equal to the first element of string
    2) traverse through the array and use a while loop to find the common prefix
    3) use indexOf method to find the occurrence of prefix in the next string
    4) find the substring of prefix that matches the prefix in the given string

 */
public class LongestCommonPrefixDemo {
    private static String longestPrefix(String[] string) {

        String prefix=string[0];
//        System.out.println(Arrays.toString(string));
        for(int i=0;i<string.length;i++) {

            while (string[i].indexOf(prefix)!=0) {
                prefix=prefix.substring(0,prefix.length()-1);
//                System.out.println(prefix);
            }
        }

        return prefix;

    }
    public static void main(String[] args) {
        String[] string={"flower","flow","flight"};
        System.out.println(longestPrefix(string));
    }
}
