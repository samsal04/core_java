package com.apolis.corejava.exception;

public class TryCatchFinally {

    public static int m1(){

        try {
            return 1;
        }
        catch (Exception ex){
            return 2;
        }
        finally {
            return 3;
        }
    }

    public static void main(String[] args) {

        TryCatchFinally.m1();
    }
}
