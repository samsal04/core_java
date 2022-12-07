package com.apolis.javapractice;

import java.util.Arrays;

//Given three strings S, S1, and S2 consisting of N, M, and K characters respectively,
// the task is to modify the string S by replacing all the substrings S1 with the string S2 in the string S.
//        Examples:
//        Input: S = “abababa”, S1 = “aba”, S2 = “a”
//        Output: aba
//        Explanation:
//        Change the substrings S[0, 2] and S[4, 6](= S1) to the string S2(= “a”) modifies the string S to “aba”. Therefore, print “aba”.
//        Input: S = “geeksforgeeks”, S1 = “eek”, S2 = “ok”
//        Output: goksforgoks
public class StringModify {
    private static String string(String s, String s1, String s2) {
        char[] chars=s.toCharArray();
        char[] chars1=s1.toCharArray();
        char[] chars2=s2.toCharArray();
        String sub="";
       StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<chars.length;i++) {
           if( (s.substring(i, i+s1.length()-1).equals(s1)) ){
//               sub=s.substring(i,s1.length()-1);
               sub=s2;
               stringBuilder.append(sub);
           }
           else {
               stringBuilder.append(chars[i]);
           }
        }
        return String.valueOf(stringBuilder);
    }
    public static void main(String[] args) {
        String s = "abababa";
        String s1 = "aba";
        String s2 = "a";
        System.out.println(string(s,s1,s2));
    }
}
