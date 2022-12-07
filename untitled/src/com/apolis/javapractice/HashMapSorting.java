package com.apolis.javapractice;

import java.util.*;
import java.util.stream.Collectors;

//Sort a HashMap using Values
public class HashMapSorting {

    private static HashMap<Integer,Integer> sort(HashMap<Integer, Integer> map) {

//        List<Map.Entry<Integer,Integer>> list= map.entrySet().stream().toList();
//
//      map.entrySet().stream()
//              .sorted((l1,l2)->l1.getValue().compareTo(l2.getValue()))
//              .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
//
//
//        System.out.println("List :"+ list.toString());
//        System.out.println(map);
//       return map;

//        ArrayList<String> newList = new ArrayList<>();
//        //store the (key, value) in array list
//        for (Map.Entry<String, String> entry:map.entrySet()){
//            newList.add(entry.getValue());
//        }
//
//        //sort the array list by value
//        Collections.sort(list, new Comparator<String>(){
//            public int compare(String s1, String s2){
//                return s1.compareTo(s2);
//            }
//        });
//
//        //create a new LinkedHashMap to store the sorted (key, value)
//        LinkedHashMap<String, String> sortedMap = new LinkedListMap<>();
//
//        for (String str:list){
//            for (Entry<String, String> entry: map.entrySet()){
//                if (entry.getValue().equals(str)){
//                    sortedMap.put(entry.getKey(), str);
//                }
//
//            }
//        }
//
//        return sortedMap;



        return map;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> map= new HashMap<>();

        map.put(1,2);
        map.put(3,5);
        map.put(2,1);
        map.put(5,4);
        map.put(4,3);

        System.out.println(sort(map));

    }


}
