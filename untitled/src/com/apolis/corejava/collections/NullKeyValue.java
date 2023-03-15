package com.apolis.corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class NullKeyValue {

    public static void main(String[] args) {

        // Here a hashmap allows to have null key and value. However, if you change the hashmap to ConcurrentHashMap
        // it will give you an error.
        Map<String, String> map= new HashMap<>();
        map.put(null,null);
        System.out.println(map);
    }


}
