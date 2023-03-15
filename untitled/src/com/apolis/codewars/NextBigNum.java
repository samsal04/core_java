package com.apolis.codewars;
//Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits. For example:
//
//        12 ==> 21
//        513 ==> 531
//        2017 ==> 2071
//
//        nextBigger(num: 12)   // returns 21
//        nextBigger(num: 513)  // returns 531
//        nextBigger(num: 2017) // returns 2071
//
//        If the digits can't be rearranged to form a bigger number, return -1 (or nil in Swift):
//
//        9 ==> -1
//        111 ==> -1
//        531 ==> -1
//        1314 ==> 1341
//        nextBigger(num: 9)   // returns nil
//        nextBigger(num: 111) // returns nil
//        nextBigger(num: 531) // returns nil


import java.util.Arrays;

public class NextBigNum {
    private static long nextBiggerNum(long n) {

       char[] digits=Long.toString(n).toCharArray();

       int length= digits.length;

       int i;
       for (i=length-2;i>=0;i--){
           if(digits[i]<digits[i+1]){
               break;
           }
       }

       if(i<0){
           return -1;
       }

       int smallestIndex=i+1;
       for (int j=i+2;j<length;j++){
           if(digits[j]>digits[i] && digits[j]<digits[smallestIndex]){
               smallestIndex=j;
           }
       }

       char temp=digits[i];
       digits[i]=digits[smallestIndex];
       digits[smallestIndex]=temp;

        Arrays.sort(digits,i+1,length);

        return Long.parseLong(new String(digits));

    }
    public static void main(String[] args) {
        long n=2017;
        System.out.println(nextBiggerNum(n));
    }
}
