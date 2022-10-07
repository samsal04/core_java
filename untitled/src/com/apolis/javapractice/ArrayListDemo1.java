package com.apolis.javapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> employee= new ArrayList<>();

        employee.add("Employee1");
        employee.add("Employee2");
        employee.add("Employee3");


        employee.set(2,"EmployeeNo45");


        for(int i =0;i<employee.size();i++){

            System.out.print("===="+employee.get(i));

        }

        Iterator<String> iterator=employee.iterator();

        while (iterator.hasNext()){
            System.out.print("-----"+ iterator.next());
        }

    }
}
