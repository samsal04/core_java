package com.apolis.stringmanipulation;

import java.util.Arrays;

//Reverse words in a given String
//
//        Input: s = “geeks quiz practice code”
//        Output: s = “code practice quiz geeks”
public class ReverseWords {
    private static String reverse(String s) {



//        System.out.println(Arrays.toString(s.split(" ")));
//        String temp="";
//       int first=0;
//       int last=array.length-1;
//        while(first!= last){
//
//            temp = array[first];
//            array[first]=array[last];
//            array[last]=temp;
//            first++;
//            last--;
//
//        }
        String[] array= s.split(" ");
        StringBuilder stringBuilder= new StringBuilder();

        for (int i=array.length-1;i>=0;i--){

            stringBuilder.append(array[i]+" ");

        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        String s="geeks quiz practice code";

        System.out.println(reverse(s));
    }


}
