package java_8_streams_api.problem12.prepare_problems;

import java.util.stream.IntStream;

// Problem 12.2: Stream Reduction with Sum

public class StreamReductionWithSum {
    public static void main(String[] args) {
        // Initialize a Stream of Integer objects.
        IntStream ints = IntStream.range(0, 1000);
        // Use Java streams and reduction to calculate the sum of all integers.
        int sum = ints.reduce(0, (a, b) -> a + b);
        // Print the sum to the console.
        System.out.println(sum);
    }
}
