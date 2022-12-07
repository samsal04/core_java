package com.apolis.practicecodes;
// Given a set of strings, find the longest common prefix.
//
//         Input: {"geeksforgeeks", "geeks", "geek", "geezer"}
//         Output: "gee"
//
//         Input: {"apple", "ape", "april"}
//         Output: "ap"
public class LongestPrefixPractice {

    public static String prefix(String[] s){

        String prefix=s[0];

        for(int i=0;i<s.length;i++){

            while(s[i].indexOf(prefix)!=0){

                prefix=prefix.substring(0,prefix.length()-1);
               // System.out.println(prefix);
                if(prefix.isEmpty()){
                    return "";

                }
            }
        }



        return prefix;
    }

    public static void main(String[] args) {
        String[] s=  { "geeks", "geek", "geeksforgeeks","geezer"};

        System.out.println(prefix(s));
    }
}
