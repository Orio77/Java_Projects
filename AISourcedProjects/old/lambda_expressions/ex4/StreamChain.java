package ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChain {
    public static void main(String[] args) {
        
        List<String> stringNumbers = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> streamList = stringNumbers.stream()
        .map(n -> Integer.parseInt(n))
        .filter(n -> n % 2 == 0)
        .map(n -> n * n)
        .collect(Collectors.toList());

        System.out.println(streamList);
    }
}
