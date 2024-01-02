package java_8_streams_api.problem6.additional_problems.addproblem1;

import java.util.stream.IntStream;

public class Problem1SequentialNumberStream {
    public static void main(String[] args) {
        // Initialize a stream of the first 15 sequential numbers
        IntStream numbers = IntStream.rangeClosed(1, 15);

        // TODO: Filter out the odd numbers from the stream and Sum the remaining even numbers
        int sum = numbers.filter(n -> n % 2 == 0)
                            .sum();

        System.out.println(sum);
    }
}
