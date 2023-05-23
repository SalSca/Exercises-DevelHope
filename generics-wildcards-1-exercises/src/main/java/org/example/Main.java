package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(6.5);
        individualMarksListLisa.add(12.5);

        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(4);
        projectMarksListJeremy.add(7);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAvg));

        for (Student student : listOfStudents) {
            System.out.println(student.toString());
        }
    }
}
