package Inheritance.Ex2;

public class Vehicle {
    public static void main(String[] args) {

        Car Lambo = new Car();
        Vehicle FourWheel = new Vehicle();

        FourWheel.drive();
        Lambo.drive();
    }

    public void drive() {
        System.out.println("Repairing a car");
    }
}






/*
2. Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car that overrides the drive() method to print "Repairing a car".
 */
