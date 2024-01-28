package java_8_streams_api.problem6;

import java.util.stream.Stream;

public class Problem6StreamFromFunction {
    public static void main1(String[] args) {
        // Initialize the first two numbers of the Fibonacci sequence
        int num1 = 0, num2 = 1;

        // TODO: Create a stream from a function that generates the Fibonacci sequence
        runFibonacci(num1, num2, 10);
        

        // TODO: Print the first 10 numbers in the sequence
    }

    public static void runFibonacci(int num1, int num2, int bound) {
        int next = 0;

        int i = 0;

        while (i < bound) {
            next = num1 + num2;
            num1 = num2;
            num2 = next;
        }

    }

    public static void main(String[] args) {
        

        Stream.iterate(new int[]{1, 0}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(System.out::println);
    }
}
