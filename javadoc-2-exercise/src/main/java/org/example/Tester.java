package org.example;

/**
 * This class represents a Tester with main method
 * @version 1.0
 * @author Salvatore Scalisi
 */
public class Tester {
    public static void main(String[] args) {
        ArithmeticOperators operation = new ArithmeticOperators();

        System.out.println(operation.sum(1,2));
        System.out.println(operation.sub(4,1));
        System.out.println(operation.mul(3,7));
        System.out.println(operation.div(10,5));
    }
}