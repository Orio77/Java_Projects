package Learn_OOP_in_Java.Challenge_2_1;

public class Rectangle {
    
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double getArea() {
        System.out.println(area());
        return area();
    }
}



