package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,2,1300);
        Boat boat = new Boat(50.5,600);
        System.out.println("-------");
        car.doVehicleSound();;
        car.showVehicleDetails();
        System.out.println("-------");
        boat.doVehicleSound();
        boat.showVehicleDetails();
        boat.getBoatWeightandSpeed();
    }
}