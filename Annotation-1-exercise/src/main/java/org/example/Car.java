package org.example;

public class Car {
    String modelName;
    int mileage;

    public Car(String modelName, int mileage){
        this.modelName=modelName;
        this.mileage=mileage;
    }
    @Deprecated()
    public void printCarDetails(){
        System.out.print("ModelName: "+modelName+" mileage: "+mileage);
    }

    public void getCarDetails(){
        System.out.println("ModelName: "+modelName);
        System.out.println("Mileage: "+mileage);
    }
}
