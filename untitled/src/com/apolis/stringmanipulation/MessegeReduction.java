package com.apolis.stringmanipulation;

//With the original string, we want to reduce the size of the string by combining the same characters.
//We will compress the string in the form of character + number of character occurrence.
//For example, if we had string aabbbbbbbvvd, it will be changed to a2b7v2d1.
//If the length of compressed string is not smaller than the original one, just keep the original one.

import java.util.HashMap;

public class MessegeReduction {
    private static String message(String s) {

        HashMap<Character,Integer> map= new HashMap<>();

        for (int i=0;i<s.length();i++){

            map.compute(s.charAt(i),(key, value)->(value==null)?1:value+1);

        }

//        System.out.println(map);
        StringBuilder stringBuilder= new StringBuilder();

        map.forEach((key, value)->{

            stringBuilder.append(key).append(value);

        });
        

        return String.valueOf(stringBuilder);
    }
    public static void main(String[] args) {

        String s="aabbbbbbbvvd";
        System.out.println(message(s));

    }
}
