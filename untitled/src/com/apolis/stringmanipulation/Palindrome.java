package com.apolis.stringmanipulation;

public class Palindrome {

    public static boolean palindrome(String s){

        StringBuffer stringBuffer= new StringBuffer(s);


        if(s.equals( String.valueOf(stringBuffer.reverse())) ) {
            return  true;
        }

//        String s1="";
//        for(int i=s.length()-1;i>=0;i--){
//            s1=s1+s.charAt(i);
//        }
//
//        if (s.equals(s1)){
//            return true;
//        }

        return false;
    }

    public static void main(String[] args) {

        String s=" This is the string";

        System.out.println(palindrome(s));


    }

}
