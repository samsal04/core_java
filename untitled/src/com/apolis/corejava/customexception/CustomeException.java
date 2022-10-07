package com.apolis.corejava.customexception;

public class CustomeException {

    public static void main(String[] args) {

        try {
            throw  new MyException("This is my error message");
        }
        catch (MyException e){
            System.out.println(e);
        }
    }
}
class MyException extends  Exception{
    public MyException(String m){
        super(m);

    }

}