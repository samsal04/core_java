package com.apolis.repeated;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//find the first duplicate from an array -  int[] arr = { 12, 43, 56, 23, 98, 12 };
public class FirstDuplicate {
    private static int duplicate(int[] arr) {


        List<Integer> list= Arrays.stream(arr).boxed().toList();

        for (int element:arr){
            if(list.contains(element)){
                return element;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={12, 43, 56, 23, 98, 12};

        System.out.println(duplicate(arr));
    }
}
