package com.apolis.stringmanipulation;
//Given a string s, sort it in decreasing order based on the frequency of the characters.
//The frequency of a character is the number of times it appears in the string.
//Return the sorted string. If there are multiple answers, return any of them.
//
//        Example 1:
//        Input: s = "tree"
//        Output: "eert"
//        Explanation: 'e' appears twice while 'r' and 't' both appear once.
//        So 'e' must appear before both 'r' and 't'. Therefore, "eetr" is also a valid answer.
//
//        Example 2:
//        Input: s = "cccaaa"
//        Output: "aaaccc"
//        Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//        Note that "cacaca" is incorrect, as the same characters must be together.
//
//        Example 3:
//        Input: s = "Aabb"
//        Output: "bbAa"
//        Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
//        Note that 'A' and 'a' are treated as two different characters.

import java.util.*;
import java.util.stream.Collectors;

public class CharSortByFrequency451 {
    private static String frequencySort(String s) {

        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<s.length();i++){

            map.compute(s.charAt(i),(key,value)->(value==null)?1:value+1);

        }
        System.out.println(map);

//        int[] array= new int[26];
//
//
//        for(int i=0;i<s.length();i++){
//
//            array[s.charAt(i)-'a']++;
//
//        }
//        System.out.println("Before "+Arrays.toString(array));
//
//        Arrays.sort(array);


        List<Map.Entry> list=map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        System.out.println(list);

        return s;

    }
    public static void main(String[] args) {

        String s="cccaaaaasacascavasva";
        System.out.println(frequencySort(s));
    }
}
