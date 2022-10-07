package com.apolis.corejava.ImmutableClass;

public final class StudentPresident {

    private final Student student;
    private final String name;
    private final int id;

    public StudentPresident(Student student, String name, int id) {
        this.student = student;
        this.name = name;
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
class Student implements Cloneable {
    int id;
    String name;
    String course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}