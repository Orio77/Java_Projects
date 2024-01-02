package lambda_expressions.problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3LambdaEvenNumbers {
    public static void main(String[] args) {
        // Initialize a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // TODO: Write a lambda expression that takes a list of integers and returns a new list containing only the even numbers

        FunctionalInterface lambda = (l -> l.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));

        System.out.println(lambda.even(numbers));
    }
}
