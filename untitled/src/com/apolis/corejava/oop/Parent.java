package com.apolis.corejava.oop;

public class Parent {

    public  void m1()  {
        System.out.println("Parent class m1()");
    }

    public static void m2(){
        System.out.println("static method in Parent");
    }

    public static void main(String[] args) {
        Parent parent= new Parent();
        Child child= new Child();

        parent.m1();
        child.m1();

    }

}
