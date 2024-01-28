package Collections.LinkedLists.ex2;

import java.util.LinkedList;

public class IterateThroughLinkedList {
    public static void main(String[] args) {
        
        LinkedList<Integer> newList = new LinkedList<>();

        for (int i = 1; i <= 20; i++) {
            newList.add(i);
        }

        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }
}


//2. Write a Java program to iterate through all elements in a linked list.
