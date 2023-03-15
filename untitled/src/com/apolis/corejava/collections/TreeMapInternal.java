package com.apolis.corejava.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInternal {

    public static void main(String[] args) {

        Map<String, String> map= new TreeMap<>();

        // In tree map insertion order matters. The sort is done around the key
        map.put("a","xyz");
        map.put("c","pqr");

        "c".compareTo("a");
        // if > ==========> add on right side (+1)
        // if < ==========> add on left side  (-1)


    }
}
