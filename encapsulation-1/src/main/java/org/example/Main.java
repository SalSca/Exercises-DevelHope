package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        //----------
        System.out.println("Write the address of the house: ");
        house.setAddress(scanner.nextLine());
        //----------
        System.out.println("Write the number of floors here: ");
        house.setFloorsNumber(scanner.nextInt());
        //----------
        System.out.println("Write the names of the residents: ");
        house.setResidentsNames(scanner.next().split(","));
        //----------
        System.out.println("Address:"+house.getAddress()+"Floors number: "+house.getFloorsNumber());
        System.out.println("--Residents--");
        System.out.println(Arrays.toString(house.getResidentsNames()));
    }
}