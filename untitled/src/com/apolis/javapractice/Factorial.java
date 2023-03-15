package com.apolis.javapractice;
// You have a large file that you need to read. How can you improve the bufferreader to handle these large file read
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
