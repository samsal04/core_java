package com.apolis.corejava.customexception;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            divide(a, b);
        }
        catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println("you are dividing a number by 0");

        }


    }

    private static int divide(int a, int b) {
        return a/b;

    }


}
