package com.apolis.stringmanipulation;

import java.util.Arrays;
// find the length of last word in string
public class LengthOfLastWord {

    private static int word(String s){
        int count=0;

        String[] string= s.split(" ");

        return string[string.length-1].length();


    }

    public static void main(String[] args) {
        String s= " Hello world";
        System.out.println(word(s));
    }
}
