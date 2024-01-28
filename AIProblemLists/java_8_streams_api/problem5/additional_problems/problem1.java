package java_8_streams_api.problem5.additional_problems;

import java.util.Random;
import java.util.stream.IntStream;

public class problem1 {
    public static void main(String[] args) {
        Random random = new Random();
        
        IntStream numberStream = random.ints(50, 1, 100);

        System.out.println(numberStream.sum());
    }
}
