package com.apolis.stringmanipulation;
//Given two strings s and p, return an array of all the start indices of p's anagrams in s.
//You may return the answer in any order.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//typically using all the original letters exactly once.
//
//        Example 1:
//        Input: s = "cbaebabacd", p = "abc"
//        Output: [0,6]
//        Explanation:
//        The substring with start index = 0 is "cba", which is an anagram of "abc".
//        The substring with start index = 6 is "bac", which is an anagram of "abc".
//
//        Example 2:
//        Input: s = "abab", p = "ab"
//        Output: [0,1,2]
//        Explanation:
//        The substring with start index = 0 is "ab", which is an anagram of "ab".
//        The substring with start index = 1 is "ba", which is an anagram of "ab".
//        The substring with start index = 2 is "ab", which is an anagram of "ab".

/* Logic:
    1) traverse through the string such that each time you will increment the length of substring anagram check
    2) Inside the for loop create a substring that is equal to the length of anagram substring
    3) Check whether the given substring is anagram and if yes add the index to the list.
    4) Return the list.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagram438 {
    private static List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list= new ArrayList<>();
        int pLength=p.length();
        
        
        for(int i=0;i<=s.length()-pLength;i++){
            
//            for(int j=i+pLength;j<s.length();j++){
//
//                String sub= s.substring(i,j);
//                System.out.println(sub);
//                if(isAnagram(sub,p)){
//                    list.add(i);
//                }
//            }

            String sub= s.substring(i,i+pLength);
//            System.out.println(sub);
            if(isAnagram(sub,p)){
                list.add(i);
            }
        }
        
        return list;
    }

    private static boolean isAnagram(String sub,String p) {
        
       char[] subArray= sub.toCharArray();
       char[] pArray=p.toCharArray();



       Arrays.sort(subArray);
       Arrays.sort(pArray);
//        for(int i=0;i<subArray.length && i<pArray.length;i++){
//
//            if(subArray[i]!=pArray[i]){
//                return false;
//            }
//
//        }
        return Arrays.equals(subArray, pArray);
    }

    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        System.out.println(findAnagrams(s,p));
    }   
}
