package com.apolis.enjoyalgorithm;

//Given an array consisting of 0s, 1s and 2s, write a program to sort the array of 0s, 1s and 2s in ascending order.
//
//Example:
//
//Input: array={0,2,1,0,1,2,1,0}          Output: array={0,0,0,1,1,1,2,2}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sort012 {
    private static int[] sort(int[] array) {

//        Map<Integer,Long> map= new HashMap<>();
//
//       map= Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//       System.out.println(map);
//       int index=0;
//       for(Map.Entry<Integer,Long> entry:map.entrySet()){
//           int count=0;
////           int value=
////           System.out.println(entry.getValue());
//           while(count<entry.getValue()) {
////               System.out.println(value);
//               array[index]=entry.getKey();
////               System.out.println(count);
//               count++;
//               index++;
//           }
//
//       }

        int left=0;
        int right=array.length-1;
        int mid= 0;

        while(mid<=right){

            if(array[mid]==0){
                int temp=array[left];
                array[left]=array[mid];
                array[mid]=temp;
                left+=1;
                mid+=1;
            }
            else if (array[mid]==1){
                mid+=1;
            }
            else if (array[mid]==2) {
                int temp=array[right];
                array[right]=array[mid];
                array[mid]=temp;
                right-=1;
            }

        }

       return  array;
    }
    public static void main(String[] args) {
        int[] array= {0,2,1,0,1,2,1,0};
        System.out.println(Arrays.toString(sort(array)));
    }
}
