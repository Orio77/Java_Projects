package lambda_expressions.problem8;

import java.util.Arrays;
import java.util.List;

// Java

public class Problem8 {
    public static void main(String[] args) {
        // Initialize the list of integers as described in the problem statement
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        FunctionalInterface it = (nums -> nums.stream().filter(ints -> ints >= 5).map(ints -> ints*3).mapToInt(Integer::intValue).average().getAsDouble());

        System.out.println(it.operations(numbers));
        // TODO: Write a lambda expression that takes a list of integers, filters out numbers less than 5, 
        // multiplies the remaining numbers by 3, and then returns the average of the resulting numbers.
    }
}
