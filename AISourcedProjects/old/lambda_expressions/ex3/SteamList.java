package ex3;

import java.util.Arrays;
import java.util.List;

public class SteamList {
    public static void main(String[] args) {
        
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6 , 7, 8, 9);

        intList.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}
