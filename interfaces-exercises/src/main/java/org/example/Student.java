package org.example;

public class Student extends CollegePerson implements LearningPerson{

    public int academicYears;

    public Student(String name,String surname,int id,int year) {
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.academicYears=year;
    }

    @Override
    public void studyAtHome() {
        System.out.println("I really like studying at home");
    }
}
