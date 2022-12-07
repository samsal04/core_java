package com.apolis.javapractice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,7,9,20,25,32};

        int value=25;
        int lastIndex=arr.length-1;
        int firstIndex=0;
        System.out.println("The index of "+value+" is "+ binarySearch(arr,firstIndex,lastIndex,value));
    }

    private static int binarySearch(int[] arr, int firstIndex, int lastIndex, int value) {

        if (lastIndex>=1){
            int mid= firstIndex+(lastIndex-1 )/2 ;
            if (arr[mid]==value){
                return mid;

            }
            if(arr[mid]<value){
                firstIndex=mid+1;
                lastIndex=arr.length-1;

              return   binarySearch(arr,firstIndex,lastIndex,value);
            }
            if(arr[mid]>value){
                firstIndex=0;
                lastIndex=mid-1;
                return binarySearch(arr,firstIndex,lastIndex,value);

            }
        }
        return -1;
    }
}
