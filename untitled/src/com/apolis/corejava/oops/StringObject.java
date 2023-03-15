package com.apolis.corejava.oops;

public class StringObject {
    public static void main(String[] args) {
        // how many ways you can create string
        String s1= "way to create a string";
        //1  object -> new -> heap
        //2 object -> literal -> String Constant pool
        String s2= new String("way to create a string");


        // intern method is used to get reference from SCP
        System.out.println(s1.intern());
        System.out.println(s1.intern().hashCode()==s2.hashCode());
    }
}
