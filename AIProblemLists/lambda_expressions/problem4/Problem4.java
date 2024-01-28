package lambda_expressions.problem4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Java

public class Problem4 {
    public static void main(String[] args) {
        // Initialize the list of strings as described in the problem statement
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript");

        FunctionalInterface it = (l -> {
            l.sort(Comparator.naturalOrder());
            return l;
        });

        System.out.println(it.alphabeticalSort(languages));
    }
}
