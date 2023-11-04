package Inheritance.Ex8;

public class Main {
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(17);

        System.out.println("Area: " + circle1.getArea() + " " + "Perimeter: " + circle1.getPerimeter());
    }
}



/*
8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
 */
