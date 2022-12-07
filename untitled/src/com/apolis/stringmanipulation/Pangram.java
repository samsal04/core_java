package com.apolis.stringmanipulation;

import java.util.HashMap;

//Given a string Str. The task is to check if it is Pangram or not.
//A pangram is a sentence containing every letter in the English Alphabet.
//
//        Examples:
//
//        Input: “The quick brown fox jumps over the lazy dog”
//        Output: is a Pangram
//        Explanation: Contains all the characters from ‘a’ to ‘z’]
public class Pangram {
    private static boolean pangram(String s) {
        boolean flag=false;
        s=s.toLowerCase().replace(" ","");
//       s=s.trim();
        char[] array=s.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<array.length;i++){

            if(map.containsKey(array[i])){

                map.put(array[i], map.get(array[i])+1);
            }else {
                map.put(array[i],i);
            }
        }
        System.out.println(map);

        char[] charArray=new char[26];
        for(int i=0;i<array.length;i++){

          if(array[i]<='z' && array[i]>='a'){

          }
        }

        System.out.println(String.valueOf(charArray));

        return map.size()==charArray.length;
    }
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        System.out.println(pangram(s));

    }
}
