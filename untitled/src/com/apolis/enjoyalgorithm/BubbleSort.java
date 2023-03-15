package com.apolis.enjoyalgorithm;

import java.util.Arrays;

public class BubbleSort {
    private static int[] bubbleSort(int[] array) {

        for(int i=0;i< array.length;i++){

                boolean elementSwap=false;
            for (int j=i+1;j< array.length;j++){
                if(array[i]>array[j]){
                    int temp= array[j];
                    array[j]=array[i];
                    array[i]=temp;
                    elementSwap=true;
                }
            }
            if(elementSwap==false) break;
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array={3,6,1,4,8,9};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
