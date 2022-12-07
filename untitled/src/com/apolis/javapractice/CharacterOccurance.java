package com.apolis.javapractice;

import java.util.HashMap;

// Count the number of times the character appears in the String
public class CharacterOccurance {

    private static HashMap<Character,Integer> characterCount(String s) {

        HashMap<Character,Integer> count= new HashMap<>();
        int counter=0;
        for(int i=0;i<s.length();i++){

            if (count.containsKey(s.charAt(i))){
                counter=count.get(s.charAt(i));
                count.put(s.charAt(i),counter+1);
            }
            else {
                count.put(s.charAt(i),1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s= " this is another test";
        System.out.println(characterCount(s));

    }


}
