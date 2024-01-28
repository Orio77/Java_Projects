package ex6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        
        //LEVEL 1
        ReturnSum sum = (n1, n2) -> n1 + n2;
        System.out.println(sum.sum(7, 5));

        //LEVEL 2
        Consumer<Integer> consumer = (n) -> System.out.println(n);
        consumer.accept(20);

        //LEVEL 3
        Function<String, Integer> function = (s) -> s.length();
        System.out.println(function.apply("That was level 3"));

        //LEVEL 4
        doubleLambda("That was Level 4");

        //LEVEL 5
        Predicate<String> isEmpty = (s) -> s.isEmpty();
        System.out.println(isEmpty.test(""));

        //LEVEL 6
        Prime primeFunction = (n) -> {
            if (n < 1)
                return false;

            for (int i = 0; i < Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }

            return true;
        };
        
        System.out.println(primeFunction.isPrime(17));

        //LEVEL 7

        List<String> lisOfStrings = Arrays.asList("Dog", "", "", "Cat", "Parrot", "");

        lisOfStrings.stream()
                    .filter(isEmpty)
                    .map(s -> s.toUpperCase())
                    .forEach(System.out::println);
        
        
        //LEVEL 8
        /*Level 8: Advanced Stream Processing

Create a list of integers.
Use a stream to find the first prime number in the list and print it. */

    }

    public static String doubleLambda(String string) {

        Lambda_4_1 lambda41 = (s) -> s.toUpperCase();
        Lambda_4_2 lambda42 = (s) -> s.charAt(0);

        String returnString = string;

        lambda41.toUpperCase(returnString);
        lambda42.first(returnString);

        return returnString;
    }
}
