package com.apolis.javapractice;
//Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
//
//        Example 1:
//        Input: low = 3, high = 7
//        Output: 3
//        Explanation: The odd numbers between 3 and 7 are [3,5,7].
//
//        Example 2:
//        Input: low = 8, high = 10
//        Output: 1
//        Explanation: The odd numbers between 8 and 10 are [9]

public class CountOdds1523 {
    private static int coundOdds(int low, int high) {

//        int count=0;
//        int temp=low;
//        while(temp<=high){
//
//            if(temp%2==1){
//                count++;
//                temp=temp+2;
//            }
//            else {
//                count++;
//                temp=temp+2;
//
//            }
//
//
//        }
//        for(int i=low;i<=high;i++){
//            if(i%2==1){
//                count++;
//            }else if(i+1%2==1){
//                count++;
//            }
//        }
//        return count;
        return (high - low + 1 + low % 2) / 2;
    }
    public static void main(String[] args) {
        int low=3;
        int high=7;
        System.out.println(coundOdds(low, high));

    }
}
