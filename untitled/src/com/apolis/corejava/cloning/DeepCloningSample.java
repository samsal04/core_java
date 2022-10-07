package com.apolis.corejava.cloning;

public class DeepCloningSample {
    public static void main(String[] args) {

        try{
            Student1 don= new Student1();
            Student1 don1= (Student1) don.clone();

        }
        catch (CloneNotSupportedException c){
            System.out.println("Unable to clone");

        }

    }

}

class Student1 implements Cloneable{

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public  Object clone() throws CloneNotSupportedException {
       return super.clone();
   }



}