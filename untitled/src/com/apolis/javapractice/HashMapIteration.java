package com.apolis.javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map= new HashMap<>();

        map.put(1,2);
        map.put(3,5);
        map.put(2,1);
        map.put(5,4);
        map.put(4,3);


        Iterator<Map.Entry<Integer,Integer>> iterator= map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer,Integer>  entry= iterator.next();
            System.out.println("Key = "+ entry.getKey() + " Value= "+ entry.getValue());
        }

    }

}
