package com.apolis.stringmanipulation;

public class SpaceRemoveString {

    public static String remove(String s){

        return s.replace(" ","");

    }



    public static void main(String[] args) {

        String s=" This is the string";

        System.out.println(remove(s));


    }
}
