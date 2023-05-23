package org.example;


public class Start {

    public static void main(String[] args) {
        // create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
        SmartphonePrice producer1 = new SmartphonePrice("Producer1",1300);
        SmartphonePrice producer2 = new SmartphonePrice("Producer2",800);
        SmartphonePrice retail1 = new SmartphonePrice("Retail1",1000);
        SmartphonePrice retail2 = new SmartphonePrice("Retail2",650);

        // crate two Smarthphone objects using the 4 SmartphonePrice objects already created
        Smartphone smartphone1 = new Smartphone("Samsung","A51",4300,producer1,retail1);
        Smartphone smartphone2 = new Smartphone("Iphone","X",3700,producer2,retail2);
        // print the first smartphone object and the hashcode
        System.out.println(smartphone1.toString());
        System.out.println("Hashcode: "+smartphone1.hashCode());

        // print the second smartphone object
        System.out.println(smartphone2.toString());
        System.out.println("Hashcode: "+smartphone2.hashCode());

        // check if smartphone1 is equal to smartphone2
        boolean equal = smartphone1.equals(smartphone2);
        System.out.println("Is smartphone1 the same as smartphone2? "+equal);
        
            // clone the object
            try {
                Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();
                equal = clonedSmartphone.equals(smartphone2);
                System.out.println(clonedSmartphone.toString());
                System.out.println("Is clonedSmartphone the same as smartphone2? "+equal);

            }catch(Exception exception) {
                exception.printStackTrace();
                System.out.println("Error");
            }
            // check if smartphone2 is equal to smartphone2Clone

    }

}
