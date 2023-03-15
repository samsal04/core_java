package com.apolis.corejava.exception;

public class ExceptionOrder {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("finally");
        }
    }
}
