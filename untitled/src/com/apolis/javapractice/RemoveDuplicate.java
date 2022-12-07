package com.apolis.javapractice;
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//        Example 1:
//        Input: head = [1,1,2]
//        Output: [1,2]
//
//        Example 2:
//        Input: head = [1,1,2,3,3]
//        Output: [1,2,3]

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    private static List<Integer> sortedList(List<Integer> list) {

        HashMap<Integer,Integer> map= new HashMap<>();
        int count=0;
        for(int i=0;i<list.size();i++){
            if(map.containsKey(list.get(i))){
                count=map.get(list.get(i));
                map.put(list.get(i),count+1);
            }
            else{
                map.put(list.get(i),1);
            }
        }

        List<Integer> list1=map.keySet().stream().collect(Collectors.toList());
        return  list1;

    }

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,1,2,3,4,4,4);
        System.out.println(sortedList(list));

    }


}
