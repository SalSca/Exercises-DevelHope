package org.example;

public class Main {
    public static void main(String[] args) {
        Month[] enumMonths = Month.values();
        for (int i = 0; i < enumMonths.length; i++) {
            Month month = enumMonths[i];
            System.out.print(month.name() + " ");
            if (month.name().endsWith("Y")) {
                System.out.println("ends with y");
            } else {
                System.out.println("doesn't end with y");
            }
        }
    }
}