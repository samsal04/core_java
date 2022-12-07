package com.apolis.corejava.javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {
    public static void main(String[] args) {

        List<Integer> list1= Arrays.asList(2,4,7,1,8,2);
        List<Integer> list2=new ArrayList<>();

      list2= list1.stream().sorted().toList();

      System.out.println(list2);

//        Given a list of integers, find out all the even numbers exist in the list using Stream functions?
      list1.stream().filter(l->l%2==0).forEach(System.out::print);

      com.apolis.corejava.ImmutableClass.Employee employee1= new com.apolis.corejava.ImmutableClass.Employee("employee1",124,34000);
        com.apolis.corejava.ImmutableClass.Employee employee2= new com.apolis.corejava.ImmutableClass.Employee("employee2",126,48000);
        com.apolis.corejava.ImmutableClass.Employee employee3= new com.apolis.corejava.ImmutableClass.Employee("employee3",129,24000);


        List<com.apolis.corejava.ImmutableClass.Employee> employeeList=Arrays.asList(employee1,employee2,employee3);


        // Employees with salary greater than 30000
        List<com.apolis.corejava.ImmutableClass.Employee>list3=employeeList.stream().
                filter(e->e.getSalary()>30000).
                collect(Collectors.toList());

        System.out.println(list3);

        // Hashmap, where key=id, value= name. Sort the name first and convert it into list and print the list
        HashMap<Integer,String> idToName= new HashMap<>();

        idToName.put(124,"employeeD");
        idToName.put(145,"employeeB");
        idToName.put(254,"employeeC");



        idToName.keySet().stream().sorted().
                collect(Collectors.toList()).forEach(System.out::println);
        idToName.values()
                .stream().sorted()
                .collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);
      //  System.out.println(idToName);


    }
}


class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}