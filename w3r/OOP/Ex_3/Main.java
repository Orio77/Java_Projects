package OOP.Ex_3;

public class Main {
    public static void main(String[] args) {

        Rectangle square = new Rectangle(20, 20);
        Rectangle myRectangle = new Rectangle(5, 40);

        System.out.print("Area of the square is: ");
        System.out.println(square.calculateArea());
        System.out.print("Perimeter of the square is: ");
        System.out.println(square.calculatePerimeter());
        System.out.println();
        System.out.print("Area of the rectangle is: ");
        System.out.println(myRectangle.calculateArea());
        System.out.print("Perimeter of the rectangle is: ");
        System.out.println(myRectangle.calculatePerimeter());

    }
}


//3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
