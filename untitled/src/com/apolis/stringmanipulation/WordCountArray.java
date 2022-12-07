package com.apolis.stringmanipulation;

public class WordCountArray {
    private static int count(String s) {
        String[] string=s.split(" ");
        return string.length;
    }
    public static void main(String[] args) {
        String s="This is a test";
        System.out.println(count(s));
    }
}
