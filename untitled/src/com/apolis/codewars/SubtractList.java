package com.apolis.codewars;
//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//        It should remove all values from list a, which are present in list b keeping their order.
//        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//
//        If a value is present in b, all of its occurrences must be removed from the other:
//
//        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}

import java.util.Arrays;
import java.util.HashMap;

public class SubtractList {
    private static int[] arrayDiff(int[] a, int[] b) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<a.length;i++){

            map.compute(a[i],(key,value)->(value==null)?1:value+1);

        }
        System.out.println(map);

        for(int i=0;i<b.length;i++) {
            if(map.containsKey(b[i])){
                map.remove(b[i]);
            }
        }
        System.out.println(map);
//       int[] result= map.keySet().stream().mapToInt(Integer::intValue).toArray();
        return map.keySet().stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] a={1,2,2,2,3};
        int[] b={2};

        System.out.println(Arrays.toString(arrayDiff(a,b)));
    }
}
