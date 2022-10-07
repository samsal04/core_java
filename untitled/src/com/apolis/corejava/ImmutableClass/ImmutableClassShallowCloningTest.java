package com.apolis.corejava.ImmutableClass;



public class ImmutableClassShallowCloningTest {

    public static void main(String[] args) {
        Student student=new Student();

        student.setId(10);
        student.setCourse("Science");
        student.setName("student1");


        StudentPresident studentPresident= new StudentPresident(student,"student1",15);

        System.out.println(studentPresident.getStudent());
        System.out.println(studentPresident.getId());
        System.out.println(studentPresident.getName());


        System.out.println(student.getId());
        System.out.println(student.getClass());
        System.out.println(student.getName());



    }
}

