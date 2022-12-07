package com.apolis.javapractice;

//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//        Example 1:
//        Input: n = 2
//        Output: 2
//        Explanation: There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps
//
//        Example 2:
//        Input: n = 3
//        Output: 3
//        Explanation: There are three ways to climb to the top.
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step

//  fibanoccis series , a=1,b=2,3,5,8,13...

public class ClimbingStairs {
    private static int climb(int n) {

         // way 1= all 1   way2= all 2   way 3 = 1 +2  way 4= 2+1   n!/ (n-r)!
//        int count=0;
//
//        if (n==1){
//            return 1;
//
//        }
//        if (n==2){
//            return 2;
//        }
//        int numerator= factorial(n);
//        int denomenator= factorial(n-2);
//
//        System.out.println(numerator+"   "+ denomenator);
//        count= numerator/ denomenator ;
////        System.out.println(count);
//
//
//        return count;
        if(n <= 3){
            return n;
        }
        int a = 3, b = 2;
        for(int i = 0; i < n-3; i++){
            a = a + b;
            b = a - b;
        }
        return a;
    }

    private static int factorial(int n) {

        if (n==1){
            return 1;
        }
        else {
              //  System.out.println(n);
            return n * factorial(n - 1);

        }
    }

    public static void main(String[] args) {

        int n=14;
        System.out.println(climb(n));

    }


}
