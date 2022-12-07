package com.apolis.practicecodes;
//You are given the heads of two sorted linked lists list1 and list2.
//
//        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//        Return the head of the merged linked list.
//Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//
//        Example 2:
//
//        Input: list1 = [], list2 = []
//        Output: []
//
//        Example 3:
//
//        Input: list1 = [], list2 = [0]
//        Output: [0]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListMerge {
    private static List<Integer> list(List<Integer> list1, List<Integer> list2) {

        Integer[] array1= list1.stream().toArray(Integer[] ::new);
        Integer[] array2= list2.stream().toArray(Integer[] ::new);
        Integer[] array3= new Integer[array1.length+array2.length];

        boolean array1End= false;
        int count=0;
        int array2Count=0;
        for(int i=0; i<array3.length-1;i++){

            if ( array1End==false){

                array3[i]=array1[count];
                count++;

                if(count>array1.length){
                    array1End=true;
                }

            }

            if(array1End==true){
                array3[i]=array2[array2Count];
                array2Count++;
            }



        }



        return Arrays.stream(array3).toList();
    }

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,4);
        List<Integer> list2= Arrays.asList(1,3,4);

        System.out.println(list(list1,list2));

    }


}
