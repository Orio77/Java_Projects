package VeryEasy;

import java.util.List;
import java.util.stream.Collectors;

public class SquarredList {
    public static List<Integer> square(List<Integer> numberList) {
        return numberList.stream()
                    .map(n -> n * n)
                    .collect(Collectors.toList());
    }
}