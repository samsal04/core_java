package com.apolis.stringmanipulation;

public class StringSubSquence {

    private static boolean subStringCheck(String s1, String s2) {

        int count=0;
        boolean result=false;

//        char[] original= ;

        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)==s2.charAt(count)){
                count++;
            }

        }

        return result;
    }
    public static void main(String[] args) {
        String s1= "asc";
        String s2= "ac";
        
        System.out.println(subStringCheck(s1,s2));
    }


}
