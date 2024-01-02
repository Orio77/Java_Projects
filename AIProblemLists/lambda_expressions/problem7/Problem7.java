package lambda_expressions.problem7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem7 {
    public static void main(String[] args) {
        // Initialize the list of strings as described in the problem statement
        List<String> fruits = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");

        FunctionalInterface it = (strList -> strList.stream().filter(word -> !word.startsWith("a")).map(word -> word.toUpperCase()).collect(Collectors.toList()));

        System.out.println(it.no_a_CapsAll(fruits));
    }
}
