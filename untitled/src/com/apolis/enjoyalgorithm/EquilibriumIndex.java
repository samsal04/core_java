package com.apolis.enjoyalgorithm;

//Write a program to find the equilibrium index of an array. The equilibrium index of an array is
//an index such that sum of elements on teh lower indexes is equal to sum of elements at
//higher indexes.
//
//Example:
//
//    input: array[]={-7,1,5,2,-4,3,0}  output: 3

import java.util.Arrays;

public class EquilibriumIndex {
    private static int equilibrium(int[] array) {
//        int left = 1;
//        int leftSum = array[0];
//        int right = array.length - 2;
//        int rightSum = array[array.length - 1];
//        int result = 0;
//
//        while (left < right) {
//
//            if (leftSum == rightSum) {
//                return left;
//            } else if (leftSum > rightSum) {
//                right--;
//                rightSum += array[right];
//            } else {
//                left++;
//                leftSum += array[left];
//            }
//
//
//        }
//        return -1;
        int leftSum = 0;
        int sum = 0;
        int rightsum = 0;

        sum = Arrays.stream(array).sum();
//        System.out.println(sum);
        for (int i = 0; i < array.length; i++) {

            sum = sum - array[i];

            if (sum == leftSum) {
                return i;
            }
            leftSum += array[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {-7, 1, 5, 2, -4, 3, 0};
        int[] array1 = {0, 1, 3, -2, -1};
        int[] array2 = {1, 2, -2, -1};

        System.out.println(equilibrium(array));
        System.out.println(equilibrium(array1));
        System.out.println(equilibrium(array2));

    }
}
