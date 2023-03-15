package com.apolis.enjoyalgorithm;

//Given an array of n integers, write a program to check the given array is a valid mountain array or not.
//
//The array is a mountain array if and only if n>=3 and there exists some i (0<i<n-1) such that
//it is first strictly increasing and then strictly decreasing.
//
// Example, array[]={5,2,1,4}  output: false
//          array[]={5,8,8}    output: false
//          array[]={1,2,3,5,3} output: true

public class ValidMountain {
    private static boolean validMountain(int[] array) {

      int length= array.length;
      int left=0;
      int right=length-1;

      while(left<right && array[left]<array[left+1]){
          left++;
      }

      while(left<right && array[right-1]>array[right]){
            right--;
      }
        return left>0 && left==right && left<length-1;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,5,3};
        System.out.println(validMountain(array));
    }
}
