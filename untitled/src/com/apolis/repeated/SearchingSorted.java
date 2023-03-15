package com.apolis.repeated;
//searching an element 200 from sorted array -  int[] arr = { 12, 32, 90, 112, 200 }; using binary search
public class SearchingSorted {
    private static int binarySearch(int[] arr, int n) {

        int left=0;
        int right=arr.length-1;

        while(left<=right){

            int  mid=(right+left)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]>n){
                left=0;
                right=mid-1;
            }
            else {
                left=mid+1;
                right=arr.length-1;
            }


        }



        return -1;
    }

    public static void main(String[] args) {
        int[] arr={12, 32, 90, 112, 200};
        int n = 200;
        System.out.println(binarySearch(arr,n));
    }
}
