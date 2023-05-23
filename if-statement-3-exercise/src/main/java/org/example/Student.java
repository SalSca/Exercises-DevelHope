package org.example;

import java.util.Random;

public class Student {
    public String name;
    public int age;

    public Student(String studentName, int studentAge) {
        this.name=studentName;
        this.age=studentAge;
    }

    public void guessingAge(){
        Random rand = new Random(); //instance of random class
        int upperbound = 35;
        int int_random = rand.nextInt(upperbound);
        System.out.println("I generated the random number "+int_random+" for student "+this.name);
        if(int_random<age){
            System.out.println("the random number is smaller than the age");
        }else if(int_random>age){
            System.out.println("the random number is greater than age");
        }else{
            System.out.println("the random number is equal to age");
        }
    }
}
