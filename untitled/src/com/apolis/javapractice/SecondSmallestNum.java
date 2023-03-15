package com.apolis.javapractice;

import java.util.Arrays;
import java.util.Collections;

// Write a function that takes an array of integers and returns a new array that contains all the even numbers from the original array.
//Write a function that takes an array of integers and returns the second smallest number in the array.
public class SecondSmallestNum {
    private static int second(int[] array) {

        int min=array[0];


//        for(int i=1;i< array.length;i++){
//
//            if(array[i]<min){
//                secondMin=min;
//                min= array[i];
//            }
//
//        }
//       int secondMin= Arrays.stream(array).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        int secondElement = Arrays.stream(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

         int[] arr=Arrays.stream(array).filter(e->e%2==0).toArray();
         int[] arr1=Arrays.stream(array).filter(n->n%2!=0).toArray();
         System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        return secondElement;
    }
    public static void main(String[] args) {

        int[] array={2,3,6,8,10,15,35,20,12};
        System.out.println("second ele "+second(array));

    }
}
