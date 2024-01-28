package OOP.Ex_3;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double calculateArea() {

        double area = width * height;

        return area;
    }

    public double calculatePerimeter() {

        double perimeter = (2 * width) + (2 * height);
        
        return perimeter;
    }
}
