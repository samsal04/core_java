package com.apolis.corejava.hashequals;

import java.util.HashSet;
import java.util.Set;

public class Employee {

    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    // manuel hashcode and equals

    @Override
    public int hashCode() {
        return id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Employee employee= (Employee) obj;
//
//        return this.id==employee.getId() && this.name.equals(employee.getName());
//    }
//
// @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }


    public static void main(String[] args) {

        Employee employee1= new Employee(101,"employee1");
        Employee employee2= new Employee(101,"employee1");

        System.out.println(" Hashcode of employee 1 and 2     "+ employee1.hashCode() +"------"+ employee2.hashCode());
        System.out.println("Equals for employee 1 and 2      "+ employee1.equals(employee2));

        Set<Employee> employees= new HashSet<>();

        employees.add(employee1);
        employees.add(employee2);
        System.out.println(employees);


    }
}
