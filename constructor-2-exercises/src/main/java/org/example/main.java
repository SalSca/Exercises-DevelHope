package org.example;

public class main {
    public static void main(String[] args) {

        Student student1= new Student("Fabio");
        Student student2= new Student("Giorgia");
        Teacher teacher1= new Teacher();
        teacher1.teacherName="Salvo";
        teacher1.assignGrade(student1,27);
        teacher1.assignGrade(student2,30);
        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
