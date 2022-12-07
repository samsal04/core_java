package com.apolis.javapractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapCustomeImmutablity {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Santhosh");

        Map<User,String> myMap = new HashMap<User,String>();
        myMap.put(user,"trainer");

        System.out.println(myMap.get(user)); // output is trainer

        user.setName("Samar");

        System.out.println(myMap.get(user)); // output

    }
}

class User{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
