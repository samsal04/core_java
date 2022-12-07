package com.apolis.stringmanipulation;
//Given a set of strings, find the longest common prefix.
//        Examples:
//
//
//        Input: {"geeksforgeeks", "geeks", "geek", "geezer"}
//        Output: "gee"
//
//        Input: {"apple", "ape", "april"}
//        Output: "ap"
public class LongestCommonPrefix {
    private static String string(String[] array) {

        String prefix=array[0];
        for(int i=0;i<array.length;i++){
            while (array[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
//        System.out.println(prefix);
        return prefix;

    }

    public static void main(String[] args) {

        String[] array= {"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println(string(array));

    }


}
