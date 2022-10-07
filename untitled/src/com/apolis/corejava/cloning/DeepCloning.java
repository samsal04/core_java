package com.apolis.corejava.cloning;

public class DeepCloning {
    public static void main(String[] args) {
        Courses science = new Courses("Physics", "Chemistry", "Biology");

        Student student1 = new Student(111, "John", science);

        Student student2 = null;

        try{
            student2= (Student) student1.clone();
        }
        catch(CloneNotSupportedException c){
            c.printStackTrace();
        }

        System.out.println(student1.course.subject3);         //Output : Biology

        //Changing the subject3 of 'student2'

        student2.course.subject3 = "Maths";

        //This change will not be reflected in original student 'student1'

        System.out.println(student1.course.subject3);


    }



}

class  Courses implements  Cloneable{
    String subject1;
    String subject2;
    String subject3;

    public Courses(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }
}
class Student implements  Cloneable{

    int id;
    String name;
    Courses course;

    public Student(int id, String name, Courses course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    protected Object clone() throws  CloneNotSupportedException{
        Student student= (Student)super.clone();
        student.course=(Courses)course.clone();

        return student;
    }

}