package com.apolis.javapractice;

public final class ImmutableClassPractice {



    private final int a;
    private final String b;

    private final Address address;

    public int getA() {
        return a;
    }

    public String  getB() {
        return b;
    }

    public Address getAddress() {

        return new Address(this.address.getI());
    }
//    ImmutableClassPractice() {
//
//    }

    ImmutableClassPractice(int a, String b,Address address) {
        this.a = a;
        this.b = b;
        this.address= address;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b + ", address=" + address ;
    }

    public static void main(String[] args) {

        Address a = new Address(1);

        ImmutableClassPractice i1= new ImmutableClassPractice(12,"obj1",a);



        System.out.println(i1);

        i1.getAddress().setI(4);
        System.out.println(i1);
    }

}
