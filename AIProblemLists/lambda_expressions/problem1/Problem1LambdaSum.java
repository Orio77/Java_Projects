package lambda_expressions.problem1;

public class Problem1LambdaSum {
    public static void main(String[] args) {
        // Initialize two integers
        int num1 = 5;
        int num2 = 3;

        // TODO: Write a lambda expression that takes two integers as input and returns their sum

        FunctionalInterface interface1 = (n1, n2) -> n1 + n2;

        System.out.println(interface1.sum(num1, num2));
    }
}
