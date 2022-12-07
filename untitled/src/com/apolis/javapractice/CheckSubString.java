package com.apolis.javapractice;

public class CheckSubString {
    private static boolean checkSubstring(String s, String t) {

        for(int i=0;i<s.length();i++){

            for (int j=i+1;j<s.length();j++){
                String sub= s.substring(i,j);
                if(sub.equals(t)){
                    System.out.println("Index for the given substring:"+i+" to "+j);
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s="askjndaaadfgjknf";
        String t="aaa";

        System.out.println(checkSubstring(s,t));
    }
}
