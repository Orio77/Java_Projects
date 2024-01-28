package java_8_streams_api.problem5.additional_problems;

import java.util.Random;
import java.util.stream.IntStream;

public class problem2 {
    public static void main(String[] args) {
        
        Random random = new Random();

        IntStream numberStream = random.ints(100, 1, 100);

        numberStream.map(number -> number * 2)
                    .average()
                    .ifPresent(avg -> System.out.println(avg));
                    
    }
}
