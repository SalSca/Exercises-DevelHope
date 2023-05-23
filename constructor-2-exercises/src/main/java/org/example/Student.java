package org.example;

public class Student {
    public String name;
    public int grade;

    public Student(String studentName) {
        System.out.println("Creation of object student");
        this.name=studentName;
    }

    public void getStudentDetails() {
        System.out.println("Name: "+name+"\nGrade: "+grade);
    }
}
