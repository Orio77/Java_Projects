package Collections.LinkedLists.ex1;

import java.util.LinkedList;

public class appendAtTheEnd {
    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();

        for (int i = 1; i <= 20; i++) {
            myList.add(i);
        }

        myList.add(21);

        System.out.println(myList);
        
    }
}


//Write a Java program to append the specified element to the end of a linked list.
