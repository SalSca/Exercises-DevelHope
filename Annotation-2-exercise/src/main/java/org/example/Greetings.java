package org.example;

public class Greetings {

    @DevAnnotation(DevName = "Salvo", DevSurname = "Scalisi")
    static void sayWelcome(){
        System.out.println("Welcome");
    }
    @DevAnnotation(DevName = "Salvo", DevSurname = "Scalisi")
    static void sayGoodbye(){
        System.out.println("Goodbye");
    }
}
