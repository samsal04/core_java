package com.apolis.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {

    public static void main(String[] args) {
        Map<Integer, String> map= new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");

        // similar to previous example we will get an error here as well.
        // we can avoid the error by using ConcurrentHashMap instead.




        Iterator iterator= map.keySet().iterator();

        while (iterator.hasNext()){
            Integer key= (Integer) iterator.next();
            System.out.println(key+" : "+map.get(key));
            map.put(3,"Three");
        }


        Map<Integer,String> conMap= new ConcurrentHashMap<>();

        conMap.put(101,"one");
        conMap.put(102,"two");

        Iterator iterator1= conMap.keySet().iterator();

        while (iterator1.hasNext()){

            Integer key= (Integer) iterator1.next();
            System.out.println(key+" : "+ conMap.get(key));
            conMap.put(103,"three");

        }

    }
}
