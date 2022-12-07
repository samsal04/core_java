package com.apolis.corejava.multithreadding;

public class WithSynchronization {
    public static void main(String[] args) {
        Table1 t= new Table1();

        MyThread3 t3=new MyThread3(t);
        MyThread4 t4= new MyThread4(t);

        t3.start();
        t4.start();

    }
}

class Table1 {
    synchronized  void printTable(int n){
        for (int i=0;i<5;i++){
            System.out.println(n*i);
        }
        try {
            Thread.sleep(400);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyThread3 extends Thread{
    Table1 t;
    MyThread3(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread4 extends Thread{
    Table1 t;
    MyThread4(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(30);
    }
}
