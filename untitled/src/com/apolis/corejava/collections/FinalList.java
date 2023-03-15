package com.apolis.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class FinalList {

    public static void main(String[] args) {
        // when list is set up as final we can modify the list, but we can not reassign it
        final List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");

        System.out.println(list);

        // this is not allowed.
//        list= new ArrayList<>();
    }
}
