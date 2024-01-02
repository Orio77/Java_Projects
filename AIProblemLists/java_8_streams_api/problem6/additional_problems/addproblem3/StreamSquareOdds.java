package java_8_streams_api.problem6.additional_problems.addproblem3;

import java.util.stream.IntStream;

public class StreamSquareOdds {
    public static void main(String[] args) {
        
        IntStream intStream = IntStream.range(1, 21);

        int sum = intStream.filter(n -> n % 2 == 0)
                           .map(n -> (int )Math.sqrt(n))
                           .sum();

        System.out.println(sum);
    }
}
