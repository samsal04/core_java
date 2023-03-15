package com.apolis.corejava.oop;

public class Child extends Parent{

    @Override
    public void m1() {
        System.out.println(" Child class m1()");
    }

    public static void m2(){
        System.out.println(" trying to override static method");
    }

    public static void main(String[] args) {
        Parent parent=  new Child();
        Parent parent1= new Parent();
        Child child= new Child();
        parent.m1();
        parent.m2();
        parent1.m2();
        child.m2();

        Parent.m2();
        Child.m2();
    }
}
