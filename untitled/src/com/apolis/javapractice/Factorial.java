package com.apolis.javapractice;

public class Factorial {
    private static double factorial(int n) {

        if(n==1){
            return 1l;
        }
        else {
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        int n=50;
        System.out.println(factorial(n));
    }
}
