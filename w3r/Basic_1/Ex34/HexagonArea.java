package Basic_1.Ex34;

import java.util.Scanner;

public class HexagonArea {
    public static void calculateHexArea() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a length of a side: ");
            int length = sc.nextInt();

            double area = (6 * length^2)/(4*Math.tan(Math.PI/6));
            
            System.out.println("Area of the hexagon is: " + area);
        }
    }
}
