package com.apolis.stringmanipulation;
//Given a string s, find the length of the longest substring
// without repeating characters.
//
//        Example 1:
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//
//        Example 2:
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//
//        Example 3:
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


import java.util.Arrays;

    public class LongestSubString {
        private static int substring(String str) {

//            if(string.isEmpty()){
//                return 0;
//            }
//
//            String longest="";
//
//            for(int i=0;i<string.length();i++){
//
//                for(int j=i+1;j<string.length();j++){
//
//                    String sub= string.substring(i,j);
//                    if (isUnique(sub) && sub.length()>longest.length()){
//                        longest=sub;
//                    }
//
//                }
//            }
//
//            return longest.length();
//        }
//
//        private static boolean isUnique(String sub) {
//
//           char[] chars= sub.toCharArray();
//           Arrays.sort(chars);
////            for(int i=0;i<chars.length-1;i++) {
////                System.out.println("sorted chart array: " + chars[i]);
////            }
//            for(int i=0;i<chars.length-1;i++){
//                if (chars[i]==chars[i+1]){
//                    return false;
//                }
//
//            }
////            System.out.println("==========================");
//            return true;
            int[] lastSeen = new int[128];
            int start = 0;
            int maxLen = 0;
            int maxStart = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (lastSeen[c] > start) {
                    start = lastSeen[c];
                    System.out.println(start);
                }
                if (i - start + 1 > maxLen) {
                    maxLen = i - start + 1;
                    maxStart = start;
                }
                lastSeen[c] = i + 1;
            }
            String string= str.substring(maxStart, maxStart + maxLen);
            return string.length();
        }

        public static void main(String[] args) {
            String string= "au";

            System.out.println(substring(string));
        }


}
