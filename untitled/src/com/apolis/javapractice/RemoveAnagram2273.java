package com.apolis.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//You are given a 0-indexed string array words, where words[i] consists of lowercase English letters.
//In one operation, select any index i such that 0 < i < words.length and words[i - 1] and words[i] are anagrams,
//and delete words[i] from words. Keep performing this operation as long as you can select an index that satisfies the conditions.
//Return words after performing all operations.
//It can be shown that selecting the indices for each operation in any arbitrary order will lead to the same result.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or
//phrase using all the original letters exactly once. For example, "dacb" is an anagram of "abdc".
//
//        Example 1:
//        Input: words = ["abba","baba","bbaa","cd","cd"]
//        Output: ["abba","cd"]
//        Explanation:
//        One of the ways we can obtain the resultant array is by using the following operations:
//        - Since words[2] = "bbaa" and words[1] = "baba" are anagrams, we choose index 2 and delete words[2].
//        Now words = ["abba","baba","cd","cd"].
//        - Since words[1] = "baba" and words[0] = "abba" are anagrams, we choose index 1 and delete words[1].
//        Now words = ["abba","cd","cd"].
//        - Since words[2] = "cd" and words[1] = "cd" are anagrams, we choose index 2 and delete words[2].
//        Now words = ["abba","cd"].
//        We can no longer perform any operations, so ["abba","cd"] is the final answer.
//
//        Example 2:
//        Input: words = ["a","b","c","d","e"]
//        Output: ["a","b","c","d","e"]
//        Explanation:
//        No two adjacent strings in words are anagrams of each other, so no operations are performed.
public class RemoveAnagram2273 {

    private static List<String> removeAnagram(String[] words) {

        List<String> list= new ArrayList<>();

        for(int i=0;i<words.length-1;i++){

            int j= i+1;

                if (isAnagram(words[i],words[j]) && j< words.length){
                        if (list.contains(words[i]) || list.contains(words[j])){
                            continue;
                        }else {
                            list.add(words[j]);
                        }
                }
                else {
                    continue;
                }



        }
            return list;
    }

    private static boolean isAnagram(String word1, String word2) {

        if(word1.length()!=word2.length()){
            return false;
        }

        char[] word1Array= word1.toCharArray();
        char[] word2Array= word2.toCharArray();

      Arrays.sort(word1Array);
      Arrays.sort(word2Array);

      for(int i=0;i<word2Array.length;i++){
          if(word1Array[i] != word2Array[i]){
              return false;
          }
      }
        return true;
    }
//    public List<String> removeAnagrams(String[] words) {
//        List<String> list = new ArrayList<>(Arrays.asList(words));
//
//        int i = 0;
//        while(i < list.size()-1) {
//            String word1 = list.get(i);
//            String word2 = list.get(i+1);
//            boolean isAnagram = checkAnagram(word1, word2);
//            if(isAnagram) {
//                list.remove(word2);
//                i=0;
//            }
//            else {
//                i++;
//            }
//        }
//        return list;
//
//    }
//    private static boolean checkAnagram(String word1, String word2) {
//
//        if(word1.length()!=word2.length()){
//            return false;
//        }
//
//        char[] word1Array= word1.toCharArray();
//        char[] word2Array= word2.toCharArray();
//
//        Arrays.sort(word1Array);
//        Arrays.sort(word2Array);
//
//        for(int i=0;i<word2Array.length;i++){
//            if(word1Array[i] != word2Array[i]){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {

        String[] words={"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagram(words));
    }
}
