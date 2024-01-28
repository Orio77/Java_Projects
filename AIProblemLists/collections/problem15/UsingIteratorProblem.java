package collections.problem15;

import java.util.*;

public class UsingIteratorProblem {

    public static void main(String[] args) {
        // Initialize a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> nums = Arrays.asList(10, 4, 2, 8, 6, 5, 3, 7, 1, 9);
        numbers.addAll(nums);

        // TODO: Create an Iterator for the list

        Iterator<Integer> iterator = numbers.iterator();

        // TODO: Traverse the list using the Iterator and remove elements that are less than 5

        while (iterator.hasNext()) {
            if (iterator.next() < 5)
                iterator.remove();
        }

        System.out.println(numbers);
    }
}
