package com.apolis.corejava.ImmutableClass;


//1. class needs to be final so it can not extend any other class.
//2. All feilds needs to be private and final.
//3. A constructor with all all fields.
//4. Only getters methods, no setter methods.
//5. If there is a reference to an outside object, a deep cloning of the object is required.



public final class ImmutableClassDemo {

    private final Student student;

    private final int immutableEntity1;
    private final String immutableEntity2;
    private final boolean immutableEntity3;

    public ImmutableClassDemo(Student student, int immutableEntity1, String immutableEntity2, boolean immutableEntity3) {
        this.student = student;
        this.immutableEntity1 = immutableEntity1;
        this.immutableEntity2 = immutableEntity2;
        this.immutableEntity3 = immutableEntity3;
    }

    public int getImmutableEntity1() {
        return immutableEntity1;
    }

    public String getImmutableEntity2() {
        return immutableEntity2;
    }

    public boolean isImmutableEntity3() {
        return immutableEntity3;
    }
//
//    public  Student setId() throws  CloneNotSupportedException{
//        return (Student) student.clone();
//    }
//    public  Student setname() throws  CloneNotSupportedException{
//        return (Student) student.clone();
//    }



}


//class Student implements Cloneable{
//    int id;
//    String name;
//    String course;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Object clone() throws CloneNotSupportedException{
//        return  super.clone();
//    }
//}