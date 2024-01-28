package Inheritance.Ex8;
import java.lang.Math;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return Math.round(2 * radius * Math.PI);
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }
}