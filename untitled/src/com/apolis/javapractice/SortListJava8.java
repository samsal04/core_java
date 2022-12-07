package com.apolis.javapractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListJava8 {
    public static void main(String[] args) {

        String[] name={"one","two","three","four"};

        List<String> list= Arrays.asList(name);

       list.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);
    }
}
