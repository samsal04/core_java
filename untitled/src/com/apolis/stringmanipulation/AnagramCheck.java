package com.apolis.stringmanipulation;

import java.util.Arrays;

//Two strings are called anagrams if they contain same set of characters but in different order.
//
//        "keep ? peek", "Mother In Law - Hitler Woman"
public class AnagramCheck {
    private static boolean anagram(String s1, String s2) {

        char[] char1= s1.trim().toCharArray();
        char[] char2= s2.trim().toCharArray();
        if (char1.length!=char2.length){
            return false;
        }

       boolean check=false;
       Arrays.sort(char1);
       Arrays.sort(char2);

       for(int i=0;i<char1.length;i++){

           if (char1[i]==char2[i]){
               check=true;
           }else{
               check=false;
           }
       }
        return check;
    }


    public static void main(String[] args) {

        String s1= "Mother In Law";
        String s2= "Hitler Woman";

        System.out.println(anagram(s1,s2));

    }


}
