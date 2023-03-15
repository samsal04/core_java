package com.apolis.enjoyalgorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Write a program to remove duplicate elements such that there is a single occurrence of each element in the array.
//
//Example:
//Input: array={2,2,2,2,2,3,3,3}          Output:array={2,3}
public class RemoveDuplicate {
    private static int[] removeDuplicate(int[] array) {

        Set<Integer> set= new HashSet<>();
//        int index=0;
//        for(int i=0;i<array.length;i++){
//            if(array[index]==array[i]){
//                continue;
//            }else {
//                array[index]=array[i];
//                index++;
//            }
//            set.add(array[i]);
//        }
        Arrays.stream(array).forEach(set::add);

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] array={2,2,2,2,2,3,3,3};
        System.out.println(Arrays.toString(removeDuplicate(array)));
    }
}
