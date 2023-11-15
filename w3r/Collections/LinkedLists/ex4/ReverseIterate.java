package Collections.LinkedLists.ex4;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseIterate {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

        revIteration(list);
        
    }

    public static void revIteration(LinkedList<Integer> linkedList) {
        
        Collections.reverse(linkedList);

        for (Integer integer : linkedList) {
            System.out.print(integer + ", ");
        }
    }
}


//4. Write a Java program to iterate a linked list in reverse order.
