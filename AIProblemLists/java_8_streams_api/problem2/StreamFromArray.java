package java_8_streams_api.problem2;

import java.util.Arrays;

public class StreamFromArray {
    public static void main(String[] args) {
        // Initialize the array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // TODO: Create a stream from this array and calculate the sum of all elements

        int sum = Arrays.stream(numbers)
                        .sum();

        System.out.println(sum);
    }
}
