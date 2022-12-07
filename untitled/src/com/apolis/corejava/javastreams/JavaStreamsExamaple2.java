package com.apolis.corejava.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Patient Table
//        Id, fistName, lastName, dob, age, address.
//        1 , King , l1 , 1004-01-01,  23,     CA
//        2 , King , l5 , 1004-01-01,  23,     CA
//        3 , John , l2 , 1004-01-01,  23,     CA
//        4 , John , l3 , 1004-01-01,  23,     CA
//        5 , John , l6 , 1004-01-01,  23,     CA
//        6 , Tom , last , 1004-01-01, 23,     CA
//
//        fetch of all records having same firstname
//        King, 2
//        john , 3
public class JavaStreamsExamaple2 {
    public static void main(String[] args) {

        List<Patient> patientList= Arrays.asList(
                new Patient( 1 , "King" , "l1" ,  23,    " CA"),
                new Patient( 2 , "King" , "l5" ,  23,    " CA"),
                new Patient( 3 , "John" , "l2" ,  23,    " CA"),
                new Patient( 4 , "John" , "l3" ,  23,    " CA"),
                new Patient( 5 , "John" , "l6" ,  23,    " CA"),
                new Patient( 6 , "Tom" , "last" ,  23,    " CA")
        );

        Map<String, Long> collect = patientList.stream()
                                                .collect(Collectors.groupingBy(Patient::getFirstName, Collectors.counting()));
        collect.forEach((k,v)-> System.out.println(k + " , " + v));

//        Select
//                firstName,
//                Count(firstName)
//
//                FROM
//                        patient
//                        Group BY firstName
//                        HAVING COUNT (firstName)>1;
//        select * from patient p where (select count(*) from patient p2 where p.firstname=p2.firstname) > 1;
    }
}

class  Patient{
    int id;
    String firstName;
    String lastName;
//    Date dob;
    int age;
    String address;

    public Patient(int id, String firstName, String lastName,  int age, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
//        this.dob = dob;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}