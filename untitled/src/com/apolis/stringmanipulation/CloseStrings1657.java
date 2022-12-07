package com.apolis.stringmanipulation;
//Two strings are considered close if you can attain one from the other using the following operations:
//Operation 1: Swap any two existing characters.
//            For example, abcde -> aecdb
//Operation 2: Transform every occurrence of one existing character into another existing character,
//             and do the same with the other character.
//            For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
//
//You can use the operations on either string as many times as necessary.
//Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
//
//        Example 1:
//        Input: word1 = "abc", word2 = "bca"
//        Output: true
//        Explanation: You can attain word2 from word1 in 2 operations.
//        Apply Operation 1: "abc" -> "acb"
//        Apply Operation 1: "acb" -> "bca"
//
//        Example 2:
//        Input: word1 = "a", word2 = "aa"
//        Output: false
//        Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
//
//        Example 3:
//        Input: word1 = "cabbba", word2 = "abbccc"
//        Output: true
//        Explanation: You can attain word2 from word1 in 3 operations.
//        Apply Operation 1: "cabbba" -> "caabbb"
//        Apply Operation 2: "caabbb" -> "baaccc"
//        Apply Operation 2: "baaccc" -> "abbccc"



import java.util.Arrays;


public class CloseStrings1657 {
    private static boolean closeStrings(String word1, String word2) {

        if(word1.length()!=word2.length()){
            return false;
        }

        int[] occurence1= new int[26];
        int[] occurence2= new int[26];

//        HashMap<Character,Integer> map1= new HashMap<>();
//        HashMap<Character,Integer> map2= new HashMap<>();

        for(int i=0;i<word1.length();i++){

            System.out.println(word1.charAt(i)-'a');
            System.out.println(word2.charAt(i)-'a');


        occurence1[word1.charAt(i)-'a']++;
        occurence2[word2.charAt(i)-'a']++;

//        map1.compute(word1.charAt(i),(key,value)->(value==null)?1:value+1);
//        map2.compute(word2.charAt(i),(key,value)->(value==null)?1:value+1);

        }

        for(int i=0;i<26;i++){
            if(occurence1[i]>0 && occurence2[i]==0){
                return false;
            }

            if(occurence2[i]>0 && occurence1[i]==0){
                return false;
            }
        }

        System.out.println(Arrays.toString(occurence1));
        System.out.println(Arrays.toString(occurence2));


        Arrays.sort(occurence1);
        Arrays.sort(occurence2);

        return Arrays.equals(occurence1,occurence2);


//        System.out.println(Arrays.toString(occurence1));
//        System.out.println(Arrays.toString(occurence2));

    }



    public static void main(String[] args) {
        String word1="cabbba";
        String word2="abbccc";
        
        System.out.println(closeStrings(word1,word2));
    }
}
