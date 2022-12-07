package com.apolis.javapractice;

//can you find missing number in given array
//     int sum = ((n + 1) * (n + 2)) / 2;


public class FindMissingNumber {
    private static int number(int[] array) {

        int n=array.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= array[i];
        return sum;

    }


    public static void main(String[] args) {

        int[] array= {1, 2, 4, 6, 3, 7, 8};

        System.out.println(number(array));

    }


}
