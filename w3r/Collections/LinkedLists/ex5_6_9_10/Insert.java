package Collections.LinkedLists.ex5_6_9_10;

import java.util.LinkedList;

public class Insert {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        // insert(list, 10, 99);
        // System.out.println(list);

        // addFirstLast(list, 0, 0);
        // System.out.println(list);

        // int[] array1 = {1, 2, 3};
        // addElements(list, 4, array1);
        // System.out.println(list);

        checkForElement(list, 6);

    }

    //5. Write a Java program to insert the specified element at the specified position in the linked list.
    static void insert(LinkedList<Integer> list, int index, int element) {
        list.add(index, element);
    }

    //6. Write a Java program to insert elements into the linked list at the first and last positions.
    static void addFirstLast(LinkedList<Integer> list, int firstElement, int lastElement) {
        list.addFirst(firstElement);
        list.addLast(lastElement);
    }

    //9. Write a Java program to insert some elements at the specified position into a linked list.
    static void addElements(LinkedList<Integer> list, int index, int[] elements) {

        for (int i = 0; i < elements.length; i++) {
            list.add(index, elements[i]);
        }
    }

    //10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    static void checkForElement(LinkedList<Integer> list, int element) {

        int firstOccurance = 0;
        int lastOccurance = 0;

        for (int i = 0; i <= list.size(); i++) {
            if (list.get(i) == element) {
                firstOccurance = i + 1;
                break;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == element) {
                lastOccurance = i + 1;
                break;
            }
        }

        if (firstOccurance != 0 && lastOccurance != 0) {

            System.out.println("First occurance at: " + firstOccurance);
            System.out.println("Last occurance at: " + lastOccurance);
        }

        if (firstOccurance == 0 && lastOccurance == 0) {
            System.out.println("Element not found");
        }
        else if (firstOccurance == 0 || lastOccurance == 0) {
           System.out.println("Only one occurance at: " + (firstOccurance == 0 ? lastOccurance : firstOccurance)); 
        }
        
    }
}



