package com.apolis.enjoyalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer array of size n, write a program to find all the leaders in the array.
//An element is a leader if it is strictly greater than all the elements to its right side.
//
//example:
//array[]={16,17,4,3,5,1}    output: {17,5,2}
//
//        array[]={6,5,4,3,2,1}    output: {6,5,4,3,2,1}
public class ArrayLeader {
    private static int[] leader(int[] array) {
        List<Integer> list= new ArrayList<>();


        for (int i=0;i<array.length;i++){
            int j=i+1;
            while(j<array.length){
                if(array[j]>array[i]){
                    break;
                }
                j=j+1;
            }
            if (j==array.length){
                list.add(array[i]);
            }
        }
        System.out.println(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] array={16,17,4,3,5,1};
        System.out.println(Arrays.toString(leader(array)));
    }
}

