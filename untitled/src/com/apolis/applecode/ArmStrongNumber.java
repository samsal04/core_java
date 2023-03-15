package com.apolis.applecode;
//Given a number x, determine whether the given number is Armstrong number or not.
//
//        A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.
//
//        abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….
//        nput : 153
//
//        Output : Yes
//
//        153 is an Armstrong number.
//
//        1*1*1 + 5*5*5 + 3*3*3 = 153
//
//        Input : 120
//
//        Output : No
//
//        120 is not a Armstrong number.
//
//        1*1*1 + 2*2*2 + 0*0*0 = 9
//
//        Input : 1253
//
//        Output : No
//
//        1253 is not a Armstrong Number
//
//        1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723
//
//        Input : 1634
//
//        Output : Yes
//
//        1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
public class ArmStrongNumber {
    private static boolean armstrongNum(int number) {
        int originalNumber = number;
        int digits = (int) (Math.log10(number) + 1);
        int result = 0;
        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, digits);
            number = number / 10;
        }
        return originalNumber == result;
    }
    public static void main(String[] args) {
        int number=153;
        System.out.println(armstrongNum(number));
    }
}
