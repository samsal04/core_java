package com.apolis.corejava.ImmutableClass;

import com.apolis.javapractice.Employee;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class EmployeeImmutable {

    private final String name;
    private  final Date dob;

    private final List<String> mobile;

    //mutable class
    private final Employee employee;

    public EmployeeImmutable(String name, Date dob, List<String> mobile, Employee employee){
        this.name=name;
        this.dob=dob;
        this.mobile=mobile;
        this.employee= employee;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return (Date) dob.clone();
    }

    public List<String> getMobile() {
        return Collections.unmodifiableList(mobile);
    }

    public Employee getEmployee() {
        return new Employee(employee.getId(),employee.getName(),employee.getEmail());
    }



    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", mobile=" + mobile +
                ", employee=" + employee +
                '}';
    }
}
