package ex2;
import java.util.function.Predicate;

public class TestIfEven {
    
    public static void main(String[] args) {
        
        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        boolean result = isEven.test(6);

        System.out.println(result);
    }
}
