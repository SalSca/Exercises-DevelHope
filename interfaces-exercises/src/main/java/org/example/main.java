package org.example;

public class main {
    public static void main(String[] args) {

        Student student = new Student("Daniele","Giongo",543,2);
        Assistant assistant = new Assistant("Martina","Carciofino",595,true);
        Professor professor = new Professor("Franco","Manci",111,"Matematica");

        student.goToCollege();
        assistant.goToCollege();
        professor.goToCollege();

        //Student method implement from Interface
        student.studyAtHome();
        //Professor method implement from Interface
        professor.teachToOtherPeople();
        //Assistant method implements from Interfaces
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
