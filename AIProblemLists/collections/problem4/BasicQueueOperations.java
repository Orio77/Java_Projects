package collections.problem4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BasicQueueOperations {
    public static void main(String[] args) {
        
        //Tasks queue
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 4");
        tasks.add("Task 5");

        //Add and Remove operations
        tasks.add("Task 6");
        tasks.remove();

        //Peek
        System.out.println(tasks.peek());

        //Iteration
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
