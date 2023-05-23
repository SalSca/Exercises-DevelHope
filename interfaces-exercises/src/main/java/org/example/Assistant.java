package org.example;

public class Assistant extends CollegePerson implements LearningPerson,TeachingPerson{

    public boolean isGoingToBeAPhD;

    public Assistant(String name,String surname,int id,boolean willBeAPhD) {
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.isGoingToBeAPhD=willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("I want to learn in order to teach");
    }
    @Override
    public void teachToOtherPeople() {
        System.out.println("I like to help professors to explain their subject");
    }
}
