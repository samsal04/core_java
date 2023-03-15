package com.apolis.stringmanipulation;

import java.util.Arrays;

public class MultiplyStrings43 {

    private static String multiply(String num1, String num2) {

        final int m= num1.length();
        final int n= num2.length();

        StringBuilder stringBuilder= new StringBuilder();

        int[] position= new int[m+n];

        for(int i=m-1;i>=0;--i){

            for (int j=n-1;j>=0;--j){

                final int multiply= (num1.charAt(i)- '0') * (num2.charAt(j)- '0');
                final int sum= multiply+ position[ i+j+1];
                position[i+j]= position[i+j] + sum /10;
                position[i+j+1] = sum %10 ;
            }

        }
        for (final int p: position){
            if (p>0 || stringBuilder.length()>0){
                stringBuilder.append(Arrays.toString(position));
            }
        }




        return stringBuilder.length()==0?"0":stringBuilder.toString();
    }
    public static void main(String[] args) {

        String num1="2";
        String num2="3";

        System.out.println(multiply(num1, num2));
    }
}
