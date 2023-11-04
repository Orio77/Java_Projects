package OOP.Ex_4;


public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(8);
        Circle circle2 = new Circle();

        System.out.println(circle1.getClass());
        System.out.println(circle1.getRadius());
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculateCircumference());
        circle1.setRadius(4);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculateCircumference());
        System.out.println();
        System.out.println(circle2.getClass());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.calculateArea());
        System.out.println(circle2.calculateCircumference());
        circle2.setRadius(10);
        System.out.println(circle2.calculateArea());
        System.out.println(circle2.calculateCircumference());

    }
}


/*4. Write a Java program to create a class called "Circle" with a radius attribute. 
You can access and modify this attribute. Calculate the area and circumference of the circle. */