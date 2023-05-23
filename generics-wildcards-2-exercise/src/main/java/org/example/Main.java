package org.example;


public class Main {
    public static void main(String[] args) {
        GenericsClass<Integer> firstElement= new GenericsClass();
        firstElement.setT(12);
        GenericsClass<Integer> secondElement= new GenericsClass();
        secondElement.setT(13);
        GenericsClass<String> thirdElement= new GenericsClass();
        thirdElement.setT("This is a string");
        GenericsClass<String> fourthElement= new GenericsClass();
        fourthElement.setT("This is a string");

        System.out.println("first element is equal to second element?");
        System.out.println(GenericsClass.isEqual(firstElement,secondElement));
        System.out.println("third element is equal to fourth element?");
        System.out.println(GenericsClass.isEqual(thirdElement,fourthElement));
    }
}