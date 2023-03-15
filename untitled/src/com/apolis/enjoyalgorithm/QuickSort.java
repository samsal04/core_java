package com.apolis.enjoyalgorithm;

import java.util.Arrays;

public class QuickSort {
    private static int[] quickSort(int[] array,int left, int right) {

//        if(left<right){
//            int pivotIndex= partition(array,left,right);
//            quickSort(array,left,pivotIndex-1);
//            quickSort(array,pivotIndex+1,right);
//        }
//
//        return array;
//    }
//
//    private static int partition(int[] array, int left, int right) {
//        int pivot=array[right];
//        int i=left-1;
//        for (int j=left;j<right;j=j+1){
//
//            if(array[j]<pivot){
//                i=i+1;
//               swap(array[i],array[j]);
//            }
//        }
//        swap(array[i+1],array[right]);
//        return i+1;
//    }
//
//    private static void swap(int i, int i1) {
//        int temp= i;
//        i=i1;
//        i1=temp;

        if(array.length==0 || array==null) return array;

        if(left>=right) return array;

        // pick pivot
        int mid = left+(right-left)/2;
        int pivot= array[mid];

        //make left < pivot and right >pivot
        int i=left;
        int j=right;
        while(i<=j){
            while (array[i]<pivot){
                i++;
            }
            while (array[j]>pivot){
                j--;
            }

            if(i<=j){
                int temp=array[i];
                array[i]=array[j];
                array[i]=temp;
                i++;
                j--;
            }
        }

        //recursively sort sub parts
        if(left<j){
            quickSort(array,left,j);
        }
        if(right>i){
            quickSort(array,i,right);
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array={3,6,1,4,8,10,9};
        int left=0;
        int right=array.length-1;
        System.out.println(Arrays.toString(quickSort(array,left,right)));
    }
}
