package com.apolis.corejava.javastreams;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//  Write a program to look for all the person objects in a collection whose account
//  status is ‘active’ and calculate the average height of them.
//  (Say a collection with list of objects exist. Need to iterate over it and
//  find the object with status is active).



//How to find only duplicate elements with its count from the String ArrayList in Java8?


public class JavaStreamsExample1 {
    public static void main(String[] args) {

        List<Person> list1= Arrays.asList( new Person("person1","active",1),
                new Person("person2","active",2),
                new Person("person3","not Active",3),
               new Person("person4","not Active",3));

        List<Person> activeStatus=list1.stream().filter(p->p.status.equals("active")).collect(Collectors.toList());
        System.out.println(activeStatus);

        //How to convert a List of objects to a Map by considering duplicated keys and store them in sorted order?
        Map<Integer,String> personMap= list1.stream().collect(Collectors.toMap(Person::getId,Person::getName));
        System.out.println(personMap);

        //How to convert a List of objects to a Map in Java 8 by handling duplicate keys?
        Map<Integer,List<String>> uniqueIdMap=  list1.stream()
                                                        .collect(Collectors.groupingBy
                                                                (Person::getId,
                                                                        Collectors.mapping
                                                                                (Person::getName,Collectors.toList())));

        System.out.println(uniqueIdMap);

        //How to count each element/word from the String ArrayList in Java8?

        List<String> stringList=Arrays.asList("Some random string 1","Some random string 1222","Some random string 32");

        Map<String,Long> stringCount=stringList.stream()
                                                .collect(Collectors.groupingBy
                                                        (s->s,Collectors.counting()));
        System.out.println(stringCount);

        //How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?





    }
}

class Person{
    String name;
    String status;
    int id;

    public Person(String name, String status, int id) {
        this.name = name;
        this.status = status;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}