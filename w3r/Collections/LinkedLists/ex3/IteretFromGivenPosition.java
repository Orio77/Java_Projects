package Collections.LinkedLists.ex3;

import java.util.LinkedList;
import Collections.ArrayLists.AL_Tools;

public class IteretFromGivenPosition {
    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        AL_Tools.fillLinkedList(myLinkedList);

        int position = 10;

        for (int i = position; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
    }
}
