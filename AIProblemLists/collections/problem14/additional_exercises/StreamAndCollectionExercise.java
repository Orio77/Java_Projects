package collections.problem14.additional_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndCollectionExercise {

    public static void main(String[] args) {
        // Initialize a list of numbers
        List<Integer> numbers = Arrays.asList(5, 3, 12, 7, 8, 9, 2, 1, 10, 4, 6);

        // TODO: Perform operations using Streams (like filtering, sorting)
        List<Integer> unmodifiableNumber = numbers.stream().sorted().filter(n -> n > 10).collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableNumber);

        // TODO: Convert the result to an unmodifiable collection

        // TODO: Illustrate the difference between the stream operations and the final unmodifiable collection
        try {
            unmodifiableNumber.add(7);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}