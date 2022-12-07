package com.apolis.javapractice;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
//How to compute the first character of a string that is not repeated?


public class FirstNonRepeated {

    public static char character(String string){

        char[] chars=string.toCharArray();
        char distinct;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int count=0;

        for(int i=0;i<chars.length;i++){

            if(hashMap.containsKey(chars[i])){
                count=hashMap.get(chars[i]);
                hashMap.put(chars[i],count);
            }
            else {
                hashMap.put(chars[i],1);
            }
        }



//        for(int i=0;i<chars.length;i++){
//
//            for (int j=0;j<chars.length;j++){
//                if(chars[i]==chars[j]){
//                    continue;
//                }
//                else if(chars[i]!=chars[j] && j==chars[chars.length-1]){
//                    return chars[j];
//                }
//            }
//        }


        return '0';
    }

    public static void main(String[] args) {
        String string= "this is a string";

        System.out.println(character(string));
    }
}
