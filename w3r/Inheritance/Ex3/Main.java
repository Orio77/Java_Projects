package Inheritance.Ex3;

public class Main {
    public static void main(String[] args) {
        
        Rectangle kwadrat = new Rectangle();

        int areaa = kwadrat.getArea(20, 50);
        System.out.println(areaa);
    }
}



/*
3. Write a Java program to create a class called Shape with a method called getArea(). 
Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
 */