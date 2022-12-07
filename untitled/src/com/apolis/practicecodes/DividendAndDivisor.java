package com.apolis.practicecodes;
//Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
//
//        The integer division should truncate toward zero, which means losing its fractional part.
//        For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
//
//        Return the quotient after dividing dividend by divisor.
//Input: dividend = 10, divisor = 3
//        Output: 3
//        Explanation: 10/3 = 3.33333.. which is truncated to 3.
//        Example 2:
//
//        Input: dividend = 7, divisor = -3
//        Output: -2
//        Explanation: 7/-3 = -2.33333.. which is truncated to -2.


public class DividendAndDivisor {

    public static int quotient(int dividend, int divisor){
        int num=0;
        return num=dividend/divisor;


    }

    public static void main(String[] args) {
        int dividend= 7;
        int divisor= -3;

        System.out.println(quotient(dividend,divisor));
    }
}
