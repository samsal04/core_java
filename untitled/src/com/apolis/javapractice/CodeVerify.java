package com.apolis.javapractice;

import java.util.Arrays;

public class CodeVerify {
    public static void main(String[] args) {
//       int[] array = {1, 2, 3};
//        int[] arrayNew = new int[array.length + 1];
//
////        String[] arrayNew= new String[array.length+1];                    This does not work. the length of the array though initated as array.length+1 , becomes 2. and output is [I@4dd8dc3 and 0
////        arrayNew= new String[]{String.valueOf(array), "0"};
//        String string= Arrays.toString(array);
//        System.out.println(" This give string is : "+ string);
////        arrayNew = array;
//        System.out.println(arrayNew.length);
//        for (int i = 0; i < array.length; i++) {
//
////            System.out.println(arrayNew[i]);
//            System.out.println(array[i]);
//
//
//        }

      String s="abbd";


        for (int i=0;i<s.length();i++){

            for (int j=i+1;j<=s.length();j++){
//                    System.out.println(s.charAt(j));
                String sub=s.substring(i,j);
                System.out.println("The substring is "+sub);

            }
        }
    }
}
