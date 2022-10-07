package com.apolis.javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ArrayListAndLinkedListPractice {
    public static void main(String[] args) {

        ArrayList<String> students= new ArrayList<>();

        students.add("student1");
        students.add("student2");
        students.add("student3");
        students.add("student3");

        System.out.println(students);
        System.out.println(students.get(2));
        students.set(2,"NotAStudent");
        students.size();

        for(int i=0;i<students.size();i++){

            System.out.println(students.get(i));
        }

        Iterator<String> iterator=students.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");

        }


    }
}
