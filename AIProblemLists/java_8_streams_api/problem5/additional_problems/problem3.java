package java_8_streams_api.problem5.additional_problems;

import java.util.Random;
import java.util.stream.IntStream;

public class problem3 {
    public static void main(String[] args) {
        
        Random random = new Random();

        IntStream numberStream = random.ints(100, 0, 100);

        numberStream.filter(n -> n >= 50)
                    .average()
                    .ifPresent(avg -> System.out.println(avg));
    }
}
