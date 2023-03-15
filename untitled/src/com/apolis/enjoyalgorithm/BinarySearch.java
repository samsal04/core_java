package com.apolis.enjoyalgorithm;

import java.lang.reflect.Array;

//Given a sorted array of n elements, search a given element key in array. If the key exists then
//return its index in the sorted array. Otherwise, return -1;
//
//Example 1:
//
//input: array[]={-4,2,4,5,9,12}  key=5   output:3
public class BinarySearch {
    private static int binarySearch(int[] array, int key, int left, int right) {

        if(left<=right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
               return binarySearch(array, key, mid + 1, right);
            } else if (array[mid] > key) {
               return binarySearch(array, key, left, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {-4, 2, 4, 5, 9, 12};
        int key = 5;
        int left = 0;
        int right = array.length - 1;
        System.out.println(binarySearch(array, key, left, right));
    }
}
