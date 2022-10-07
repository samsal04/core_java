package com.apolis.corejava.ImmutableClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableStudent {

    private final int id;
    private final String name;
    private final Age age;
    private final List<String> friends;

    public ImmutableStudent(int id,String name,Age age,List<String> friends) {
        this.id=id;
        this.name=name;
        Age clonedAge=new Age();
        clonedAge.setDate(age.date);
        clonedAge.setMonth(age.month);
        clonedAge.setYear(age.year);
        this.age=clonedAge;
        //this.age=age;
        this.friends=new ArrayList<>(friends);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDate(this.age.getDate());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());

        return cloneAge;
        //return this.age;

    }

    public List<String> getFriends(){
        return Collections.unmodifiableList(this.friends);
    }

    @Override
    public String toString() {
        return "ImmutableStudent [id=" + id + ", name=" + name + ", age=" + age + friends +"]";
    }

}
class Age {

    int date;
    int month;
    int year;
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Age(int date, int month, int year) {
        super();
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public Age() {}
    @Override
    public String toString() {
        return "Age [date=" + date + ", month=" + month + ", year=" + year + "]";
    }


}