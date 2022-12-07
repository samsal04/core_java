package com.apolis.stringmanipulation;

public class ReverseString {
    public static String reverse(String s){

        StringBuffer s1= new StringBuffer(s);
        s1.reverse();



        return s1.toString();
//        String s1="";
//        for(int i=s.length()-1;i>=0;i--){
//            s1=s1+s.charAt(i);
//        }
//        return s1;
    }
    public static void main(String[] args) {

        String s=" This is the string";

        System.out.println(reverse(s));


    }
}
