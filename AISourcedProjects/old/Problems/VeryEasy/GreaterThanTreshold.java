package VeryEasy;

import java.util.List;

public class GreaterThanTreshold {
    public static int lambda(List<Integer> nums, int treshold) {
        
        long result =  nums.stream()
                            .filter(n -> n > treshold)
                            .count();

        return (int) result;
    }
}
