package com.apolis.javapractice;
//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.

import java.util.Arrays;

public class SquareSumFunction {
    private static int squareSum(int[] n) {

        return Arrays.stream(n).map(s->s*s).sum();

    }

    public static void main(String[] args) {
        int[] n={1, 2, 2};
        System.out.println(squareSum(n));
    }
}
