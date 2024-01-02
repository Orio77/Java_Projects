package lambda_expressions.problem2;

public class Problem2LambdaStringLength {
    public static void main(String[] args) {
        // Initialize a string
        String inputString = "Hello World";

        FunctionalInterface string = (s -> s.length());

        System.out.println(string.length(inputString));
    }
}