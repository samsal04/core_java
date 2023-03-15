package com.apolis.enjoyalgorithm;
//Given a Roman numeral, write a program to find its corresponding decimal value. Roman numerals are represented by
//seven different symbols.
//
//Symbol      value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
public class RomanToInteger {
    private static int romanToInt(String nums) {

        int result=0;

        for(int i=0;i<nums.length();i++){

            int current= getValue(nums.charAt(i));
            int next=0;

            if(i<nums.length()-1){
                next=getValue(nums.charAt(i+1));
            }else {
                next=0;
            }
            if(current<next){
                result -=current;
            }else {
                result+=current;
            }

        }

        return result;
    }

    private static int getValue(char charAt) {
        switch (charAt){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }

    public static void main(String[] args) {

        String nums="IVX";
        System.out.println(romanToInt(nums));
    }
}
