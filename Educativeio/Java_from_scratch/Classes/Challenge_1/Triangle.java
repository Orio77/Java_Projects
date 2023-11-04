package Java_from_scratch.Classes.Challenge_1;

public class Triangle extends Shape{

    private int length;
    private int height;
    
    public Triangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length*height*0.5;
    }
}
