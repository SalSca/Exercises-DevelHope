package org.example;

public class Car extends Vehicle{

    public int numberOfDoors;
    public double carPrice;

    public Car(int wheels,int doors,int price) {
        this.type="car";
        this.numberOfWheels=wheels;
        this.numberOfDoors=doors;
        this.carPrice=price;
    }
    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println(" and "+numberOfDoors+" doors");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("its sound makes like 'brum brum'");
    }
}
