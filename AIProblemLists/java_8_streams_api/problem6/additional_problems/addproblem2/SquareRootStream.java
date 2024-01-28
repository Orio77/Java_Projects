package java_8_streams_api.problem6.additional_problems.addproblem2;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class SquareRootStream {
    public static void main(String[] args) {
        
        IntStream intStream = IntStream.rangeClosed(1, 10);

        OptionalDouble avg = intStream.map(n -> (int) Math.sqrt(n))
                                                            .average();

        System.out.println(avg);
    }
}
