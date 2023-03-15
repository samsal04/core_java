package com.apolis.enjoyalgorithm;

//A sorted and rotated array of size n is given. Write a program to find the minimum element in this sorted
//and rotated array.
//
//Example:
//
//input: array={5,6,7,8,9,1,2,3,4}    output=1
//input: array={8,9,3,4,5,6,7}        output=3
public class MinRotatedSorted {
    private static int min(int[] array) {

        int left=0;
        int right= array.length-1;

        while(left<right){
            if(array[left]<array[right]){
                return array[left];
            }
            int mid= left+(right-left)/2;
            if(array[mid]>array[right]){
                left=mid+1;
            }
            else {
                right=mid;
            }
        }
        return array[left];
    }
    public static void main(String[] args) {
        int[] array={8,9,3,4,5,6,7};
        System.out.println(min(array));
    }
}
