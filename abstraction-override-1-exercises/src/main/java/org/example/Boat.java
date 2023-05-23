package org.example;

public class Boat extends Vehicle{

    public double maxKnotsSpeed;
    public int boatKilosWeight;

    public Boat(double maxSpeed, int weight) {
        this.maxKnotsSpeed=maxSpeed;
        this.boatKilosWeight=weight;
        this.type="Boat";
    }

    @Override
    public void doVehicleSound() {
        System.out.println("its sound makes like 'brrrr'");
    }

    public void getBoatWeightandSpeed() {
        System.out.println("the weight of boat is "+boatKilosWeight+" while the speed is "+maxKnotsSpeed);
    }
}
