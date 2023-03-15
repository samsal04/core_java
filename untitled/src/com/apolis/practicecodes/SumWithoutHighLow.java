package com.apolis.practicecodes;
//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
//Mind the input validation.
//
//        Example
//
//        { 6, 2, 1, 8, 10 } => 16
//        { 1, 1, 11, 2, 3 } => 6

import java.util.Arrays;

public class SumWithoutHighLow {
    private static int sum(int[] numbers) {

       if(numbers==null|| numbers.length==1 || numbers.equals(null)){
           return 0;
       }

        int min= Arrays.stream(numbers).min().getAsInt();
        int max= Arrays.stream(numbers).max().getAsInt();

         int sum=Arrays.stream(numbers).sum();

         return sum-(min+max);

    }
    private static int[] invert(int[] numbers) {

        if(numbers==null){
            return numbers;
        }

        for (int i=0;i<numbers.length;i++){

            numbers[i]=numbers[i]*-1;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers={ 6, 2, 1, 8, 10 };
        System.out.println(sum(numbers));
        System.out.println(Arrays.toString(invert(numbers)));
    }
}
