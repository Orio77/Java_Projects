package collections.problem6;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class BasicDequeOperations {
    public static void main(String[] args) {
        Deque<String> tasks = new LinkedList<>();
        tasks.addFirst("Task 1");
        tasks.addLast("Task 2");
        tasks.addFirst("Task 3");
        tasks.addLast("Task 4");
        tasks.addFirst("Task 5");

        // Section for adding elements to the deque
        tasks.add("Task 10");

        // Section for removing elements from the deque
        tasks.remove();

        // Section for peeking elements from the deque
        System.out.println(tasks.peek());

        // Section for iterating over the deque and printing each task
        Iterator<String> iterator = tasks.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
