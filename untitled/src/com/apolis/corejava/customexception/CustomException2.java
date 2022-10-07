package com.apolis.corejava.customexception;

public class CustomException2 {
    public static void main(String[] args) {
        try{
            throw new MyNewException("This is an exception message");
        }
        catch(MyNewException m){
            System.out.println(m);
        }

    }

}
class  MyNewException extends Exception{

    public  MyNewException (String s){
        super(s);

    }
}
