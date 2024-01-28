package lambda_expressions.problem5;

import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        // Initialize the list of integers as described in the problem statement
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        FunctionalInterface it = (intList -> intList.stream().mapToInt(Integer::intValue).sum());

        System.out.println(it.sum(numbers));
    }
}