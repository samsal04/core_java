package com.apolis.corejava.collections;

import java.util.ArrayList;

public class CustomeArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {

        CustomeArrayList list= new CustomeArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(list);

    }
}
