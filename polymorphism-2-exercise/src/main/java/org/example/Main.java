package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dan");
        Lion lion1 = new Lion("Alex");
        Cow cow1= new Cow("Carotina");

        animal1.animalSound();
        lion1.animalSound();
        cow1.animalSound();

    }
}