package org.example;

/**
 * This class represents the 4 operator '+' '-' '*' '/' of two numbers
 * @version 1.0
 * @author Salvatore Scalisi
 */
public class ArithmeticOperators {

    /**
     * Simple method that sum two numbers
     * @param num1
     * @param num2
     * @return the result of the sum both numbers
     */
    public int sum(int num1,int num2){
        return num1+num2;
    }

    /**
     * Simple method that subtracts two numbers
     * @param num1 first number
     * @param num2 second number
     * @return the result of the subtracts both numbers
     */
    public int sub(int num1,int num2){
        return num1-num2;
    }

    /**
     * Simple method that multiplies two numbers
     * @param num1 first number
     * @param num2 second number
     * @return the result of the multiplication both numbers
     */
    public int mul(int num1,int num2){
        return num1*num2;
    }

    /**
     * Simple method that divides two numbers
     * @param num1 first number
     * @param num2 second number
     * @return the result of the division both numbers
     */
    public int div(int num1,int num2){
        return num1/num2;
    }
}
