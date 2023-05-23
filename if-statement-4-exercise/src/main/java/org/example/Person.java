package org.example;

public class Person {
    public int age;

    public Person(int age) {
        int max=80,min=5;
        this.age=(int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public void getLifeStage() {
        System.out.print("The person is ");
        if(this.age<=12){
            System.out.println("Child");
        }else if((this.age >=13)&&(this.age <=19)) {
            System.out.printf("Teen");
        }else if((this.age >=20)&&(this.age <=599)){
            System.out.println("Adult");
        }else {
            System.out.println("Senior Adult");
        }
    }
}
