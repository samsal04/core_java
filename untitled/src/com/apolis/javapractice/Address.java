package com.apolis.javapractice;

public class Address {

    public int i;

    public Address(int i) {

        this.i=i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Address{" +
                "i=" + i +
                '}';
    }
}
