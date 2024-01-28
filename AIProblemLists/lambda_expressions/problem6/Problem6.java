package lambda_expressions.problem6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Java

public class Problem6 {
    public static void main(String[] args) {
        // Initialize the list of integers as described in the problem statement
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        FunctionalInterface it = (intList -> intList.stream().filter(number -> number % 2 == 0).map(number -> number*number).collect(Collectors.toList()));

        // TODO: Write a lambda expression that takes a list of integers, filters out the odd numbers, 
        // squares the remaining even numbers, and then returns the sum of the squares.

        System.out.println(it.squareEven(numbers));
    }
}
