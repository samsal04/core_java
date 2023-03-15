package com.apolis.javapractice;
//You are given a number N. You need to print the pattern for the given value of N.
//
//        For N = 2 the pattern will be
//        2 2 1 1
//        2 1
//
//        For N = 3 the pattern will be
//        3 3 3 2 2 2 1 1 1
//        3 3 2 2 1 1
//        3 2 1
//
//        Note: Instead of printing a new line print a "$" without quotes. After printing the total output,
//        end of the line is expected.
//
//        Example 1:
//        Input: 2
//        Output:
//        2 2 1 1 $2 1 $
//
//        Example 2:
//        Input: 3
//        Output:
//        3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
public class PrintPatternGFG1 {
    private static void printPat(int n) {

        int count=n;
        while(count>0) {

            for (int i = n; i > 0; i--) {

                for (int j = 0; j < count; j++) {

                    System.out.print(i+" ");
                }

            } System.out.print("$");

            count--;
        }

    }
    public static void main(String[] args) {
        int n=3;
        printPat(n);
    }
}
