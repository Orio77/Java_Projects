package Learn_OOP_in_Java.Challenge_1_4;

public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator(12354, 36346);

        System.out.println(obj.add());
        System.out.println(obj.substract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}
