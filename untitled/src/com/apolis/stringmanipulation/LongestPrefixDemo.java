package com.apolis.stringmanipulation;

import java.util.Arrays;
import java.util.List;

// Given a set of strings, find the longest common prefix.
//
//         Input: {"geeksforgeeks", "geeks", "geek", "geezer"}
//         Output: "gee"
//
//         Input: {"apple", "ape", "april"}
//         Output: "ap"
public class LongestPrefixDemo {
    private static String prefix(String[] input) {
        String prefix=input[0];

        for(int i=0;i<input.length;i++){

            while (input[i].indexOf(prefix)!=0){
                prefix= prefix.substring(0,prefix.length()-1);
                System.out.println(prefix);
                if(prefix.isEmpty()){
                    return "";

                }
            }
        }
     return prefix;
    }

    public static void main(String[] args) {

        String[] input= {"apple", "ape", "april"};

        System.out.println(prefix(input));

    }


}
