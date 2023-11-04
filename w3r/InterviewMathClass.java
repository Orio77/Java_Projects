import java.util.*;

public class InterviewMathClass {
    
    //Print all the comparsions of two numbers
    public static void printComparsion(int number_1, int number_2) {

        if (number_1 == number_2)
            System.out.println(number_1 + " = " + number_2);
        if (number_1 != number_2)
            System.out.println(number_1 + " != " + number_2);
        if (number_1 >= number_2)
            System.out.println(number_1 + " >= " + number_2);
        if (number_1 <= number_2)
            System.out.println(number_1 + " <= " + number_2);
        if (number_1 < number_2)
            System.out.println(number_1 + " < " + number_2);
        if (number_1 > number_2)
            System.out.println(number_1 + " > " + number_2);
    }

    //Add digits of the number
    public static int add(int number_1) {

        int sum = 0;
        int digitToAdd;

        while (number_1 > 0) {
            digitToAdd = number_1 % 10;
            sum = sum + digitToAdd;
            number_1 = number_1 / 10;
        }

        return sum;
    }

    //Calculate the Area of a Hexagon | Scanner
    public static void calculateHexArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a length of a side: ");
        int length = sc.nextInt();

        double area = (6 * length^2)/(4*Math.tan(Math.PI/6));
        
        System.out.println("Area of the hexagon is: " + area);
    }

}
