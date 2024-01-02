package collections.problem16;

import java.util.*;

public class Problem16UsingListIterator {
    public static void main(String[] args) {
        // Initialize a List of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Initialize the number to be replaced and the number to replace with
        int numberToReplace = 5;
        int numberToReplaceWith = 50;

        // TODO: Use a ListIterator to traverse the list in both directions 
        // and replace all occurrences of 'numberToReplace' with 'numberToReplaceWith'

        //create iterator
        ListIterator<Integer> iterator = numbers.listIterator();

        //iterate
        while (iterator.hasNext()) {
            if (iterator.next() == numberToReplace)
                iterator.set(numberToReplaceWith);
        }

        //print the list and prepare it for reversed iteration

        System.out.println(numbers);
        numberToReplace = 50;
        numberToReplaceWith = 5;

        //reverse iterate
        while (iterator.hasPrevious()) {
            if (iterator.previous() == numberToReplace)
                iterator.set(numberToReplaceWith);
        }
        System.out.println(numbers);
    }
}
