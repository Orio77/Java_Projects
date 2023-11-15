package Collections.ArrayLists;

import java.util.*;

public class AL_Tools {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        LinkedList<Integer> myLinkedList = new LinkedList<>();
    }
    
    public static void fillArrayList(ArrayList<Integer> arrayList) {

        for (int i = 1; i <= 20; i++) {
            arrayList.add(i);
        }
    }

    public static void fillLinkedList(LinkedList<Integer> linkedList) {

        for (int i = 1; i <= 20; i++) {
            linkedList.add(i);
        }
    }


}
