package com.apolis.corejava.java8;

public class PayPal implements  Payment{
    @Override
    public void doTransaction() {

    }

    @Override
    public void addCoupon() {
        Payment.super.addCoupon();
    }
}
