package com.apolis.corejava.java8;

public class Venmo implements Payment{
    @Override
    public void doTransaction() {

    }

    @Override
    public void addCoupon() {
       System.out.println(" 10% cashback");
    }
}
