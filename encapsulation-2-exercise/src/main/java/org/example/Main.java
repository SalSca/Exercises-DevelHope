package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert name: ");
        person1.setName(scanner.nextLine());
        System.out.print("Insert surnname: ");
        person1.setSurname(scanner.nextLine());
        System.out.print("Insert height: ");
        person1.setHeight(scanner.nextDouble());
        System.out.print("Insert age: ");
        person1.setAge(scanner.nextInt());

        System.out.println("So, your identikit is:");
        System.out.printf("Name: %s\nSurname: %s\nHeight: %.2f\nAge: %d",person1.getName(),person1.getSurname(),person1.getHeight(),person1.getAge());
    }
}