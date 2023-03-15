package com.apolis.stringmanipulation;
//Given two strings text1 and text2, return the length of their longest common subsequence.
//If there is no common subsequence, return 0.
//A subsequence of a string is a new string generated from the original string with some characters
//(can be none) deleted without changing the relative order of the remaining characters.
//
//For example, "ace" is a subsequence of "abcde".
//A common subsequence of two strings is a subsequence that is common to both strings.
//
//       Example 1:
//        Input: text1 = "abcde", text2 = "ace"
//        Output: 3
//        Explanation: The longest common subsequence is "ace" and its length is 3.
//
//        Example 2:
//        Input: text1 = "abc", text2 = "abc"
//        Output: 3
//        Explanation: The longest common subsequence is "abc" and its length is 3.
//
//        Example 3:
//        Input: text1 = "abc", text2 = "def"
//        Output: 0
//        Explanation: There is no such common subsequence, so the result is 0.

import java.util.Arrays;

public class LongestCommonSub1143 {
    private static int longestCommonSubsequence(String text1, String text2) {
        int longest=0;
        int count=0;
        
        char[] array1=text1.toCharArray();
        char[] array2=text2.toCharArray();

        longest= (array1.length>=array2.length)?checkSubSeuence(array1,array2):checkSubSeuence(array2,array1);
        


//        int[] array1= new int[26];
//        int[] array2= new int[26];
//        int longest=0;
//
//        for(int i=0;i<text1.length();i++){
//
//            array1[text1.charAt(i)-'a']++;
//
//        }
//        for(int i=0;i<text2.length();i++){
//
//            array2[text2.charAt(i)-'a']++;
//
//        }
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        for(int i=0;i<array1.length;i++){
//            if(array1[i]!=0 && array1[i]==array2[i]){
//                longest++;
//            }
//
//        }
//
    return longest;

//        final int m=text1.length();
//        final int n=text2.length();
//
//        int[][] dp=new int[m+1][n+1];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.println( "i+1 and j+1 :"+dp[i+1][j+1]);
//                System.out.println( "i and j :"+dp[i][j]);
//                System.out.println("i and j+1 :"+ dp[i][j+1]);
//                System.out.println( "i+1 and j :"+dp[i+1][j]);
//                dp[i+1][j+1]=text1.charAt(i)==text2.charAt(j)?1+dp[i][j]:Math.max(dp[i][j+1],dp[i+1][j]);
//                System.out.println("==========================");
//            }
//        }
//        return dp[m][n];
    }

    private static int checkSubSeuence(char[] max, char[] min) {
        int count=0;
        int longest=1;
        for(int i=0;i<=min.length;i++){
//            System.out.println(text1.charAt(i));
//            System.out.println(text2.charAt(count));

            if(max[i]==min[count]){
                longest++;
                count++;
            }else{
                continue;
            }
//            System.out.println("==================");
        }

        return longest;
    }

    public static void main(String[] args) {
        String text1="abcde";
        String text2="ace";
        System.out.println(longestCommonSubsequence(text1,text2));
    }
}
