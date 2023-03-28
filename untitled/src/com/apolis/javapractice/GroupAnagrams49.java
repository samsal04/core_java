package com.apolis.javapractice;
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//typically using all the original letters exactly once.
//
//        Example 1:
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//        Example 2:
//        Input: strs = [""]
//        Output: [[""]]
//
//        Example 3:
//        Input: strs = ["a"]
//        Output: [["a"]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams49 {
    private static List<List<String>> groupAnagrams(String[] strs) {

        List<String> anagram= new ArrayList<>();
        List<List<String>> anagramList= new ArrayList<>();

        for(int i=0;i<strs.length;i++){

            String currentString= strs[i];
            char[] charArray= currentString.toCharArray();
            Arrays.sort(charArray);

            if(anagram.contains(charArray)){

            }
        }
        return anagramList;
    }
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
