package com.company;
import java.util.*;

public class Student {
    private String name;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Student> studentList = new ArrayList<>();


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' + '}' ;
    }
}

