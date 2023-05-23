package org.example;

public class Teacher {
    public String teacherName;

    public Teacher(){
        System.out.println("Creation of object Teacher");
    }

    public void assignGrade(Student alum, int finalGrade) {
        alum.grade=finalGrade;
    }
}
