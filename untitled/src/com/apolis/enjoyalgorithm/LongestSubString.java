package com.apolis.enjoyalgorithm;

import java.util.ArrayList;
import java.util.List;

//Write a program to find the length of the longest substring without repeating characters.
//
//Example:
//Input: string="abcbbcab"            Output:3
//Input: string="bbbbb"               Output:1
public class LongestSubString {
    private static int subString(String string) {
        int longest=0;
        int start=0;
        int end=1;
        int currentLongest=1;
        List<Character> list= new ArrayList<>();
        list.add(string.charAt(0));

        while(end<string.length()){

            if(list.contains(string.charAt(end))){
                System.out.println(string.substring(start,end));
                if(currentLongest>=longest){
                    longest=currentLongest;
                }
                list.clear();
                start++;
                list.add(string.charAt(start));
                end=start+1;
                currentLongest=1;

            }
            else {
                list.add(string.charAt(end));
                currentLongest++;
                end++;
            }


        }

        return longest;
    }
    public static void main(String[] args) {
        String string="bbbbb";
        System.out.println(subString(string));
    }
}
