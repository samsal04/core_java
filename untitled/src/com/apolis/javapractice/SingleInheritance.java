package com.apolis.javapractice;


class Parent1 {
    int x;
    int y;

    public Parent1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Child1 extends Parent1{

    int a;
    int b;

    public Child1(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }
}

class GrandChild extends Child1{

    int p;
    int q;

    public GrandChild(int x, int y, int a, int b, int p, int q) {
        super(x, y, a, b);
        this.p = p;
        this.q = q;
    }
}







public class SingleInheritance {
    public static void main(String[] args) {

        Parent1 child= new Child1(1,2,4,6);

        Child1 child1= new GrandChild(2,3,5,6,2,7);


    }
}
