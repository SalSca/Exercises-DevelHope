package org.example;

public abstract class Vehicle{
    public String type;
    public int numberOfWheels;

    public void showVehicleDetails() {
        System.out.println("the vehicle "+ type +" have "+ numberOfWheels+" wheels");
    }

    public abstract void doVehicleSound();


}
