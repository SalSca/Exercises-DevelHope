package org.example;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Car car = new Car("fiat", 2000);
        car.printCarDetails();
        car.getCarDetails();
    }
}