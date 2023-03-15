package com.apolis.enjoyalgorithm;
//You are given an array of integers that is initially increasing and then decreasing, find the maximum value
//in the array.
//
//Example:
//
//Input: array[]={18,110,210,452,810,500,101,13}      Output: 810
//Input: array[]={1,2,3,4,5}                          Output: 5

public class BitonicMax {
    private static int max(int[] array) {

        int left=0;
        int right= array.length-1;
        int max=0;

        while(left<right){
//            int mid= left+(right-left)/2;

            if(array[left]>array[right]){
                right--;
                max=array[left];
            }
            else if(array[left]<array[right]){
                left++;
                max=array[right];
            }

        }
        return max;
    }

    private static int recursionMax(int[] array,int low, int high) {

        if(low==high){
            return array[low];
        }
        if(high==low+1 && array[low]>=array[high] ){
            return array[low];
        }
        if(high==low+1 && array[low]<array[high] ){
            return array[high];
        }
        int mid=low+(high-low)/2;
        if(array[mid]>array[mid-1] && array[mid]>array[mid+1]){
            return array[mid];
        }
        else if(array[mid]<array[mid-1] && array[mid]>array[mid+1]){
            return recursionMax(array,low,mid-1);
        }
        else {
            return recursionMax(array,mid+1,high);
        }

    }
    public static void main(String[] args) {
        int[] array={18,110,210,452,810,500,101,13};
        int[] array1={1,2,3,4,5};
        int low=0;
        int high=array.length-1;
        System.out.println(max(array));
        System.out.println(max(array1));
        System.out.println(recursionMax(array,low,high));
        System.out.println(recursionMax(array1,low,high));
    }
}
