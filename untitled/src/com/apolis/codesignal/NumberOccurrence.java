package com.apolis.codesignal;

import java.util.*;

//Given an array of integers a, your task is to calculate the digits that occur the most number of times in the array.
//Return the array of these digits in ascending order.
//
//        Example
//        For a = [25, 2, 3, 57, 38, 41], the output should be solution(a) = [2, 3, 5].
//        Here are the number of times each digit appears in the array:
//
//        0 -> 0
//        1 -> 1
//        2 -> 2
//        3 -> 2
//        4 -> 1
//        5 -> 2
//        6 -> 0
//        7 -> 1
//        8 -> 1
//
//        The most number of times any number occurs in the array is 2, and the digits which appear 2 times are 2, 3 and 5. So the answer is [2, 3, 5].
public class NumberOccurrence {
    private static int[] numberOccurrence(int[] a) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i< a.length;i++){
            if(a[i]<10){
                map.compute( a[i],(k,v)->(v==null)?1:v+1);
            }else {
                getIndividualNum(map, a[i]);
            }
        }
//        System.out.println(map.toString());
//        int maxValue= map.entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .get()
//                .getValue();

        int maxValue= Collections.max(map.values());

        List<Integer> list= new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:  map.entrySet()){
            if(entry.getValue()==maxValue){
                list.add(entry.getKey());
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    private static HashMap<Integer,Integer> getIndividualNum(HashMap<Integer, Integer> map, int i) {
        int reminder=0;

        while(i>0){
        reminder=i%10;
        i=i/10;
//        System.out.println("reminder: "+reminder+" number: "+i);
            map.compute(reminder, (k, v) -> (v == null) ? 1 : v + 1);

        }
//        System.out.println("===================");
        return map;
    }

    public static void main(String[] args) {
        int[] a={25, 2, 3, 57, 38, 41};
        System.out.println(Arrays.toString(numberOccurrence(a)));
    }
}
