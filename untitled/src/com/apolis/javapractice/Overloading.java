package com.apolis.javapractice;

public class Overloading {

    public static void main(String[] args) {
        int x=0;
        int y=0;

        String a=" a";
        String b= " b ";
//

     Overloading overloading= new Overloading();
     overloading.method1(x,y);
     overloading.method1(a,b);

    }

    public  void method1(int x, int y) {

        System.out.println(x + " "+ y);
    }

    public  void method1(String x, String y) {

        System.out.println(x + " "+ y);
    }

}
