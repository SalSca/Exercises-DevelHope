package org.example;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Salvo","Scalisi","via giovanni V. 10");
        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();

        Employee employee2 = new Employee("Maria","Filippa","via roma 21");
        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();
    }
}