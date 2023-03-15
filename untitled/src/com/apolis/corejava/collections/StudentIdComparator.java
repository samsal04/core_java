package com.apolis.corejava.collections;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getStudentId()==o2.getStudentId()){
            return o1.getName().compareTo(o2.getName());
        }
        else if(o1.getStudentId()>o2.getStudentId()){
            return 1;
        }else {
            return -1;
        }
    }
}
