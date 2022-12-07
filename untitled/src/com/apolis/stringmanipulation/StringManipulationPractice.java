package com.apolis.stringmanipulation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Collectors;

public class StringManipulationPractice {

    public static void main(String[] args) {
        String s1= " abcdefgh";
        String s2=" pqrsteuv";
        String s3= " abcdefgh";
        String s4="asdajdan              a  sdfafasf";
        String s5="";
        String s6="aBcdEfgH";
        // equals
//        System.out.println( s1.equals(s3));
//        //concat
//        System.out.println( s1.concat(s2));
//        System.out.println( s1.toLowerCase());
//        System.out.println( s2.toUpperCase());
//        System.out.println( s4.trim());
//        System.out.println( s4.substring(2,6));
//        System.out.println( s4.replace('s','1'));
//
//        System.out.println( s1.isEmpty());
//        System.out.println(s5.isEmpty());
//        System.out.println(s3.equalsIgnoreCase(s1));


        String s11= "Hello  high java d ";
       // System.out.println(Arrays.asList(s11).stream().filter(s->s.contains('h')).count());
        String[] string1= s11.split(" ");
        System.out.println(Arrays.toString(string1));

        char[] charArray=s4.toCharArray();

        String s8= String.valueOf(charArray);

        System.out.println(s8);
        String s34= "Santhosh";

        s34.toCharArray();



//        Arrays.asList(charArray).stream().max(Comparator.comparing(char[]::valueOf));



        for(int i=0;i<s1.length();i++){

            System.out.println( s1.charAt(i));

        }

    }
}
