package collections.problem14;

// Java
import java.util.*;

public class CollectionsUnmodifiable {
    public static void main(String[] args) {
        // Initialize the list of integers
        List<Integer> integerList = new ArrayList<>();
        // Add integers to the list
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        // TODO: Create an unmodifiable view of this list

        //One cannot change the Stream or it's source (at least it's very not recommended to do so) during runtime
        //So in a way, this is an unmodifiable view of lists elements
        integerList.stream()
                    .forEach(System.out::println);


        //Correct solution
        List<Integer> unmodifiableList = Collections.unmodifiableList(integerList);
        System.out.println(unmodifiableList);
    }
}
