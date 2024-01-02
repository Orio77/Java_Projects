package collections.problem5;

import java.util.Iterator;
import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Stack<String> tasks = new Stack<>();
        tasks.push("Task 1");
        tasks.push("Task 2");
        tasks.push("Task 3");
        tasks.push("Task 4");
        tasks.push("Task 5");

        //Pop Push Peek
        tasks.pop();
        tasks.push("Task 10");
        System.out.println(tasks.peek());

        //Iteration
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
