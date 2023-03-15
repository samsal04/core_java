package com.apolis.enjoyalgorithm;

import java.util.Arrays;

//Given an array of integers sorted in ascending order, write a code to find the first and last position of a
//given target value.
//
//- if the target is not found in the array, return[-1,-1]
//- We must design and algorithm with O(log n) time complexity.
//
//Example:
//
//Input: array[]={-1,1,2,2,2,5,6,12,12} target=2
//Output: First Occurrence= 2, Last Occurrence= 3
//
//Input= array[]={21,35,51,70,71}       target=70
//Output: First Occurrence= 3, Last Occurrence= 3
public class FirstAndLastPosition {
    private static int[] search(int[] array,int target) {
        int[] result= {-1,-1};
        int low=0;
        int high=array.length-1;

        while(low<high){
            int mid=low+(high-low)/2;
            if(array[mid]==target){
                return findIndexes(array,mid,target);
            }
            else if(array[mid]>target){
                high=mid-1;
            }
            else if(array[mid]<target){
                low=mid+1;
            }
        }

        return result;
    }

    private static int[] findIndexes(int[] array, int mid,int target) {
        int[] index=new int[2];
        int low=mid;
        int high=mid;
        while(low>=0){
            if(array[low]!=target){
                index[0]=low+1;
                break;
            }
            else if(array[low]==target){
                low--;
            }

        }

        while(high<array.length){
            if(array[high]!=target){
                index[1]=high-1;
                break;
            }
            else if(array[high]==target){
                high++;
            }

        }

        return index;
    }

    public static void main(String[] args) {
        int[] array={-1,1,2,2,2,5,6,12,12};
        int target=2;
        int[] array1={21,35,51,70,71};
        int target1=70;

        System.out.println(Arrays.toString(search(array, target)));
        System.out.println(Arrays.toString(search(array1, target1)));
    }
}
