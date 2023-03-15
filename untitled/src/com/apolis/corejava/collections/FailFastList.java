package com.apolis.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastList {
    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator= list.iterator();

        // in this you will ConcurentModificationException
        // In iterator there is something called modCount is implemented. ModCount is assigned the initial value
        // at the start of the iteration. And if there is any change in the modCount during the iteration
        // iterator throw the given error

        // to avoid this error you can change the ArrayList to CopyOnWriteArrayList

        // when sysout the value of the list after changing the List to failsafe List i.e. CopyOnWriteArrayList,
        // even though we will not get error, the new element will not be added to the list. Since, the CopyOnWriteArrayList
        // work on the copied array.

        while (iterator.hasNext()){

            String element= iterator.next();
            System.out.println(element);
            list.add("c");

        }

    }
}
