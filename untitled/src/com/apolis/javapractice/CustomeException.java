package com.apolis.javapractice;

public class CustomeException {
    public static void main(String[] args) {
        try{
            throw new MyException("This is an error message");
        }
        catch (MyException m){
            System.out.println(m);
        }
    }
}

class MyException extends Exception {

    public MyException(String s){
        super(s);
    }



}
