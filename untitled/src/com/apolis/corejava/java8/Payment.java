package com.apolis.corejava.java8;

public interface Payment {

    public void doTransaction();

    default void addCoupon(){
        System.out.println("add $5 cashback");
    }

    static  void generateTransactionReport(){
        System.out.println(" Transaction report as follows");
    }
}
