package com.apolis.repeated;

import java.util.HashMap;

//find the first non-repeating character from string - String str = "qqqsddessff";
public class FirstNonRepeatingChar {
    private static int unique(String str) {

        HashMap<Character,Integer> map= new HashMap<>();

        for (int i=0;i<str.length();i++){


            map.compute(str.charAt(i),(key, value)-> (value ==null)?1:value+1);

        }

        for (int i=0;i<str.length();i++){

            if(map.get(str.charAt(i))==1){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        String str= "qqqsddessff";
        System.out.println(unique(str));
    }
}
