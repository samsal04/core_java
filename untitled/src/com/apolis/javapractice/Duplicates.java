package com.apolis.javapractice;
//write a java program to remove the duplicates from an arrylist
//
//        1.using any of the collection classes
//
//        2.brute force approach
//
//        contains method in the list
//
//        3.using streams
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("three");
        list.add("three");
        list.add("four");
        list.add("four");



        System.out.println(ducplicateCollection(list));
        System.out.println(brute(list));
        System.out.println(list);

        list= list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }

    private static List<String> brute(List<String> list) {
        List<String> list1= new ArrayList<>();

        for(int i=0;i<list.size();i++){

            if(list1.contains(list.get(i))){
                continue;
            }else {
                list1.add(list.get(i));
            }

        }

        return list1;
    }

    private static List<String> ducplicateCollection(List<String> list) {

        Set<String> hashSet= new HashSet<>(list);

//        System.out.println(hashSet);

        List<String>list1= hashSet.stream().collect(Collectors.toList());

        return list1;

    }
}
