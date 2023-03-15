package com.apolis.repeated;

import java.util.Arrays;


//find the first and last index of element - 121 of a sorted array - int[] arr1 = { 12, 34, 34, 56, 89, 89, 89, 121, 121, 121 };
public class FirstLastIndex {
    private static int[] index(int[] arr1, int num) {

        int[] result= new int[2];

        int windowstart=0;
        int windowEnd=arr1.length-1;

        while (windowstart<=windowEnd){
            if(arr1[windowstart]==num && arr1[windowEnd]==num){
                result[0]=windowstart;
                result[1]=windowEnd;
                return result;
            }
            else if(arr1[windowstart]<num){
                windowstart++;
            }
            else if(arr1[windowEnd]>num){
                windowEnd--;
            }
        }


        return result;
    }
    public static void main(String[] args) {
        int[] arr1={12, 34, 34, 56, 89, 89, 89, 121, 121, 121,121};
        int num=121;
        System.out.println(Arrays.toString(index(arr1,num)));
    }
}
