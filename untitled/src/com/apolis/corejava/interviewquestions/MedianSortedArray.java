package com.apolis.corejava.interviewquestions;

import java.util.Arrays;

//How to find a median of two sorts arrays?
public class MedianSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println(findMedian(arr1, arr2));
        
    }

    private static int findMedian(int[] arr1, int[] arr2) {
        int median=0;
        int arr1Length= arr1.length;
        int arr2Length=arr2.length;

        int[] mergedArray= new int[arr1Length+arr2Length];

        System.arraycopy(arr1,0,mergedArray,0,arr1Length);
        System.arraycopy(arr2,0,mergedArray,arr1Length,arr2Length);

        Arrays.sort(mergedArray);

        int mergedArrayLength= mergedArray.length;

        if(mergedArrayLength%2==0){
            int mid= mergedArrayLength/2;
            int middleElement= mergedArray[mid];
            int nextToMiddle=mergedArray[mid-1];

            return  (middleElement+nextToMiddle)/2;
        }
        else{
            int mid= Math.round(mergedArrayLength/2);
            return  mid;
        }
    }
}
