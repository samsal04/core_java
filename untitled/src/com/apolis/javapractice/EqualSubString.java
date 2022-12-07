package com.apolis.javapractice;

import java.util.Arrays;

//Given a string that consists of only 0s, 1s and 2s, count the number of substrings that have an equal number of 0s, 1s, and 2s.
//
//        Examples:
//
//        Input: str = “0102010”
//        Output:  2
//        Explanation: Substring str[2, 4] = “102” and substring str[4, 6] = “201” has equal number of 0, 1 and 2
//
//        Input: str = “102100211”
//        Output: 5
public class EqualSubString {
    private static int subString(String s) {
        char[] chars= s.toCharArray();
        String sub="";
        int count=0;

        for (int i=0;i<chars.length;i++){

            for (int j=i+1;j<chars.length;j++){
                sub=s.substring(i,j);

                if(isUnique(sub)){
                    count++;
                }
            }

        }
        return count-chars.length;
    }

    private static boolean isUnique(String sub) {
        char[] chars= sub.toCharArray();

        Arrays.sort(chars);

        for(int i=0;i<chars.length-1;i++){
            if (chars[i]==chars[i+1]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s="102100211";
        System.out.println(subString(s));
    }


}
