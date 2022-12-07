package com.apolis.javapractice;




class Parent{

        int x;
        int y;


        public void method1(int x, int y){
            this.x=x;
            this.y=y;

            System.out.println(x+ "   "+y);
        }

    @Override
    public String toString() {
        return "Parent{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Child extends Parent{

    int a;
    int b;

    @Override
    public void method1(int x, int y) {
        this.a=x;
        this.b=x;

        System.out.println(a+" "+b);
        System.out.println(x+" "+ y );
    }

    @Override
    public String toString() {
        return "Child{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

public class OverRiding {
    public static void main(String[] args) {

        Parent parent= new Parent();
        Parent child= new Child();


        child.method1(10,15);
        parent.method1(25,35);

    }
}