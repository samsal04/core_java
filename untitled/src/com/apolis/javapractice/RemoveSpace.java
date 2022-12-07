package com.apolis.javapractice;

public class RemoveSpace {

    private static String spaceRemove(String s) {

        return s.replace(" ","");


    }
    public static void main(String[] args) {
        String s="This is another test";
        System.out.println(spaceRemove(s));
    }


}
