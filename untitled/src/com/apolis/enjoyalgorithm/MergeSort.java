package com.apolis.enjoyalgorithm;

import java.util.Arrays;

public class MergeSort {
    private static int[] mergeSort(int[] array,int left, int mid, int right) {
        //size of left subarray
        int leftLength= mid-left+1;
        //size of right subarray
        int rightLength= right-mid;
        //left subarray
        int[] leftArray= new int[leftLength];
        //right subarray
        int[] rightArray= new int[rightLength];

        System.arraycopy(array, left, leftArray, 0, leftLength);
        System.arraycopy(array,mid+1,rightArray,0,rightLength);

//        for (int j=0;j< rightLength;j++){
//            rightArray[j]=array[mid+1+j];
//        }

        System.out.println(Arrays.toString(leftArray));
        System.out.println(Arrays.toString(rightArray));

        int i=0;
        int j=0;
        int k=left;

        while (i<leftLength && j<rightLength){

            if(leftArray[i]<=rightArray[j]){
                array[k]=leftArray[i];
                i=i+1;
            }
            else {
                array[k]=leftArray[j];
                j=j+1;
            }
            k=k+1;
        }

        System.out.println(Arrays.toString(array));

        while(i<leftLength){
            array[k]=leftArray[i];
            i=i+1;
            k=k+1;
        }
        while(j<rightLength){
            array[k]=rightArray[j];
            j=j+1;
            k=k+1;
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array={3,6,1,4,8,10,9};
        int left=0;
        int right= array.length-1;
        int mid=left+(right-left)/2;
        System.out.println(Arrays.toString(mergeSort(array,left,mid,right)));
    }
}
