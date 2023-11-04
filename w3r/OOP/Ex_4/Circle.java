package OOP.Ex_4;

public class Circle {
    private int radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double calculateCircumference() {
        return 2 * radius * Math.PI;
    }
}
