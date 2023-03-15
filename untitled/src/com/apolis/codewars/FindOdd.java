package com.apolis.codewars;
//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//        Examples
//
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    private static int findInt(int[] array) {

        Map<Integer,Integer> map=new HashMap<>();
        Arrays.stream(array).forEach(i->map.put(i,map.getOrDefault(i,0)+1));
        System.out.println(map);

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()%2==1){
                return entry.getKey();
            }
        }
     return -1;
//        return stream(array).reduce(0, (x, y) -> x ^ y);
    }
    public static void main(String[] args) {
        int[] array={1,2,2,3,3,3,4,3,3,3,2,2,1};
        System.out.println(findInt(array));
    }
}
