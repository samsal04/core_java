package com.apolis.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{

    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        if(studentId==o.studentId){
            return 0;
        }
        else if(studentId>o.studentId){
            return 1;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {

        List<Student> students= new ArrayList<>();

        Student s1=  new Student(101,"student1");
        Student s2=  new Student(102,"student2");
        Student s4=  new Student(104,"student4");
        Student s3=  new Student(103,"student3");
        Student s5=  new Student(108,"student8");
        Student s6=  new Student(105,"student5");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        System.out.println("Before sorting : "+students);
//        Collections.sort(students);
        Collections.sort(students, new StudentNameComparator());

        System.out.println(students);
    }
}
