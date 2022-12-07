package com.apolis.practicecodes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestSubStringExample {
    public static void main(String[] args) {
        String s1="acddddd";
        String s2="ddddd";

        System.out.println(longestSubString(s1,s2));
    }

    private static String longestSubString(String s1, String s2) {



        for(int i=0;i<s1.length();i++){

            for(int j=i+1;j<s1.length();j++){

                String sub=s1.substring(i,j);
                if(checkString(sub,s2)){
                    return "the matching substring is "+sub;
                }
            }
        }
        return "false";
    }

    private static boolean checkString(String sub, String target) {

        char[] subString=sub.toCharArray();
        char[] targetArray= target.toCharArray();

        Arrays.sort(subString);
        Arrays.sort(targetArray);

        return Arrays.equals(subString,targetArray);
    }

}
